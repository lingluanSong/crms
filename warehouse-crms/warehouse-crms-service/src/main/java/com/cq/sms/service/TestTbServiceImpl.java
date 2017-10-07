package com.cq.sms.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cq.sms.crms.dao.TestTbDao;
import com.cq.sms.crms.model.TestTb;

public class TestTbServiceImpl implements TestTbService {
	
	@Autowired
	private TestTbDao testTbDAO;
	@Override
	public void add(TestTb testTb) {
		// TODO Auto-generated method stub
		testTbDAO.add(testTb);
	}
}
