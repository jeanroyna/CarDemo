package com.vmware.carDataBase.carRepo;

import java.util.List;

import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


import com.vmware.carDataBase.contrlr.CarReqDet;

@Repository
public interface CarRepo extends MongoRepository<CarReqDet, String> {
	
	List<CarReqDet> findByFirstName(String firstName);
	List<CarReqDet> findByDesignation(String designation);

	//List<CarReqDet> findByCarReqDetText(String firstName);
	//List<CarReqDet> find(Query query, Class<CarReqDet> class1, String string);

}
