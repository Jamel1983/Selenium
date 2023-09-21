package class0;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) throws InterruptedException {
        //declare the instance of webdriver
        WebDriver driver= new ChromeDriver();

        //driver.get() navigates you to url
        driver.get("https://www.google.com");

        // maximize window
        driver.manage().window().maximize();

        //get the url
        String currentURl = driver.getCurrentUrl();
        System.out.println("The current URL is: " + currentURl);

        // get the title
        String title = driver.getTitle();
        System.out.println("The title is: " + title);

        Thread.sleep(2000);

        // close browser
        driver.quit();
    }
}
