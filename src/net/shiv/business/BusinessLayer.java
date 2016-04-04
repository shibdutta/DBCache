package net.shiv.business;

import net.shiv.dao.CountryDAO;
import net.shiv.dao.CurrencyDAO;
import net.shiv.dao.DAOLayer;
import net.shiv.dto.BaseDTO;
import net.shiv.dto.CurrencyTable;

public class BusinessLayer {

	public static void main(String[] args) {
		
		DAOLayer dao = new CountryDAO();
		
		System.out.println(dao.query(2));
		
		dao = new CurrencyDAO();
		
		CurrencyTable vo = new CurrencyTable();
		vo.setCurr_id(54);
		vo.setCurr_cd("ed");
		vo.setCurr_name("CAD");
		vo.setCurrency_symbol("$");
		vo.setLast_modify_dt("2016-2-03");
		vo.setStatus_ind(34);
		vo.setModify_person_num(34);
		
		dao.insertRow(vo);
		
		System.out.println(dao.query(1));
		System.out.println(dao.query(3));
		
		dao = new CountryDAO();
		
		System.out.println(dao.query(2));
		
		
		
		System.out.println(new CurrencyDAO().query(3));
		
		
		}

}
