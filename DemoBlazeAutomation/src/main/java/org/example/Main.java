package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://duckduckgo.com/");
        WebElement search = driver.findElement(By.id("searchbox_input"));
search.sendKeys("panda");
        WebElement tool = driver.findElement(By.xpath("//path[@fill='currentColor']"));
        tool.click();

//        driver.navigate().to("https://www.facebook.com");
//        driver.navigate().back();
//        driver.manage().window().fullscreen();
//        driver.manage().window().maximize();
//
//        driver.close();
//        driver.quit();


    }
}