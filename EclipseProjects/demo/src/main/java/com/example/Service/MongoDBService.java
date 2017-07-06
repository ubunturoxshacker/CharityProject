package com.example.Service;

import org.springframework.stereotype.Service;

import com.example.DAO.MongoDbDao;
import com.example.Model.UserDTO;

@Service
public class MongoDBService {
   
	private UserDTO userDTO;
	private MongoDbDao dbDao;
	private boolean flag=false;
	public  UserDTO getUserDTO(){
	  //get values from DB using dbDao reference and then set the values and return
	   userDTO.setUsername(" ");
	   userDTO.setPassword(" ");
	   return userDTO;
	   
	}
	public boolean check(String uname,String pword){
		
		if(userDTO.getUsername().equals(uname) && userDTO.getPassword().equals(pword)){
			flag=true;
		}
		else
			flag=false;
		return flag;
		
	}
}
