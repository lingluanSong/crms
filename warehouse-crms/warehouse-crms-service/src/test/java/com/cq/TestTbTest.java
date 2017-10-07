package com.cq;

import java.util.Date;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.cq.sms.crms.dao.TestTbDao;
import com.cq.sms.crms.model.TestTb;

public class TestTbTest {
	@Autowired
	private TestTbDao testTbDAO;
	
	@Test
	public void testAdd()
	{
		TestTb testTb = new TestTb();
		testTb.setName("范冰冰");
		testTb.setBirthday(new Date());
		testTbDAO.insertUser(testTb);
	}

}
