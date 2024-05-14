package com.platform.enquiry.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.enquiry.entity.Enquiry;
import com.platform.enquiry.repository.EnquiryRepository;

@Service
public class EnquiryServiceImpl implements EnquiryService {
	@Autowired
	EnquiryRepository enquiryRepository;

	@Override
	public Enquiry addEnquiry(Enquiry enquiry) {

		return enquiryRepository.save(enquiry);
	}

	@Override
	public List<Enquiry> getAllEnquiry() {
		return enquiryRepository.findAll();
	}

	@Override
	public void deleteEnquiry(long id) {
		enquiryRepository.deleteById(id);

	}

	@Override
	public Enquiry getenquiryById(long id) {
		return enquiryRepository.getOne(id);
	}

	@Override
	public Enquiry updateEnquiry(Enquiry enquiry) {
		Enquiry existEnquiry = enquiryRepository.getById(enquiry.getId());
		existEnquiry.setName(enquiry.getName());
		existEnquiry.setAddress(enquiry.getAddress());
		Enquiry updatedEnquire = enquiryRepository.save(existEnquiry);
		return updatedEnquire;
	}

}
