package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {
    @Test
    public void studentNameTest() throws InterruptedException{
        WebDriver driver = new ChromeDriver();

        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value = driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value, "Student name is required");

        driver.quit();
    }

    @Test
    public void emailTest() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        driver.findElement(By.id("studentName")).sendKeys("Abc");
        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value = driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value, "Email is required");

        driver.quit();
    }

    @Test
    public void emailformat() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        driver.findElement(By.id("email")).sendKeys("test");
        driver.findElement(By.id("studentName")).sendKeys("Abc");
        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value, "Invalid email format");

        driver.quit();

    }

    @Test
    public void mobilenumTest() throws InterruptedException{

        WebDriver driver =new ChromeDriver();
        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        driver.findElement(By.id("mobile")).sendKeys("997865");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("studentName")).sendKeys("Abc");
        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value, "Mobile number should be exactly 10 digits");

        driver.quit();
        
    }

    @Test
    public void genderTest() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        //driver.findElement(By.id("male")).click();
        //driver.findElement(By.id("female")).click();
        driver.findElement(By.id("mobile")).sendKeys("9965224422");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("studentName")).sendKeys("Abc");
        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value, "Gender is required");

        driver.quit();

    }

    @Test
    public void depTest() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("mobile")).sendKeys("9965224422");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("studentName")).sendKeys("Abc");
        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value, "Department is required");

    }


    @Test
    public void passwordTest() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        driver.findElement(By.id("password")).sendKeys("1234a@");
        WebElement value=driver.findElement(By.id("department"));
        Select option=new Select(value);
        option.selectByValue("CSE");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("mobile")).sendKeys("9965224422");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("studentName")).sendKeys("Abc");
        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value1=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value1,"Password should be minimum 8 characters");

        driver.quit();

    }

    @Test
    public void confirmpassTest() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        driver.findElement(By.id("confirmPassword")).sendKeys("12abc@");
        driver.findElement(By.id("password")).sendKeys("12abc@34");
        WebElement value=driver.findElement(By.id("department"));
        Select option=new Select(value);
        option.selectByValue("CSE");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("mobile")).sendKeys("9965224422");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("studentName")).sendKeys("Abc");
        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value1=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value1,"Password and confirm password should match");

        driver.quit();
    }

    @Test
    public void termsTest() throws InterruptedException{
        WebDriver driver=new ChromeDriver();
        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        driver.findElement(By.id("confirmPassword")).sendKeys("12abc@34");
        driver.findElement(By.id("password")).sendKeys("12abc@34");
        WebElement value=driver.findElement(By.id("department"));
        Select option=new Select(value);
        option.selectByValue("CSE");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("mobile")).sendKeys("9965224422");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("studentName")).sendKeys("Abc");
        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value1=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value1,"Please accept terms and conditions");

        driver.quit();

    }


    @Test
    public void sampleTest() throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Users/DANUJA/Downloads/index.html");

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("confirmPassword")).sendKeys("12abc@34");
        driver.findElement(By.id("password")).sendKeys("12abc@34");
        WebElement value=driver.findElement(By.id("department"));
        Select option=new Select(value);
        option.selectByValue("CSE");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("mobile")).sendKeys("9965224422");
        driver.findElement(By.id("email")).sendKeys("abc@gmail.com");
        driver.findElement(By.id("studentName")).sendKeys("Abc");
        driver.findElement(By.id("registerBtn")).click();

        Thread.sleep(3000);

        String value1=driver.findElement(By.id("message")).getText();
        Assert.assertEquals(value1, "Registration successful");

        driver.quit();

    }
}


