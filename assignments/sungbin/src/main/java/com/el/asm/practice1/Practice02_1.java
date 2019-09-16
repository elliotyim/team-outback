package com.el.asm.practice1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import com.el.asm.practice1.RequestMappingHandlerMapping.RequestHandler;


public class Practice02_1 {

  public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    Scanner keyScan = new Scanner(System.in);
    ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
    
    Map<String, Object> components = appCtx.getBeansWithAnnotation(Component.class);
    Collection<Object> objList = components.values();
    
    RequestMappingHandlerMapping mapping =
        new RequestMappingHandlerMapping();
    
    for (Object obj : objList) {
      Method[] methods = obj.getClass().getMethods();
      for (Method m : methods) {
        RequestMapping anno = m.getAnnotation(RequestMapping.class);
        if (anno == null)
          continue;
        
        mapping.addRequestHandler(anno.value()[0], obj, m);
      }
    }
    
    System.out.print("계산 커맨드? ");
    String command = keyScan.nextLine();
    System.out.print("값1? ");
    int value1 = Integer.parseInt(keyScan.nextLine());
    System.out.print("값2? ");
    int value2 = Integer.parseInt(keyScan.nextLine());
    
    RequestHandler requestHandler =
        mapping.getRequestHandler(command);
    
    System.out.println("> " +
        requestHandler.method.invoke(requestHandler.bean, value1, value2));
    keyScan.close();
  }
}
