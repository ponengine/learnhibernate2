package com.pon.engine.domain;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name="Employeeinfo")
public class Employee {

@Id
@TableGenerator(name="empId",table="emppktb",
pkColumnName="empkey",pkColumnValue="empvalue"
,allocationSize=1)
@GeneratedValue(strategy=GenerationType.TABLE,generator="empId")
@Column(name="EmployeeId")
private int empId;
private String empName;
@Transient
private String empPassword;
@Column(nullable=false)
private String empEmailAddress;
@Basic
private boolean isPerment;
@Temporal(TemporalType.DATE)
private Calendar empJoinDate;
@Temporal(TemporalType.TIMESTAMP)
private Date empLoginTime;


public String getEmpPassword() {
	return empPassword;
}
public void setEmpPassword(String empPassword) {
	this.empPassword = empPassword;
}
public String getEmpEmailAddress() {
	return empEmailAddress;
}
public void setEmpEmailAddress(String empEmailAddress) {
	this.empEmailAddress = empEmailAddress;
}
public boolean isPerment() {
	return isPerment;
}
public void setPerment(boolean isPerment) {
	this.isPerment = isPerment;
}
public Calendar getEmpJoinDate() {
	return empJoinDate;
}
public void setEmpJoinDate(Calendar empJoinDate) {
	this.empJoinDate = empJoinDate;
}
public Date getEmpLoginTime() {
	return empLoginTime;
}
public void setEmpLoginTime(Date empLoginTime) {
	this.empLoginTime = empLoginTime;
}
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}


}
