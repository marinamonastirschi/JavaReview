package com.syntax.review13;

import com.syntax.review12.Constants;
import com.syntax.utils.Constants1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

public class EmployeeTester {
    public static void main(String[] args) {
        List<Map<String,String>> empData=ExcelReader1.read(Constants1.EXCEL_FILE_PATH,"Sheet1");
        WebDriver driver= new ChromeDriver();
        driver.get("\"http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login%22");
        WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        userName.sendKeys("admin");
        WebElement password = driver.findElement(By.xpath("//input[@id = 'txtPassword']"));
        password.sendKeys("Hum@nhrm122");
        WebElement logIn = driver.findElement(By.xpath("//*[@id='btnLogin']"));
        logIn.click();
        for(Map<String,String> map:empData){
            WebElement pim = driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            pim.click();
            WebElement addEmp= driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']"));
            addEmp.click();
            driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys(map.get("FirstName"));
            driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys(map.get("MiddleName"));
            driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys(map.get("LastName"));

        }
    }
}
