package com.location26.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location26.entity.LocationEntity;
import com.location26.repository.LocationRepository;

@Service
public class LocationServicesImp implements LocationService {
	
	@Autowired
	LocationRepository locationRepo;
	
	@Override
	public void dataSave(LocationEntity locations) {
		
		locationRepo.save(locations);
	}

	@Override
	public List<LocationEntity> getAllLocations() {
		List<LocationEntity> locationList = locationRepo.findAll();
		return locationList;
	}

	@Override
	public void deleteData(int id) {
		locationRepo.deleteById(id);
		
	}

	@Override
	public LocationEntity updateData(int id) {
		Optional<LocationEntity> findById = locationRepo.findById(id);
		LocationEntity locations = findById.get();
		return locations;
	}

}
