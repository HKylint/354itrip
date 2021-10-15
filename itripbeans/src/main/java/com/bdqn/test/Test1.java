package com.bdqn.test;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Test1 {
    public static void main(String[] args) throws Exception {
        HashMap map = new HashMap();
        ArrayList list = new ArrayList();
        for(int i=0;i<=10;i++){
            User user = new User();
            user.setId(i);
            user.setName("姓名"+i);
            list.add(user);
        }
        map.put("name","zjh");
        map.put("list",list);
        Configuration cfg = new Configuration();
        cfg.setDefaultEncoding("utf-8");
        cfg.setDirectoryForTemplateLoading(new File("D:\\JetBrains\\IdeaProjects\\itrip\\itripbeans\\src\\main\\resources"));
        Template template = cfg.getTemplate("a.flt");
        template.process(map,new FileWriter("D:\\a.html"));
    }
}
