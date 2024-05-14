package com.platform.enquiry.service;

import java.util.List;

import com.platform.enquiry.entity.Enquiry;

public interface EnquiryService {
	public Enquiry addEnquiry(Enquiry en);

	public List<Enquiry> getAllEnquiry();

	public Enquiry getenquiryById(long id);

	public Enquiry updateEnquiry(Enquiry enquiry);

	public void deleteEnquiry(long id);

}
