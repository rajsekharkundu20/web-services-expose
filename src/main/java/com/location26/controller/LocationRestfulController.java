package com.location26.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location26.entity.LocationEntity;
import com.location26.repository.LocationRepository;

@RestController
@RequestMapping("/location/api1")
public class LocationRestfulController {

	@Autowired
	private LocationRepository locationRepo;
	
	@GetMapping
	public List<LocationEntity> getLocations(){
		
		List<LocationEntity> location = locationRepo.findAll();
		return location;
	}
	
	@PostMapping
	public void saveLocation(@RequestBody LocationEntity location) {
		
		locationRepo.save(location);
		
	}
	
	
}
