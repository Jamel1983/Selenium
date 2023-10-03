package class04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW2 {
    //HW2:
    //Navigate to http://35.175.58.98/basic-radiobutton-demo.php.
    //Check if the "Female" radio button is displayed.
    //Click on the "Show Button".
    //Check again if the "Female" radio button is displayed or not.
    //Print the results of the checks to the console.
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/basic-radiobutton-demo.php");

        WebElement femaleRadioBttn = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/label[2]/input"));

        if(femaleRadioBttn.isDisplayed()){
            femaleRadioBttn.click();
        } else{
            driver.findElement(By.id("toggleRadioButtons")).click();
        }

        if(femaleRadioBttn.isDisplayed()){
            System.out.println(femaleRadioBttn.isDisplayed());
            Thread.sleep(3000);
            driver.quit();
        } else {
            System.out.println("Female radio button is not displayed");
        }


    }
}
