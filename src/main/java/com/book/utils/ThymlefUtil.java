package com.book.utils;

import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.IContext;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import java.io.Writer;
import java.nio.charset.StandardCharsets;


public class ThymlefUtil {
    private static final TemplateEngine engine;
    static  {

        engine = new TemplateEngine();
        ClassLoaderTemplateResolver r = new ClassLoaderTemplateResolver();
        r.setCacheable(false);
        r.setCharacterEncoding(StandardCharsets.UTF_8.name());
        engine.setTemplateResolver(r);

    }
    public static  void process(String template, IContext context, Writer writer){
        engine.process(template,context,writer);
    }

}
