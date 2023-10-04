package class05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/no-select-tag-dropdown-demo.php");

        WebElement dropDown = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div/div[2]/div/div"));
        dropDown.click();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div/div[2]/div/ul/li[1]/a")).click();
        Thread.sleep(3000);
        driver.quit();

    }
}
