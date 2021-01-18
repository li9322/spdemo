package com.li.config;

import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * @DESCRIPTION:
 * @USER: li
 * @DATE: 2021/01/05 23:19
 */
public class WebInit implements WebApplicationInitializer {
    public void onStartup(ServletContext servletContext) throws ServletException {
        //首先加载springmvc配置文件
        AnnotationConfigWebApplicationContext ctx=new AnnotationConfigWebApplicationContext();
        ctx.register(SpringConfig.class);
        //添加DispatchServlet
        ServletRegistration.Dynamic springmvc =servletContext.addServlet("springmvc",new DispatcherServlet(ctx));
        //给DispatchServlet添加路径映射
        springmvc.addMapping("/");
        //给DispatchServlet添加启动时机
        springmvc.setLoadOnStartup(1);
    }
}
