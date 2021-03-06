# WebServices
Having examples of SOAP web services(both RPC and Document style) and Restful web services with Jersey

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
	
	
JAX-RS annotations:
--------------------

1. Path :

   It identifies the URI path. It can be specified on class or method.
   

2. GET :

   specifies method responds to GET request.
   
3. POST :

   specifies method responds to POST request.
   
4. PUT :

   specifies method responds to PUT request.
   
5. HEAD :

   specifies method responds to HEAD request.
   The HEAD method is almost identical to GET, except without the response body. In other words, if GET /users 
   returns a list of users, then HEAD /users will make the same request but won't get back the list of users.
   
6. DELETE :

   specifies method responds to DELETE request.
   
7. OPTIONS :

   specifies method responds to OPTIONS request.
    the response should be a 200 OK and have an Allow header with a list of HTTP methods that may be used on this 	resource. As an authorized user on an API, if you were to request OPTIONS /users/me, you should receive something 	like�
	200 OK
	Allow: HEAD,GET,PUT,DELETE,OPTIONS
   
8. FormParam :
   represents the parameter of the form.
   Example : http://localhost:7070/WebServices/rest/students/saveStdDet   
      
9. QueryParam :
   represents the parameter of the query string of an URL.
   Example:
   http://localhost:7070/WebServices/rest/students/findByRollNum?rollNum=1
   
10. HeaderParam :
   represents the parameter of the header.
   Example : http://localhost:7070/WebServices/rest/students/headerParam
  			 need to set userName and its value in httpHeader
   
11. CookieParam :
   represents the parameter of the cookie.
   
12. Produces :

   defines media type for the response such as XML, PLAIN, JSON etc. It defines the media type that the methods of a   resource class or MessageBodyWriter can produce.
   
13. Consumes :

  It defines the media type that the methods of a resource class or MessageBodyReader can produce.

14. PathParam :
    represents the parameter of the URI path.
    
    
 
 
File Download
-------------------

1.PDF file download :
http://localhost:7070/WebServices/rest/file/pdf


2.Image file download :
http://localhost:7070/WebServices/rest/file/image


3.Text file download :
http://localhost:7070/WebServices/rest/file/textfile




 
	

