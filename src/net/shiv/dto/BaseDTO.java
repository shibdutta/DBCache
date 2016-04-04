/**
 * 
 */
package net.shiv.dto;

import java.sql.ResultSet;

/**
 * @author Shibashis Dutta
 *
 */
public interface BaseDTO {

	public void populateObject(ResultSet rs);
	
	public Integer getId();
	
}
