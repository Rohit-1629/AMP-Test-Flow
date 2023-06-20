package org.example.amazon;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



    public class AmazonTest {

        public static void main(String[] args) {
            // Set the path to your ChromeDriver executable
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\rohitshgupta\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");

            // Launch the Chrome browser
            WebDriver driver = new ChromeDriver();

            // 1. Open the website: https://www.amazon.in and login to your account
            driver.get("https://www.amazon.in");

            // 2. Search Product in search bar
            driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Iphone 13");
            driver.findElement(By.id("nav-search-submit-button")).click();

            // 3. Select 1st product from the list (Blue colour - Iphone 13)
            driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();

            // 4. Click on add to cart and the product will get added
            ArrayList<String> newTb = new ArrayList<String>(driver.getWindowHandles());
            driver.switchTo().window(newTb.get(1));
            driver.findElement(By.id("add-to-cart-button")).click();

            driver.quit();
        }
    }
