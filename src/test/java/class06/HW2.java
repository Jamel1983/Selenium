package class06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class HW2 {
    //HW2:
    //goto gmail.com
    //click on help
    //click on privacy
    //click on terms
    //switch the focus on terms page and get the title and print on screeen
    //then switch the focus back to the gmail page
    //and print the title of the main page on screen
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://accounts.google.com/v3/signin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ifkv=AYZoVhdE8nIQS1QeBa1w-QmrUdWCKZZmqF90Qk5QMdUL_7VNwZoyA5ccqxGZraEhD8csA5XYk24DDQ&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&dsh=S-1492899710%3A1696468394715991&theme=glif");
        driver.manage().window().maximize();

        WebElement helpBttn = driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/ul/li[1]/a"));
        WebElement privacyBttn = driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/ul/li[2]/a"));
        WebElement termsBttn = driver.findElement(By.xpath("//*[@id=\"initialView\"]/c-wiz/footer/ul/li[3]/a"));

        helpBttn.click();
        privacyBttn.click();
        termsBttn.click();

        String gmailHandle = driver.getWindowHandle();

        Set<String> allHandles = driver.getWindowHandles();

        for(String handle : allHandles){
            driver.switchTo().window(handle);
            String title = driver.getTitle();
            if(title.equalsIgnoreCase("Google Terms of Service – Privacy & Terms – Google")){
                break;
            }
        }
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
