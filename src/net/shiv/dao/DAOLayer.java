package net.shiv.dao;

import net.shiv.dto.BaseDTO;
import net.shiv.dto.CurrencyTable;

public interface DAOLayer {

	public  BaseDTO query (Integer pk);
	
	public void insertRow(BaseDTO vo);
	
	
}
