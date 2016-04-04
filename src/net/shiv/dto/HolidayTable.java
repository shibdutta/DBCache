package net.shiv.dto;

import java.sql.ResultSet;
import java.sql.SQLException;

public class HolidayTable implements BaseDTO {

	Integer id;
	Integer holiday_ID;

	String holiday_cd;

	String holiday_name;

	String holiday_dt;

	Integer status_ind;
	String Last_modify_dt;

	Integer Modify_person_num;
	
	@Override
	public void populateObject(ResultSet rs) {

		try {
			id = rs.getInt(1);
			holiday_ID = rs.getInt(2);
			holiday_cd =  rs.getString(3);
			holiday_name = rs.getString(4);
			holiday_dt = rs.getString(5);
			status_ind = rs.getInt(6);
			Last_modify_dt = rs.getString(7);
			Modify_person_num = rs.getInt(8);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Integer getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public Integer getHoliday_ID() {
		return holiday_ID;
	}

	public void setHoliday_ID(Integer holiday_ID) {
		this.holiday_ID = holiday_ID;
	}

	public String getHoliday_cd() {
		return holiday_cd;
	}

	public void setHoliday_cd(String holiday_cd) {
		this.holiday_cd = holiday_cd;
	}

	public String getHoliday_name() {
		return holiday_name;
	}

	public void setHoliday_name(String holiday_name) {
		this.holiday_name = holiday_name;
	}

	public String getHoliday_dt() {
		return holiday_dt;
	}

	public void setHoliday_dt(String holiday_dt) {
		this.holiday_dt = holiday_dt;
	}

	public Integer getStatus_ind() {
		return status_ind;
	}

	public void setStatus_ind(Integer status_ind) {
		this.status_ind = status_ind;
	}

	public String getLast_modify_dt() {
		return Last_modify_dt;
	}

	public void setLast_modify_dt(String last_modify_dt) {
		Last_modify_dt = last_modify_dt;
	}

	public Integer getModify_person_num() {
		return Modify_person_num;
	}

	public void setModify_person_num(Integer modify_person_num) {
		Modify_person_num = modify_person_num;
	}

}
