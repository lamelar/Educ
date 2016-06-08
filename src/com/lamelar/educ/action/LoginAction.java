/**
 * 
 */
package com.lamelar.educ.action;

import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.lamelar.educ.dao.LoginDAO;
import com.lamelar.educ.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author hideki
 *
 */
public class LoginAction extends ActionSupport implements SessionAware {

	private String name;
	private String password ;
	private Map<String, Object> session ;
	

	public String execute() {  

	String ret = ERROR;

	LoginDAO dao = new LoginDAO() ;   
	LoginDTO dto = new LoginDTO() ; 

	dto = dao.select(name,password);

	String dtoName = dto.getName(); 
	String dtoPassword = dto.getPassword() ;  

	if(name.equals(dtoName)) {   
	if(password.equals(dtoPassword)){
	ret = SUCCESS;
	  }
	}
	session.put("name", dtoName);
	
	return ret;
	}
	@Override
	public void setSession(Map<String, Object> session) {
		this.session=session;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Map<String, Object> getSession() {
		return session;
	}
	
}

