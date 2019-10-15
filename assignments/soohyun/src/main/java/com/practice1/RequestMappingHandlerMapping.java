package com.practice1;

import java.lang.reflect.Method;
import java.util.HashMap;

public class RequestMappingHandlerMapping {
  HashMap<String, RequestHandler> handlerMap = new HashMap<>();

  public void addRequestHandler(String name, Object bean, Method method) {
    handlerMap.put(name, new RequestHandler(method, bean));
  }
  
  public RequestHandler getRequestHandler(String name) {
    return handlerMap.get(name);
  }
  
  public static class RequestHandler {
    public Method method;
    public Object bean;
    
    public RequestHandler(Method method, Object bean) {
      this.method = method;
      this.bean = bean;
    }
  }
}