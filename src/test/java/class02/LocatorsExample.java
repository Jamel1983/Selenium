package class02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.sql.Driver;
import java.util.List;

public class LocatorsExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard");
        driver.manage().window().maximize();

        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        List<WebElement> links = driver.findElements(By.tagName("a"));

        for (WebElement link : links){
            String nameOflink = link.getText();
            System.out.println(nameOflink);
            System.out.println(links.size());
        }
    }
}
