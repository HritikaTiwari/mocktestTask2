package com.capgemini.contactbook.Dao;

import com.capgemini.contactbook.bean.EnquiryBean;

import Exception.ContactBookException;

public interface ContactBookDao {
	public long   addEnquiry(EnquiryBean  bean) throws ContactBookException;
	public  EnquiryBean  getEnquiryDetails(long    EnquiryID) throws ContactBookException;

}
