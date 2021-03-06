package com.enrol

class Lecturer {

String  fullName
String  post
String  subject
String  lecturerUserName
String  lecturerPassword
String  lecturerEmail
String  office
String  bio
Course theCourse

static hasMany=[modules:Module,courses:Course]

static belongsTo=[Course]


String toString(){

return fullName 

}

    static constraints = 
       {
 
        fullName       nullable:false, blank:false;
    	post           nullable:false, blank:false;
	subject        nullable:false, blank:false;
	lecturerUserName nullabe:false, blank:false;
        lecturerPassword nullable:false, blank:false;
	lecturerEmail  nullable:false, blank:false, email:true;
	office         nullable:false, blank:false;
        bio            nullable:false, blank:false, maxSize:5000, widget:'textarea';
	theCourse      nullable:true,  blank:true;

      }
  

   }
