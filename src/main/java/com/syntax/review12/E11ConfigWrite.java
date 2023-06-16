package com.syntax.review12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class E11ConfigWrite {
    public static void main(String[] args)  {
        String path="Files/Test.properties";
        try {
            FileInputStream fis=new FileInputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Properties properties= new Properties();
        properties.setProperty("Name","Vlad");
        FileOutputStream fos= null;
        try {
            fos = new FileOutputStream(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        try {
            properties.store(fos,"adding a name");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
