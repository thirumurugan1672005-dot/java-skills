# Spring MVC Flow Diagram

```
┌────────────────────────────────────────┐
│ 1. Client                              │
│    sends HTTP request                  │
└────────────────────────────────────────┘
                    │
                    ▼
┌────────────────────────────────────────┐
│ 2. DispatcherServlet                   │
│    front controller, receives every    │
│    request first                       │
└────────────────────────────────────────┘
                    │
                    ▼
┌────────────────────────────────────────┐
│ 3. HandlerMapping                      │
│    finds the controller method         │
│    (URL + HTTP method)                 │
└────────────────────────────────────────┘
                    │
                    ▼
┌────────────────────────────────────────┐
│ 4. HandlerAdapter                      │
│    invokes the method, binds args:     │
│    @PathVariable  -> URL path          │
│    @RequestParam  -> ?key=value        │
│    @RequestBody   -> JSON to object    │
└────────────────────────────────────────┘
                    │
                    ▼
┌────────────────────────────────────────┐
│ 5. Controller                          │
│    method executes                     │
└────────────────────────────────────────┘
                    │
                    ▼
┌────────────────────────────────────────┐
│ 6. What does the method return?        │
└────────┬─────────────────────┬─────────┘
         │                     │
  @Controller           @RestController
  (view name)           (@ResponseBody)
         │                     │
         ▼                     ▼
┌─────────────────┐  ┌───────────────────┐
│ 7. ViewResolver │  │ 8. Response body  │
│ name -> HTML    │  │ JSON, no view     │
│ template        │  │ resolver          │
│ (Thymeleaf)     │  │ (REST API)        │
└────────┬────────┘  └─────────┬─────────┘
         │                     │
         └──────────┬──────────┘          
                    │
                    ▼
┌────────────────────────────────────────┐
│ DispatcherServlet                      │
│ sends the response back to the client  │
└────────────────────────────────────────┘
```
