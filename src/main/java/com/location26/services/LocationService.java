package com.location26.services;

import java.util.List;

import com.location26.entity.LocationEntity;

public interface LocationService {
	
	public void dataSave(LocationEntity locations);

	public List<LocationEntity> getAllLocations();

	public void deleteData(int id);

	public LocationEntity updateData(int id);

}
