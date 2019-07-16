package com.capgemini.contactbook.Service;

import java.util.HashMap;

import com.capgemini.contactbook.Dao.ContactBookDaoImpl;
import com.capgemini.contactbook.bean.EnquiryBean;

import Exception.ContactBookException;

public class ContactBookServiceImpl implements ContactBookService{
ContactBookDaoImpl DaoObj = new ContactBookDaoImpl();

	@Override
	public long addEnquiry(EnquiryBean bean) throws ContactBookException {
		long id= DaoObj.addEnquiry(bean);
		return id;
	
	
	}

	@Override
	public EnquiryBean getEnquiryDetails(long EnquiryID) throws ContactBookException {
		EnquiryBean bean= DaoObj.getEnquiryDetails(EnquiryID);
		System.out.println("from service"+bean);
		
		return bean;
	
	}

	@Override
	public boolean isValidEnquiry(EnquiryBean bean) throws ContactBookException {
		// TODO Auto-generated method stub
		return false;
	}

}
