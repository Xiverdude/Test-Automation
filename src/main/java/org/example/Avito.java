package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Avito {
    public static void main(String[] args) {
        String driverPath = "C:\\testATproject\\chromedriver\\chromedriver.exe";
        String chromePath = "C:\\testATproject\\chrome-win64\\chrome.exe";

        System.setProperty(driverPath, chromePath);  //передаем этот путь в качестве параметра при создании объекта WebDriver:
        WebDriver driver = new ChromeDriver();       //создаем новый драйвер
        driver.manage().window().maximize();    //делаем окно браузера на весь экран
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.get("https://www.avito.ru/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement input = driver.findElement(By.cssSelector("span[class='desktop-nev1ty']"));
        input.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        WebElement input2 = driver.findElement(By.cssSelector("input[data-marker=\"popup-location/region/input\"]"));

        input2.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement input3 = driver.findElement(By.cssSelector("li[data-marker=\"suggest(2)\"]"));
        input3.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement input4 = driver.findElement(By.cssSelector("button[data-marker='popup-location/save-button']"));
        input4.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        WebElement input5 = driver.findElement(By.cssSelector("input[data-marker=\"search-form/suggest\"]"));
        input5.sendKeys("Гантели");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        input4.sendKeys(Keys.CLEAR);

    }
}
