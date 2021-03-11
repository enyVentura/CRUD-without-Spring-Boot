package com.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    private static final Logger logger= LoggerFactory.getLogger(WebAppInitializer.class);
    @Override
    protected Class<?>[] getRootConfigClasses() {
        try {
            return new Class[]{HibernateConfig.class};
        }catch (Throwable e){
            logger.error("Except RootConfigClass",e);
            return null;
        }
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        try {
            return new Class[]{WebConfig.class};
        }catch (Throwable e){
            logger.error("Exception ServletConfigClasses",e);
            return null;
        }
    }

    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
