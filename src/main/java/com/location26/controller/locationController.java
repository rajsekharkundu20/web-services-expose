package com.location26.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.location26.entity.LocationEntity;
import com.location26.services.LocationService;
import com.location26.utility.EmailService;

@Controller
public class locationController {
	
	@Autowired
	LocationService locationSer;
	
	@Autowired
	private EmailService emailService;
	
	//handler method
	@RequestMapping("/showPage")
	public String showLocationPage() {
		return "LocationPage";
	}
	
	
	//dto
	@RequestMapping("/saveLocationPage")
	public String locationData(@ModelAttribute("loc") LocationEntity locations, ModelMap model) {
		
		locationSer.dataSave(locations);
		emailService.sendSimpleMessage("rajsekharkundu5@gmail.com", "Location Data Save Confirmation", "Welcome");
		model.addAttribute("msg","Location Data Save");
		return "LocationPage";
		
		
	}
	
	@RequestMapping("/listall")
	public String listAll(ModelMap model) {
		List<LocationEntity> allLocations = locationSer.getAllLocations();
		model.addAttribute("locationsList", allLocations);
		return "LocationList";
	}
	
	@RequestMapping("/delete")
	public String deleteLocation(@RequestParam("id") int id, ModelMap model) {
		locationSer.deleteData(id);

		List<LocationEntity> allLocations = locationSer.getAllLocations();
		model.addAttribute("locationsList", allLocations);
		return "LocationList";
	}
	
	@RequestMapping("/update")
	public String updateLocation(@RequestParam("id") int id, ModelMap model) {
		LocationEntity updateData = locationSer.updateData(id);
		model.addAttribute("location", updateData);
		return "updateLocation";
		
	}
	
	@RequestMapping("/updateData")
	public String updateDataSave(@ModelAttribute("loc") LocationEntity locations, ModelMap model) {
		
		locationSer.dataSave(locations);
		model.addAttribute("msg1","Location Data Updated");

		List<LocationEntity> allLocations = locationSer.getAllLocations();
		model.addAttribute("locationsList", allLocations);
		return "LocationList";
	}

}
