package com.cq.sms.crms.test;

	import java.util.Date;

	import org.junit.Test;
	import org.junit.runner.RunWith;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.test.context.ContextConfiguration;
	import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.cq.sms.crms.dao.TestTbDao;
import com.cq.sms.crms.model.TestTb;

	@RunWith(SpringJUnit4ClassRunner.class)
	@ContextConfiguration(locations={"classpath:application-context.xml"})
	public class TestTbTest {
		
		@Autowired
		private TestTbDao userDao;
		
		@Test
		public void TestAdd() throws Exception{
			TestTb user = new TestTb();
			user.setName("刘诗诗");
			user.setBirthday(new Date());
			userDao.insertUser(user);
		}

	}

