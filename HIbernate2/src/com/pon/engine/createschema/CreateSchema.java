package com.pon.engine.createschema;

import java.sql.Date;
import java.util.GregorianCalendar;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

import com.pon.engine.domain.Employee;

public class CreateSchema {
public static void main(String[] args) {
	AnnotationConfiguration config  = new AnnotationConfiguration();
	config.addAnnotatedClass(Employee.class);
	config.configure("hibernate.cfg.xml");
	new SchemaExport(config).create(true,true);
	SessionFactory fac = config.buildSessionFactory();
	Session session = fac.getCurrentSession();
	session.beginTransaction();{
	Employee lists = new Employee();
	//lists.setEmpId(100);
	lists.setEmpName("Pon Engine");
	lists.setEmpEmailAddress("pon@hotmail.com");
	lists.setEmpPassword("ponisme");
	lists.setPerment(true);
	lists.setEmpJoinDate(new GregorianCalendar(2016, 10, 26));
	lists.setEmpLoginTime(Date.valueOf("2016-10-26"));
	session.save(lists);
	}{
		Employee list2 = new Employee();
		list2.setEmpName("Da Missda");
		list2.setEmpEmailAddress("thunsuda_nuda@hotmail.com");
		list2.setEmpPassword("missda");
		list2.setPerment(true);
		list2.setEmpJoinDate(new GregorianCalendar(2016, 9, 26));
		list2.setEmpLoginTime(new java.util.Date());
		session.save(list2);
	}
	
	session.getTransaction().commit();
}
}
