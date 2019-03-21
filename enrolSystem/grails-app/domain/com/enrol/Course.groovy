package com.enrol

class Course {

String   department
String   courseTitle
Lecturer courseLeader
String   courseCode
Date     startDate
Date     endDate
String   description
int      numberOfStudents 
double   tuitionFees

static hasMany=[students:Student,lecturers:Lecturer,modules:Module]

static belongsTo=[Course]

String toString(){

return courseTitle 

}

    static constraints = 
	{
        department       nullable:false, blank:false;
	courseTitle      nullable:false, blank:false;
	courseLeader     nullable:false, blank:false;
	courseCode       nullable:false, blank:false; 
	startDate        nullable:false, blank:false;
	endDate          nullable:false, blank:false;
	description      nullable:false, blank:false, maxSize:5000, widget:'textarea';
        numberOfStudents nullable:false, blank:false, min:20, max:60;
	tuitionFees      nullable:false, blank:false, scale:2;  


       	} 
   }
