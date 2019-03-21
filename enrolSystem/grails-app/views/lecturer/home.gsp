<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Student Enrolment System | Home page</title>
    <asset:stylesheet src="home.css"/>
</head>
<body>

<div id="content" role="main">


<div class ="row">


	<div class="first"> 


		<h3>Courses Management</h3>

	<p>loren ipsum test test test </p>


	   <button type="button" class="btn btn-success">

		<g:link controller="course" action="create">Add Course</g:link>

	</button>


<div class="second"> 


	<h3>Student Enrolment</h3> 



	<p>lorem ipsum test test test</p>

	
	<button type="button" class="btn btn-success">

	   <g:link controller="student" action="create">Enrol Student</g:link>


	</button>

</div>


<div class="third"> 


	<h3>Choose a Module</h3> 



	<p>lorem ipsum test test test</p>

	
	<button type="button" class="btn btn-success">

	   <g:link controller="module" action="create">Add Module</g:link>


	</button>

</div>

<div class="forth"> 


	<h3>Lecturer Enrolment</h3> 



	<p>lorem ipsum test test test</p>

	
	<button type="button" class="btn btn-success">

	   <g:link controller="lecturer" action="create">Add Lecturer</g:link>


	</button>

</div>

</div> 

</div>

</body>

</html>
