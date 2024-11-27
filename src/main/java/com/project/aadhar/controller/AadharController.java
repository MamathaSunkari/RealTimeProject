package com.project.aadhar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.aadhar.entity.AadharCard;
import com.project.aadhar.service.AadharService;

@RestController
@RequestMapping("/api/aadhar")
public class AadharController {
	
	@Autowired
	AadharService aadharService;
	
	@PostMapping
	public AadharCard createAadharCard(@RequestBody AadharCard aadharCard)
	{
		return aadharService.createAadharCard(aadharCard) ;
		
	}
	@GetMapping
	public List<AadharCard> getAllAadharCards() {
		return aadharService.getAllAadharCards();
		
	}
	@GetMapping("/{id}")
	public AadharCard getAadharCardById(@PathVariable Long id) {
		return aadharService.getAadharCardById(id);
		
	}
	@PutMapping("/{id}")
	public AadharCard updateAadhar(@PathVariable Long id,@RequestBody  AadharCard updateAadhar) {
		return aadharService.updateAadhar(id, updateAadhar);
		
	}
	@DeleteMapping("/{id}")
	public void deleteAadhar(@PathVariable Long id) {
		 aadharService.deleteAadhar(id);
		
	}
	
}
