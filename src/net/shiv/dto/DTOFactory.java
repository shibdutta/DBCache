package net.shiv.dto;

public class DTOFactory {

	
	public static BaseDTO getTableInstance (String tableName)
	{
		switch(tableName)
		{
		case "REF_COUNTRY": 
			return new CountryTable();
		case "REF_CURRENCY":
			return new CurrencyTable();
		case "REF_HOLIDAY":
			return new HolidayTable();
		default:
			return null;
		}
	}
	
	public static String getInsertStatement(String tableName, BaseDTO vo)
	{
		StringBuilder sb = new StringBuilder();
		sb.append("Insert into ");
		
		if (tableName.equals("REF_CURRENCY"))
		{
			CurrencyTable ct = (CurrencyTable) vo;
			sb.append("REF_CURRENCY");
			sb.append("(curr_id, curr_cd, curr_name, currency_symbol, status_ind, last_modify_dt, modify_person_num) values(");
			
			sb.append(ct.getCurr_id());
			sb.append(",");
			sb.append("'" + ct.getCurr_cd() + "'");
			sb.append(",");
			sb.append("'" + ct.getCurr_name() + "'");
			sb.append(",");
			sb.append("'" + ct.getCurrency_symbol() + "'");
			sb.append(",");
			sb.append(ct.getStatus_ind());
			sb.append(",");
			sb.append("'" + ct.getLast_modify_dt() + "'");
			sb.append(",");
			sb.append(ct.getModify_person_num());		
			sb.append(")");
		}
		
		
		//System.out.println(sb);
		return sb.toString();
	}
	
}
