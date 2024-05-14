package com.platform.enquiry.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.platform.enquiry.entity.Enquiry;
import com.platform.enquiry.service.EnquiryServiceImpl;

@RestController
@RequestMapping("enquire")
public class EnquiryController {
	@Autowired
	EnquiryServiceImpl serviceImpl;

	@PostMapping("addEnquiry")
	public ResponseEntity<Enquiry> createEnquiry(@RequestBody Enquiry enquiry) {
		Enquiry enquiryAdd = serviceImpl.addEnquiry(enquiry);
		return new ResponseEntity<>(enquiryAdd, HttpStatus.CREATED);
	}

	@GetMapping("{id}")
	public ResponseEntity<Enquiry> getEnquiryById(@PathVariable("id") Long id) {
		Enquiry enquiry = serviceImpl.getenquiryById(id);
		return new ResponseEntity<>(enquiry, HttpStatus.OK);
	}

	@GetMapping("allEnquiry")
	public ResponseEntity<List<Enquiry>> getAllEnquiry() {
		List<Enquiry> enquiries = serviceImpl.getAllEnquiry();
		return new ResponseEntity<>(enquiries, HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<Enquiry> updateEnquiry(@PathVariable("id") Long id, @RequestBody Enquiry enquiry) {
		enquiry.setId(id);
		Enquiry updatedEnquiry = serviceImpl.updateEnquiry(enquiry);
		return new ResponseEntity<>(updatedEnquiry, HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEnquiry(@PathVariable("id") Long id) {
		serviceImpl.deleteEnquiry(id);
		return new ResponseEntity<>("Enquiry successfully deleted!", HttpStatus.OK);
	}

}
