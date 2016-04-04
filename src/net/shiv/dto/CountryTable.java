package net.shiv.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CountryTable  implements BaseDTO{

	//fields 
	Integer id;
	Integer country_ID;
	String country_cd;
	String country_name;
	Integer status_ind;
	String last_modify_dt;
	Integer modify_person_num;
	
	
	
	
	@Override
	public void populateObject(ResultSet rs)
	{
		//populate all the fields.
		try {
			id = rs.getInt(1);
			country_ID = rs.getInt(2);
			country_cd = rs.getString(3);
			country_name = rs.getString(4);
			status_ind = rs.getInt(5);
			last_modify_dt = rs.getString(6);
			modify_person_num = rs.getInt(7);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}






	public Integer getId() {
		return id;
	}






	public Integer getCountry_ID() {
		return country_ID;
	}






	public void setCountry_ID(Integer country_ID) {
		this.country_ID = country_ID;
	}






	public String getCountry_cd() {
		return country_cd;
	}






	public void setCountry_cd(String country_cd) {
		this.country_cd = country_cd;
	}






	public String getCountry_name() {
		return country_name;
	}






	public void setCountry_name(String country_name) {
		this.country_name = country_name;
	}






	public Integer getStatus_ind() {
		return status_ind;
	}






	public void setStatus_ind(Integer status_ind) {
		this.status_ind = status_ind;
	}






	public String getLast_modify_dt() {
		return last_modify_dt;
	}






	public void setLast_modify_dt(String last_modify_dt) {
		this.last_modify_dt = last_modify_dt;
	}






	public Integer getModify_person_num() {
		return modify_person_num;
	}






	public void setModify_person_num(Integer modify_peson_num) {
		this.modify_person_num = modify_peson_num;
	}




	@Override
	public String toString()
	{
		return "Country Table----> " + 
				" ID(PK): " + id + 
				" Currency ID:" + country_ID+
				" Currency Name: " + country_name;
	}
	
	
}
