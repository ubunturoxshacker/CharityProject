package com.example.DAO;

import org.springframework.stereotype.Repository;

import com.mongodb.MongoClient;

@Repository
public class MongoDbDao { 
   private MongoClient mongoClient;
  public void dbreturn(){
	   mongoClient=new MongoClient("localhost",27017);
	   
  }
  
}
