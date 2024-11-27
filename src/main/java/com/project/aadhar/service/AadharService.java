package com.project.aadhar.service;

import java.util.List;

import com.project.aadhar.entity.AadharCard;

public interface AadharService {
	
	List<AadharCard> getAllAadharCards();
	
	AadharCard getAadharCardById(Long id);
	
	AadharCard createAadharCard(AadharCard aadharCard);
	
	AadharCard updateAadhar(Long id, AadharCard updateAadhar);
	
	 void deleteAadhar(Long id);

}
