package com.pon.engine.createschema;

import java.sql.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.pon.engine.domain.Customer;
import com.pon.engine.domain.School;
import com.pon.engine.domain.SchoolDetail;

public class TestCustomer {
	public static void main(String[] args) {
		AnnotationConfiguration config  = new AnnotationConfiguration();
		config.addAnnotatedClass(School.class);
		config.configure("hibernate.cfg.xml");
		
		SessionFactory fac = config.buildSessionFactory();
		Session session = fac.getCurrentSession();
		session.beginTransaction();
		
		new SchemaExport(config).create(true,true);
		/*Customer pon = new Customer();
		pon.setCustomerName("PonIsMe");
		pon.setCustomerAddress("bangkok");
		pon.setCreditScore(400);
		pon.setRewardPoints(20000);
		
		session.save(pon);*/
		
		SchoolDetail annsDetail = new SchoolDetail();
		annsDetail.setPublicSchool(false);
		annsDetail.setSchoolAddress("Bangsue 10800");
		annsDetail.setStudentCount(400);
		
		School st = new School();
		st.setSchoolName("PON IS ME");
		st.setSchoolDetail(annsDetail);
		session.save(st);
		session.getTransaction().commit();
		
	}
	
}
