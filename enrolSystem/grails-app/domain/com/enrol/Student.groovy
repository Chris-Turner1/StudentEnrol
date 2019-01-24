package com.enrol

class Student {

String  studentName
String  studentID
Date    dob
Boolean isFundAvaliable
String  studentEmail
String  studentUsername
String  studentPassword
String  course


    static constraints = 

    {

        studentName        nullable: false, blank:  false
    	studentID          nullable:  false, blank:  false
	dob                nullable: false, blank: false
	studentEmail       nullable: false, blank: false, myEmail email: true
	studentUsername    nullable: false, bank: false, username unique: true
	studentPassword    nullable: false, blank:  false
	isFundingAvailable nullable: false, blank:  false
	Course             nullable: false, blank:  false
	


    }

}
