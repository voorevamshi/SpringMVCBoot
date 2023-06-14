package com.local.vmc.qualifier.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
   public static void main(String[] args) {
      ApplicationContext context = new ClassPathXmlApplicationContext("com/vmc/qualifier/xml/spring.context.xml");

      Profile profile = (Profile) context.getBean("profile");
      profile.printAge();
      profile.printName();
   }
}