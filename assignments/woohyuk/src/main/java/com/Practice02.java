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

  static RequestMappingHandlerMapping handlerMapping;

  public static void main(String[] args) throws Exception {
    handlerMapping = createRequestMappingHandlerMapping();
    run();
  }

  public static void run() throws Exception {
    Scanner scan = new Scanner(System.in);
    System.out.print("커맨드 입력 : ");
    String command = scan.nextLine();

    RequestHandler requestHandler = 
        handlerMapping.getRequestHandler(command);
    if(requestHandler != null) {
      requestHandler.method.invoke(requestHandler.bean);
    } else {
      throw new Exception("요청을 처리할 메서드가 없습니다");
    }

  }

  private static RequestMappingHandlerMapping createRequestMappingHandlerMapping() {
    RequestMappingHandlerMapping mapping = 
        new RequestMappingHandlerMapping();

    ApplicationContext appCtx = 
        new AnnotationConfigApplicationContext(AppConfig.class);

    Map<String, Object> components = appCtx.getBeansWithAnnotation(Component.class);

    Collection<Object> objList = components.values();

    for (Object obj : objList) {
      Method[] methods = obj.getClass().getMethods();
      for(Method m : methods) {
        RequestMapping anno = m.getAnnotation(RequestMapping.class);

        if(anno == null) {
          continue;
        }
        mapping.addRequestHandler(anno.value()[0], obj, m);
      }
    }
    return mapping;
  }

}
