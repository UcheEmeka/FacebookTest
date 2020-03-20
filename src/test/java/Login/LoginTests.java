package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "resources/geckodriver.exe");
        driver = new FirefoxDriver();

        driver.get("https://www.facebook.com");
        Thread.sleep(5000);
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("enter sample email address here");
        driver.findElement(By.id("pass")).sendKeys("enter sample password here");
        driver.findElement(By.id("u_0_b")).click();

        driver.close();
    }

    public static void main(String args[]) throws InterruptedException
    {
        LoginTests test = new LoginTests();
        test.setUp();
    }
}
