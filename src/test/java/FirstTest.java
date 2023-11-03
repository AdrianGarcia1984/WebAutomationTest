import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    WebDriver driver = null;

    @Test
    public void testWiki(){
        String driverPath = "C:\\Users\\Cervi\\IdeaProjects\\WebAutomation\\src\\utils\\driver\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();

        driver.navigate().to("https://www.wikipedia.org");

        WebElement searchInput = driver.findElement(By.id("searchInput"));
        WebElement input = driver.findElement(By.cssSelector(".footer-sidebar-text + div.footer-sidebar-text"));





        searchInput.sendKeys("selenium");

        WebElement searchBtn = driver.findElement(By.cssSelector("button[type=\"submit\"]"));

        searchBtn.click();

        Assert.assertNotEquals(input.getText(),"selenium");

        //driver.close();
    }
}
