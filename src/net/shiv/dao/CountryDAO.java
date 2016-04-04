package net.shiv.dao;

import net.shiv.cashesystem.Cache;
import net.shiv.dto.BaseDTO;

public class CountryDAO implements DAOLayer{

	
	@Override
	public BaseDTO query (Integer pk)
	{
		Cache cache = Cache.getInstance();
		
		BaseDTO row = cache.queryARow("REF_COUNTRY", pk);
		
		return row;
	}

	@Override
	public void insertRow(BaseDTO vo) {
		// TODO Auto-generated method stub
		
	}
	
}
