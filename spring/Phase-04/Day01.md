# webapp
application that is accessible via internet in browser 

# SpringBoot
* SpringBoot gives convention over configuration

# HTTP
* client sends HTTP requests to the server
* server reads the HTTP request ,proccess or store the response
* server returns back to client
* client returns the HTTP response

# How SpringBoot actually works MVC
* client sends HTTP request
* Tomcat server gets the HTTP request and deliver to Spring App
* dispatcher is the entry point gets HTTP request and manages flow
* dispatcher uses handler mapping check for controller depend on path
* once it knows dispatcher method calls the method
* After execution controller provides view name and data that needs to render in view
* dispatcher finds the view and renders with data provided by controller
* View resolver was used to find the view  of renderer
* Through TomCat HTTP return back to client
* browser interperts HTTP and rendered the view and data 
