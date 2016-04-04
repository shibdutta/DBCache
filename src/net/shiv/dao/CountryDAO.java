package net.shiv.dao;

import net.shiv.cashesystem.Cache;
import net.shiv.dto.BaseDTO;

public class CountryDAO implements DAOLayer{

	Cache cache;
	@Override
	public BaseDTO query (Integer pk)
	{
		cache = Cache.getInstance();
		
		BaseDTO row = cache.queryARow("REF_HOLIDAY", pk);
		
		return row;
	}

	@Override
	public void insertRow(BaseDTO vo) {
		cache = Cache.getInstance();
		
		cache.insertARow("REF_HOLIDAY", vo);
	}
	
}
