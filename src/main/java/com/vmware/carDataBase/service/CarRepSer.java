package com.vmware.carDataBase.service;

import java.util.List;

import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.vmware.carDataBase.contrlr.CarReqDet;

@Service

public class CarRepSer {

	private final MongoTemplate mongoTemplate;
	
	public CarRepSer(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate ;
	}
	
	public List<CarReqDet> findDet(String var)
	{
		Query query = new Query();
		query.addCriteria(
		    Criteria.where("").orOperator(
		        Criteria.where("firstName").regex(var),
		        Criteria.where("lastName").regex(var),
		        Criteria.where("designation").regex(var),
		        Criteria.where("carType").regex(var),
		        Criteria.where("carName").regex(var)
		    )
		);

		List<CarReqDet> userDet = mongoTemplate.find(query, CarReqDet.class, "CarReqDet");
		return userDet;
	}
}
