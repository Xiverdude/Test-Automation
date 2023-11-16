/*
package org.example;
 */


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
/*

public class Main {
    public static void main(String[] args) {
        String driverPath = "C:\\testATproject\\chromedriver\\chromedriver.exe";
        String chromePath = "C:\\testATproject\\chrome-win64\\chrome.exe";
        //System.setProperty("webdriver.chrome.driver", "C:\\testATproject\\chromedriver\\chromedriver.exe");
        //String webdriverPath = "C:\\testATproject\\chromedriver\\chromedriver.exe";
        //ChromeOptions options = new ChromeOptions();   //задаем  новые опции для Хром
        //options.setBinary("C:\\testATproject\\chrome-win64"); //указываем путь до необходимой версии браузера (!!!не сработало!!!)
        System.setProperty(driverPath, chromePath);  //передаем этот путь в качестве параметра при создании объекта WebDriver:
        WebDriver driver = new ChromeDriver();       //создаем новый драйвер

        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //Задали неявное ожидадание в секундах
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); //Задали неявное ожидадание в секундах

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(3)) // создаем явное ожидание
                .until(ExpectedConditions.presenceOfElementLocated(By.id("101"))));        //ожидает определенного элемента

        driver.get("https://google.com");           //указываем какой сайт открыть


        //WebElement input = driver.findElement(By.xpath("//*[@id=\"input\"]"));  //внутри скобок локатор (как искать: что искать)
        // WebElement input = driver.findElement(B.);

        //input.click();



    }
}

    Для изменения пути к исполняемому файлу браузера необходимо заменить строку с путем на новый путь к исполняемому файлу.
    Например, если новый путь к исполняемому файлу Google Chrome на вашем компьютере - "C:\Program Files (x86)\Google\Chrome\Application\chrome.exe", то строка будет выглядеть следующим образом:

        String chromePath = "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe";

        Затем необходимо передать этот путь в качестве параметра при создании объекта WebDriver:

        System.setProperty("webdriver.chrome.driver", chromePath);
        WebDriver driver = new ChromeDriver();

        */