/**
 * 
 */
package com.internousdev.educ.action;

import com.internousdev.educ.dao.ContactUsDAO;
import com.opensymphony.xwork2.ActionSupport;

/**
 * @author hideki kato
 *
 */
public class ContactUsAction extends ActionSupport{
	
	private String name;
	private String comment;
	
	public String execute(){
		String result = ERROR;
		ContactUsDAO dao = new ContactUsDAO();
		boolean isResult = dao.insert(name, comment);
		if(isResult){
			result = SUCCESS;
		}
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
}
