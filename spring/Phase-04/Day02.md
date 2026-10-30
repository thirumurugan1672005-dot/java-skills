
# Thymleaf
* Thymleaf is one of the dependency to use dynamic views which controller returns
* they are present in templates folder under main/resources
* the method returns string look on views on this folder
* Server side template engine for rendering dynamic views
* data passed via Model


# @Controller
* Annotation in which it can a act as component sterotype annotation
* marks as web controller and makes the views 

# @RequestMapping
* This annotation helps us to provide path for the methods level or class  level
* Maps HttpRequest to methods or class default is get 

# @GetMapping , @PostMapping , @PutMapping , @DeleteMapping
* These are design choice to indicate GET , POST , PUT , DELETE

# @ResponseBody
* It overrides the view resolver instead of view resolution provides json as default
* Objects are converted to Json  by HttpMessageConverters


# @RestController
* RestController is the annotation is combination of @Controller and @ResponseBody

# REST API
* Represented State Transfer Architectural model is the able to make communications between the components


# Scopes in Web for Spring
## @RequestScope 
* Spring creates instance for each request
* Avoid the time consuming things done by this instance
* It is thread safe as it is creating new instances for every http request
* It is short-lived and readily garbage collectible

## @Sessionscope
* Spring creates instance for each HttpSession
* This may introduce concurrency issues
* It is long-lived
* Avoid stores sensitive details here
* keep it small Serialisible if persistent

## @Applicationscope
* Application scope is the bean per application
* It will be there until the app runs
* It is generally avoid to use it 




