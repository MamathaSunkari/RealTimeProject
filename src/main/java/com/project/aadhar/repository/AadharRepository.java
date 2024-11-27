package com.project.aadhar.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.aadhar.entity.AadharCard;

public interface AadharRepository extends JpaRepository<AadharCard, Long> {

}
