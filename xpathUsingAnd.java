package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xpathUsingAnd {
    public static void main(String[] args ) {

        System.setProperty("webdriver.chrome.driver.", "Utils/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@name='field-keywords' and @class='nav-input nav-progressive-attribute']")).sendKeys("Coffee");
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@name='field-keywords' and @class='nav-input nav-progressive-attribute']")).clear();
        driver.findElement(By.xpath("//input[@name='field-keywords' and @class='nav-input nav-progressive-attribute']")).sendKeys("Tea");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button' and @type='submit']")).click();

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.close();
    }
}
