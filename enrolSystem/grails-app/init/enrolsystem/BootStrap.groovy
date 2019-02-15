package com.enrol

class BootStrap {

def init = { servletContext -> 

	// Define objects 

	def Computing = new Course (
	department: 'Computing', 
	courseTitle: 'BSc Hons Computing',
	courseLeader: 'Dr Michelle Murphy',
	courseCode: 'CS123',	
	startDate: new Date('09/09/2017'),
	endDate: new Date('07/07/2023'),
	description: 'Hello World',	
	numberOfStudents: 55, 
	tuitionFees: 9600.00).save()    


	def Chris = new Student (
	studentName: 'Dr. Frankenstein',        
    	studentID: 'B7029165',          
	dob: new Date('21/01/1931'),                 
	studentEmail: 'Talktofrank08@outlook.com',  
	studentUsername: 'Filthy Frank', 
	studentPassword: 'system1',    
	isFundingAvailable: true,
	course: 'BSc Hons Computing',
	bio: 'Im ready').save()  

	def Tonderai = new Student (
	studentName: 'Tonderai Maswera',        
    	studentID: 'B4029165',          
	dob: new Date('01/5/1989'),                 
	studentEmail: 'acestm1@exchange.shu.ac.uk', 
	studentUsername: 'Ton tons',  
	studentPassword: 'system2',    
	isFundingAvailable: true,
	course: 'BSc Hons Computing',
	bio: 'I started in 2017 this is a great opportunity for me to flesh out my skills and talents').save()  

	def Voldemort = new Student (
	studentName: 'Voldemort',        
    	studentID: 'B2029165',          
	dob: new Date('10/31/1966'),                 
	studentEmail: 'H.PClub@outlook.com',  
	studentUsername: 'Dr Evil', 
	studentPassword: 'system3',    
	isFundingAvailable: false, 
	course: 'BSc Hons Computing', 
	bio: 'I grumpy when it comes to education but I am here now').save()  

 
	def SystemArchitectures = new Module (
	module_title: 'System Architectures',      
    	module_code: 'G504',     
	credits: 20,   
	course: 'BSc Computing',   
	lecturer: 'George Turner',  
	description: 'Good Morning Everyone').save()  
 
	def DaDs = new Module (
	module_title: 'DADS',      
    	module_code: 'G504',     
	credits: 20,   
	course: 'BSc Computing',   
	lecturer: 'Lynn Cinderey',  
	description: 'It is nice to everyone here so early').save() 

 
	def PcP = new Module (
	module_title: 'PCP',      
    	module_code: 'G504',     
	credits: 40,   
	course: 'BSc Computing',   
	lecturer: 'Mathew Love',  
	description: 'Hello & Good Morning Everyone').save() 

	def SysArchs = new Lecturer (
	fullName: 'George Turer',   
    	post: 'BSc Hons Computing',         
	subject: 'System Architectures',       
	lecturerEmail: 'b7038729@my.shu.ac.uk',  
	office: 'Cantor-9417',       
        bio: 'Email me in the first instance').save() 

	def Database = new Lecturer (
	fullName: 'Lynn Cinderey ',   
    	post: 'BSc Hons Computing',         
	subject: 'DADS',       
	lecturerEmail: 'L.Cinderey@shu.ac.uk',  
	office: 'Cantor-9323',       
        bio: 'Good Morning it is nice to see everyone').save() 
 

	def Pcp = new Lecturer (
	fullName: 'Mathew Love',   
    	post: 'BSc Hons Computing',         
	subject: 'PCP ',       
	lecturerEmail: 'm.love@shu.ac.uk',  
	office: 'Cantor-9326',       
        bio: 'Hello Hello').save() 

}

def destroy = { 

// Destroy app

	}
} 
