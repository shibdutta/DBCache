package net.shiv.dao;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

import net.shiv.dto.CountryTable;

public class TestCountryDAO {

	@Test
	public void testCountryDAOSuccess()
	{
		CountryDAO cd = new CountryDAO();
		
		CountryTable row = (CountryTable)cd.query(1);  //where id is 1
		
		CountryTable row2 = (CountryTable)cd.query(1);  //where id is 1
		
		
		assertEquals(row.getId(),new Integer(1));
		
	}
	@Test
	public void testCountryDAOFail()
	{
		CountryDAO cd = new CountryDAO();
		
		CountryTable row = (CountryTable)cd.query(1);  //where id is 1
		
		//assertThat(row.getId(),new Integer(2));
		
	}
}
