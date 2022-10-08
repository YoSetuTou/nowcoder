package com.nowcoder.community;

import com.nowcoder.community.config.TimeConfig;
import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.dao.HibernateImplAlpha;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

import java.text.SimpleDateFormat;
import java.util.Date;

@ContextConfiguration(classes = CommunityApplication.class)
@SpringBootTest
class CommunityApplicationTests implements ApplicationContextAware {
	private ApplicationContext applicationContext;
	@Test
	void contextLoads() {
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
	}
	@Test
	public void testApplicationContext(){
		System.out.println(applicationContext);
		AlphaDao alphaDao =applicationContext.getBean("hibernate",AlphaDao.class);
		System.out.println(alphaDao.select());
	}
	@Test
	public void  testSimpleDateFormat(){
		SimpleDateFormat simpleDateFormat =applicationContext.getBean(SimpleDateFormat.class);
		System.out.println(simpleDateFormat.format(new Date()));
	}
}
