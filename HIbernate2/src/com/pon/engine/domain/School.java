package com.pon.engine.domain;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class School {
@Id
@GeneratedValue
private int schoolId;
@Embedded
private SchoolDetail schoolDetail;


public SchoolDetail getSchoolDetail() {
	return schoolDetail;
}
public void setSchoolDetail(SchoolDetail schoolDetail) {
	this.schoolDetail = schoolDetail;
}
private String schoolName;
public int getSchoolId() {
	return schoolId;
}
public void setSchoolId(int schoolId) {
	this.schoolId = schoolId;
}
public String getSchoolName() {
	return schoolName;
}
public void setSchoolName(String schoolName) {
	this.schoolName = schoolName;
}


}
