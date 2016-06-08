/**
 * 
 */
package com.internousdev.educ.dao;

import java.net.UnknownHostException;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;

/**
 * @author hideki
 *
 */
public class ContactUsDAO {
	public boolean insert(String name,String comment){
		boolean isResult = false;
		DB db = null;
		MongoClient mongo = null;
		
		try{
			mongo = new MongoClient("localhost",27017);
			db = mongo.getDB("educ");
			DBCollection colls = db.getCollection("contact");
			BasicDBObject input = new BasicDBObject();
			
			input.put("name", name);
			input.put("comment", comment);
			colls.insert(input);
			
			isResult = true;
		}
		catch(UnknownHostException e){
			e.printStackTrace();
		}finally{
			mongo.close();
		}
		
		return isResult;
	}
	
}
