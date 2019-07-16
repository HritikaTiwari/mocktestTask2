package com.capgemini.contactbook.Dao;

import java.util.HashMap;

import com.capgemini.contactbook.bean.EnquiryBean;

import Exception.ContactBookException;

public class ContactBookDaoImpl implements ContactBookDao {
HashMap<Long, EnquiryBean> hm = new HashMap<Long, EnquiryBean>();
//public HashMap<Integer, EnquiryBean> hm(){
//	return hm;
//}`
	@Override
	public long addEnquiry(EnquiryBean bean) throws ContactBookException {
		// TODO Auto-generated method stub
		hm.put( bean.getEnqryId(),bean);
		return bean.getEnqryId();
	}

	@Override
	public EnquiryBean getEnquiryDetails(long EnquiryID) throws ContactBookException {
		// TODO Auto-generated method stub
		EnquiryBean b = (EnquiryBean) hm.get(EnquiryID);
		return b;
	}

}
