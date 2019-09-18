package com;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Map;
import java.util.Scanner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import com.RequestMappingHandlerMapping.RequestHandler;

public class Practice02 {

  public static void main(String[] args) throws Exception {
    Scanner sc  = new Scanner(System.in);
    ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
    
    RequestMappingHandlerMapping mapping =
        new RequestMappingHandlerMapping();

    Map<String,Object> components = appCtx.getBeansWithAnnotation(Component.class);
    Collection<Object> objList = components.values();

    
    objList.forEach(obj -> {

      Method[] methods = null;
      
      try {
        methods = obj.getClass().getMethods();
        
      } catch (Exception e) {
        e.printStackTrace();
        
      }
      
      for (Method m : methods) {
        RequestMapping anno = m.getAnnotation(RequestMapping.class);
        if (anno == null)
          continue;
        mapping.addRequestHandler(anno.value()[0], obj, m);
      }

    });

    System.out.println("계산 커맨드? ");
    String command = sc.next();
    System.out.printf("값1? ");
    int n1 = sc.nextInt();
    System.out.printf("값2? ");
    int n2 = sc.nextInt();
    RequestHandler requestHandler = mapping.getRequestHandler(command);

    System.out.println("> " + 
        requestHandler.method.invoke(requestHandler.bean, n1, n2));

 
    sc.close();
  }
}
