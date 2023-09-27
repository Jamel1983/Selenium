package class03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("http://35.175.58.98/Xpath.php");
        driver.manage().window().maximize();

        WebElement textBox1 = driver.findElement(By.xpath("//*[@id='title']"));
        textBox1.sendKeys("batch17");

        WebElement textBox2 = driver.findElement(By.xpath("//*[@id=\"DisplayName\"]"));
        textBox2.sendKeys("Jamel");

        WebElement textBox3 = driver.findElement(By.xpath("//input[contains(@name, 'security')]"));
        textBox3.sendKeys("What is the color of the Sun?");

        WebElement themagicalText = driver.findElement(By.xpath("//label[contains(text(),'Lorem')]"));
        System.out.println(themagicalText.getText());

        WebElement apiTextBox = driver.findElement(By.xpath("//input[starts-with(@id,'apiSettings')]"));
        apiTextBox.sendKeys("abracadabra");

        WebElement email1 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[1]"));
        email1.sendKeys("hello@gmail.com");

        WebElement email2 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[2]"));
        email2.sendKeys("hi@gmail.com");

        WebElement email3 = driver.findElement(By.xpath("(//input[@class='form-control backup'])[3]"));
        email3.sendKeys("bye@gmail.com");

        WebElement textField1 = driver.findElement(By.xpath("(//input[@name='customField' and @data-detail='one'])"));
        textField1.sendKeys("Found you");

        WebElement textField2 = driver.findElement(By.xpath("(//input[@name='customField' and @data-detail='two'])"));
        textField2.sendKeys("Ha found you too");

        WebElement textBoxField1 = driver.findElement(By.xpath("(//input[@name='customField1' and @data-detail='one'])"));
        textBoxField1.sendKeys("You can't hide");

        WebElement textBoxField2 = driver.findElement(By.xpath("(//input[@name='customField1' and @data-detail='two'])"));
        textBoxField2.sendKeys("Gonna find you");

    }
}
