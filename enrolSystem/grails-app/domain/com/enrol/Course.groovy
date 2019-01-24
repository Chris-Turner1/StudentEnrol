package com.enrol

class Course {

String  department
String  courseTitle
String  courseLeader
String  courseCode
Date    startDate
Date    endDate
String  description
int     numberOfStudents 
Double  tuitionFees

    static constraints = 
	{
	courseTitle nullable: false, blank:  false
    	department nullable:  false, blank:  false
	courseLeader nullable: false, blank: false
	courseCode   nullable: false, blank: false 
	numberOfStudents nullable: false, bank: false, min: 20, max: 60
	startDate  nullable: false, blank:  false
	endDate nullable: false, blank:  false
	studyMode nullable: false, blank:  false, size: 20
	description nullable: false, blank:  false, size: 5000, widget: 'text_area'
	tuitionFees nullable: false, blank:  false, scale: 2  


       	} 
   }
