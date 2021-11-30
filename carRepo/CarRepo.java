package com.vmware.carprtl.carRepo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.vmware.carprtl.controller.CarReqDet;

public interface CarRepo extends MongoRepository<CarReqDet, String> {

}
