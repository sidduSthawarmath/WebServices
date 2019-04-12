SOAP web services 
--------------------
1.JAX-WS
  Using JAX-WS api we can create SOAP web services
  
  JAX-WS provides two ways to create web services
 
  a. RPC style
  b. Document Style
  
 First we have to run publisher class then we can run client for calling the soap services. 



  
  
Restful web services with Jersey
---------------------------------

1.Add student Details
POST => http://localhost:7070/WebServices/rest/students/save

{
"name" : "Raghav",
"phoneNum" : "2312"
}


2.Delete Student details
DELETE => http://localhost:7070/WebServices/rest/students/1

3.Update Student name using rollNum
PUT => http://localhost:7070/WebServices/rest/students/updateStudentName?rollNum=1&name=abc


4.Find all the Student
GET => http://localhost:7070/WebServices/rest/students/findAll



Note:
1.Content-Type :
  	
  	Content-Type indicates the type data you are going to send in request body.
 	ex: Content-Type:application/xml
 		Content-Type:application/json
 		
 	if we are not set Content-Type then it considers the first mime type mentioned in the @Consumes annotation
 	ex:
 		@Consumes({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
 		
 	
2.Accept :	
	  Accept indicates  the type of response you are going to expect from the service.
	  ex: Accept:application/xml
	  	  Accept:application/json
	  	  
	if we are not set 'Accept' then it considers the first mime type mentioned in the @Produces annotation  	    
	  @Produces({ MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON })
	  

		web.xml
		---------
		
	<servlet>
		<servlet-name>helloworld</servlet-name>
		<servlet-class>com.sun.jersey.spi.container.servlet.ServletContainer</servlet-class>
		<init-param>
			<param-name>com.sun.jersey.config.property.packages</param-name>
			<param-value>com.siddu.restful.jaxrsjersey</param-value>
		</init-param>
		<load-on-startup>1</load-on-startup>
	</servlet>
 
	<servlet-mapping>
		<servlet-name>helloworld</servlet-name>
		<url-pattern>/rest/*</url-pattern>
	</servlet-mapping>

