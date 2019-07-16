package com.capgemini.contactbook.Service;

import com.capgemini.contactbook.bean.EnquiryBean;

import Exception.ContactBookException;

public interface ContactBookService {
	public  long   addEnquiry(EnquiryBean  bean) throws ContactBookException;
	public EnquiryBean  getEnquiryDetails(long EnquiryID) throws ContactBookException;
	public  boolean  isValidEnquiry(EnquiryBean bean) throws ContactBookException;

}
