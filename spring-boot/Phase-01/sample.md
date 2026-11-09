# Spring MVC architecture
┌─────────────────────────────┐
│ 1. Client                   │
│    sends HTTP request       │
└──────────────┬──────────────┘
               ▼
┌─────────────────────────────┐
│ 2. DispatcherServlet        │
│    front controller         │
└──────────────┬──────────────┘
               ▼
┌─────────────────────────────┐
│ 3. HandlerMapping           │
│    finds controller method  │
│    (URL + HTTP method)      │
└──────────────┬──────────────┘
               ▼
┌─────────────────────────────┐
│ 4. HandlerAdapter           │
│    invokes the method and   │
│    binds the arguments:     │
│    @PathVariable  (path)    │
│    @RequestParam  (?k=v)    │
│    @RequestBody   (JSON)    │
└──────────────┬──────────────┘
               ▼
┌─────────────────────────────┐
│ 5. Controller               │
│    method executes          │
└──────────────┬──────────────┘
               ▼
┌─────────────────────────────┐
│ 6. What is returned?        │
└───────┬──────────────┬──────┘
        │              │
  @Controller    @RestController
  (view name)    (@ResponseBody)
        │              │
        ▼              ▼
┌───────────────┐  ┌───────────────────┐
│ 7. ViewResolver│  │ 8. Response body  │
│  name → HTML   │  │  JSON, no view    │
│  template      │  │  resolver         │
└───────┬───────┘  └─────────┬─────────┘
        │                    │
        └─────────┬──────────┘
                  ▼
┌─────────────────────────────┐
│ DispatcherServlet           │
│ sends response to client    │
└─────────────────────────────┘
