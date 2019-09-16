package com.el.asm.practice1;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class RequestMappingHandlerMapping {
  Map<String, RequestHandler> handlerMap = new HashMap<>();
  
  public void addRequestHandler(String command, Object bean, Method method) {
    handlerMap.put(command, new RequestHandler(method, bean));
  }
  
  public RequestHandler getRequestHandler(String command) {
    return handlerMap.get(command);
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
