package class07;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonMethods;

import java.time.Duration;

public class HW1 extends CommonMethods {
    //click to open alert and handle it
    //click to change text and get the changed text
    //click to get hidden button click on it
    //click to get tge checkbox selected and print if it is selected or not
    public static void main(String[] args) {
        String url = "http://35.175.58.98/synchronization-explicit-wait.php";
        String browser = "chrome";
        openBrowserAndLaunchApplication(url, browser);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        //click to open alert and handle it
        WebElement alertbutton = driver.findElement(By.id("show_alert"));
        if(alertbutton.isDisplayed()) {
            try {
                alertbutton.click();
                wait.until(ExpectedConditions.alertIsPresent());
                driver.switchTo().alert().accept();
                driver.switchTo().defaultContent();
            } catch (NoAlertPresentException e){
                System.out.println("The cause of the exception is: " + e.getCause());
            }
        }

        //click to change text and get the changed text
        try {
            WebElement changeText = driver.findElement(By.id("changetext_button"));
            if(changeText.isEnabled()) {
                changeText.click();
                WebElement newText = driver.findElement(By.xpath("//h2[text()='Ssyntaxtechs']"));
                wait.until(ExpectedConditions.visibilityOf(newText));
            } else {
                System.out.println("Change text button is not enabled");
            }
        } catch (ElementNotInteractableException e) {
            System.out.println("The cause of the error is: " + e.getCause());
        }


        //click to get hidden button click on it
        WebElement displayBttn = driver.findElement(By.id("display_button"));
        displayBttn.click();
        try {
            wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Enabled']")));
            WebElement enabledBttn = driver.findElement(By.xpath("//button[text()='Enabled']"));
            if(enabledBttn.isEnabled()){
                enabledBttn.click();
            } else {
                System.out.println("Enable button is not enabled");
            }
        } catch (Exception e){
            System.out.println(e.getCause());
        }

        //click to get tge checkbox selected and print if it is selected or not
        try{
            WebElement checkboxBttn = driver.findElement(By.id("checkbox_button"));
            checkboxBttn.click();

            WebElement checkbox = driver.findElement(By.id("checkbox"));
            wait.until(ExpectedConditions.elementToBeSelected(checkbox));
            System.out.println(checkbox.getText());
            if(checkbox.isSelected()){
                WebElement checkboxtext = driver.findElement(By.xpath("//label[contains(text(),CheckBox)]"));
                System.out.println("The element text is: " + checkboxtext.getText());
            } else {
                System.out.println("Can't find text");
            }
        } catch (Exception e){
            System.out.println("Could not find text");
        }

        closeBrowser();
    }
}
