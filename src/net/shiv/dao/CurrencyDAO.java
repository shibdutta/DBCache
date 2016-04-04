package net.shiv.dao;

import net.shiv.cashesystem.Cache;
import net.shiv.dto.BaseDTO;
import net.shiv.dto.CurrencyTable;

public class CurrencyDAO implements DAOLayer{

	Cache cache;
	@Override
	public BaseDTO query (Integer pk)
	{
		 cache = Cache.getInstance();
		
		BaseDTO row = cache.queryARow("REF_CURRENCY", pk);
		
		return row;
	}
	
	@Override
	public void insertRow(BaseDTO currencyDTO)
	{
		cache = Cache.getInstance();
		
		cache.insertARow("REF_CURRENCY", currencyDTO);
	}
}
