/**
 * 
 */
package net.shiv.cashesystem;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.ConcurrentHashMap;

import net.shiv.database.DataBaseConnectionFactory;
import net.shiv.dto.BaseDTO;
import net.shiv.dto.DTOFactory;

/**
 * @author Shibashis Dutta
 *
 */
public class Cache {

    Statement stmt = null;
    ConcurrentHashMap <String, ConcurrentHashMap <Integer, BaseDTO>> cachedTables;

    private static Cache cache = new Cache();
    
    public static Cache getInstance()
    {
    	return cache;
    }
	private Cache()
	{
		stmt = new DataBaseConnectionFactory("MYSQL").getStatement();
		cachedTables = new ConcurrentHashMap<String, ConcurrentHashMap<Integer, BaseDTO>>();
	}
	/*public void finalize()
	{
		new DataBaseConnectionFactory("MYSQL").closeStatement();
	}*/
	
	
	
	public boolean insertARow(String tableName, BaseDTO row)
	{
		String sql = DTOFactory.getInsertStatement(tableName, row);
		boolean success= false;
		
		try {
			stmt.execute(sql);
			success = true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return success;
	}
	
	public BaseDTO queryARow (String tableName, Integer pk)
	{
		boolean isPresentInCache = false;
		BaseDTO tableRow = DTOFactory.getTableInstance(tableName);
		//check cache object if the table value is already present 
		if(cachedTables.containsKey(tableName))
		{
			ConcurrentHashMap<Integer, BaseDTO> aTable = cachedTables.get(tableName);
			
			if(aTable.containsKey(pk))
			{
				System.out.println("----------------------------------Retrieving data from Cache*****");
				tableRow = aTable.get(pk);
				isPresentInCache = true;
			}
		}
		
		//if not present in Cache then go to DB to get the actual data
		if(!isPresentInCache)
		{
			String sql = "Select * from " + tableName + " where id = " + pk;
			
			//System.out.println(sql);
			//go to DB to get the value and then add it to Cache.
			try {
				System.out.println("----------------------------------Retrieving data from Database table++++");
				ResultSet rs = stmt.executeQuery(sql);
				
				if (rs.next())
				{
					tableRow.populateObject(rs);
					//now populate the cache object with the new value
					//if the table is already present in the cache object
					
					
					if(cachedTables.containsKey(tableName))
					{
						cachedTables.get(tableName).put(tableRow.getId(), tableRow);
					}
					//else if the the cache object does not even contain the table itself, (first time case)
					//Create that entry
					else
					{
						ConcurrentHashMap<Integer, BaseDTO> tableFirstTime = new ConcurrentHashMap<Integer, BaseDTO>();
						tableFirstTime.put(tableRow.getId(), tableRow);
						cachedTables.put(tableName, tableFirstTime);
					}
					
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}		
		}
		
		return tableRow;
	}

}
