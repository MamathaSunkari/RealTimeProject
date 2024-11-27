package com.project.aadhar.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.aadhar.entity.AadharCard;
import com.project.aadhar.exception.AadharException;
import com.project.aadhar.repository.AadharRepository;
@Service
public class AadharServiceImpl implements AadharService {
	
	@Autowired
	AadharRepository aadharRepository;

	@Override
	public List<AadharCard> getAllAadharCards() {
	List<AadharCard> allDetails =	aadharRepository.findAll();
		return allDetails;
	}

	@Override
	public AadharCard getAadharCardById(Long id) {
     AadharCard details =  aadharRepository.findById(id).orElseThrow(()-> new AadharException("AadharNumber does not exist"));
      return details;
	}

	@Override
	public AadharCard createAadharCard(AadharCard aadharCard) {
		return aadharRepository.save(aadharCard);
		
	}

	@Override
	public AadharCard updateAadhar(Long id, AadharCard updateAadhar) {
		AadharCard updateDetails =  aadharRepository.findById(id).orElseThrow(()-> new AadharException("AadharNumber does not exist"));
		updateDetails.setAadharNumber(updateAadhar.getAadharNumber());
		updateDetails.setName(updateAadhar.getName());
		updateDetails.setAddress(updateAadhar.getAddress());
		updateDetails.setPhoneNumber(updateAadhar.getPhoneNumber());
		aadharRepository.save(updateDetails);
		return updateDetails;
	}

	@Override
	public void deleteAadhar(Long id) {
	aadharRepository.findById(id).orElseThrow(()->new AadharException("AadharCard does not exist"));
	aadharRepository.deleteById(id);
		
	}

}
