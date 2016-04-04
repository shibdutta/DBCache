package net.shiv.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CurrencyTable  implements BaseDTO{

	Integer id;
	Integer curr_id;
	String curr_cd;
	String curr_name;
	String currency_symbol;
	Integer status_ind;
	String last_modify_dt;
	Integer modify_person_num;
	
	
	@Override
	public void populateObject(ResultSet rs) {
		try {
			id = rs.getInt(1);
			curr_id = rs.getInt(2);
			curr_cd = rs.getString(3);
			curr_name = rs.getString(4);
			currency_symbol = rs.getString(5);
			status_ind = rs.getInt(6);
			last_modify_dt = rs.getString(7);
			modify_person_num = rs.getInt(8);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Integer getId() {
		return id;
	}

	public Integer getCurr_id() {
		return curr_id;
	}

	public void setCurr_id(Integer curr_id) {
		this.curr_id = curr_id;
	}

	public String getCurr_cd() {
		return curr_cd;
	}

	public void setCurr_cd(String curr_cd) {
		this.curr_cd = curr_cd;
	}

	public String getCurr_name() {
		return curr_name;
	}

	public void setCurr_name(String curr_name) {
		this.curr_name = curr_name;
	}

	public String getCurrency_symbol() {
		return currency_symbol;
	}

	public void setCurrency_symbol(String currency_symbol) {
		this.currency_symbol = currency_symbol;
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

	public void setModify_person_num(Integer modify_person_num) {
		this.modify_person_num = modify_person_num;
	}

	@Override
	public String toString()
	{
		return "Currency Table----> " + 
				" ID(PK): " + id + 
				" Currency ID:" + curr_id +
				" Currency Symbol:" + currency_symbol +
				" Currency Name: " + curr_name;
	}
	
}
