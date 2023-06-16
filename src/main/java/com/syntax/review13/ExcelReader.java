package com.syntax.review13;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExcelReader {
    public static void main(String[] args) {
        String path = "/Users/marinamonastirschi/Desktop/HRMSEmployeesData.xlsx";
        try {
            FileInputStream fis = new FileInputStream(path);
            System.out.println(path);

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
