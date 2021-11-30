package com.vmware.carDataBase.contrlr;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.vmware.carDataBase.carRepo.CarRepo;
import com.vmware.carDataBase.service.CarRepSer;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RestController

public class CarDBCntrlr {
	@Autowired
	CarRepo carRep;
	
	@Autowired
	CarRepSer carRepSer;
	
	@RequestMapping("/hi")		
	public List<CarReqDet> test() {
		
		System.out.println("control is here ");
		//List<CarReqDet> userDet = carRep.findAll();
		List<CarReqDet> userDet = carRep.findAll();
		
		//RestTemplate  resttemp = new RestTemplate();
		//CarReqDet carReq =	resttemp.getForObject("https://localhost:8081/home", CarReqDet.class);
		//return carReq;
		return userDet;
	}	
	
	@RequestMapping("/hi/save")		
	public void saving(@RequestBody CarReqDet carReq, UriComponentsBuilder builder ) {
		
		System.out.println("control is here in saving");
		//List<CarReqDet> userDet = carRep.findAll();
		carRep.save(carReq);
		
		//RestTemplate  resttemp = new RestTemplate();
		//CarReqDet carReq =	resttemp.getForObject("https://localhost:8081/home", CarReqDet.class);
		//return carReq;
		
	}
	
	@RequestMapping("hi/find/{var}")
	public List<CarReqDet> findit(@PathVariable("var") String var) {	
		
		List<CarReqDet> userDet = carRepSer.findDet(var);
				//find(query, CarReqDet.class, Coll);
				
		return userDet;
	}
		
	
	@RequestMapping("/hi/name/{firstName}")
	public List<CarReqDet> findingOne(@PathVariable("firstName") String firstName) {		
		System.out.println("control is here ");
		System.out.println(firstName);
		
		List<CarReqDet> userDet = carRep.findByFirstName(firstName);
		System.out.println("no exp ");
		System.out.println(userDet);
		//RestTemplate  resttemp = new RestTemplate();
		//CarReqDet carReq =	resttemp.getForObject("https://localhost:8081/home", CarReqDet.class);
		//return carReq;
		return userDet;
	}	

	@RequestMapping("/hi/des/{designation}")
	public List<CarReqDet> findingDes(@PathVariable("designation") String designation) {		
		System.out.println("control is here des");
		System.out.println(designation);
		//List<CarReqDet> userDet = carRep.findAll();
		List<CarReqDet> userDet = carRep.findByDesignation(designation);
		System.out.println("no exp des");
		System.out.println(userDet);
		//RestTemplate  resttemp = new RestTemplate();
		//CarReqDet carReq =	resttemp.getForObject("https://localhost:8081/home", CarReqDet.class);
		//return carReq;
		return userDet;
	}	
}
