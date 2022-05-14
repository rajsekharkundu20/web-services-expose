package com.location26.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.location26.entity.LocationEntity;
import com.location26.repository.LocationRepository;

@RestController
@RequestMapping("/location/api")
public class LocationRestController {

	@Autowired
	private LocationRepository locationRepo;
	
	
	@GetMapping
	public List<LocationEntity> getLocations(){
		
		List<LocationEntity> locations = locationRepo.findAll();
		return locations;
	}
	@PostMapping
	public void saveJSONData(@RequestBody LocationEntity locations) {
		locationRepo.save(locations);
	}
	@PutMapping
	public void updateJSONData(@RequestBody LocationEntity locations) {
		locationRepo.save(locations);
	}
	@DeleteMapping("/delete/{id}")
	public void deleteJSONData(@PathVariable("id") int id) {
		locationRepo.deleteById(id);;
	}
	
	
	@GetMapping("/get/{id}")
	public LocationEntity getLocationById(@PathVariable("id") int id) {
		try {
			Optional<LocationEntity> findById = locationRepo.findById(id);
			LocationEntity locationEntity = findById.get();
			return locationEntity;
		}catch(Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
}
