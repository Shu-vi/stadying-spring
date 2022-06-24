package org.generalov;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
        Music music = context.getBean("classicalMusic", Music.class);
        context.close();
    }
}
