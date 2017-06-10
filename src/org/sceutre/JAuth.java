package org.sceutre;

import java.io.*;
import java.util.*;

public class JAuth {

   public static void main(String[] args) throws Exception {
      JAuth jauth = new JAuth();
      jauth.load();
      jauth.next();
   }
   
   private static class Data {
      String name;
      PasscodeGenerator generator;
   }
   
   private final List<Data> list = new ArrayList<>();
   
   private void load() throws Exception {
      String file = System.getProperty("user.home") + "/.jauth";
      try (BufferedReader br = new BufferedReader(new FileReader(file))) {
         while (true) {
            String line = br.readLine();
            if (line == null)
               break;
            String[] parts = line.split("=");
            Data d = new Data();
            d.name = parts[0].trim();
            d.generator = PasscodeGenerator.on(parts[1]);
            list.add(d);
         }
      }
   }
   
   private void next() throws Exception {
      for (Data d : list) {
         String code = d.generator.generateTimeoutCode();
         System.out.printf(" %s : %s\n", code, d.name);
      }
   }
   
}
