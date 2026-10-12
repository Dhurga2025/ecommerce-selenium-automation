import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;

public class SearchTest {
    @Test
    public void testSearchAndSort() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        
        Select sort = new Select(driver.findElement(By.className("product_sort_container")));
        sort.selectByVisibleText("Price (low to high)");
        System.out.println("Search Test Passed");
        driver.quit();
    }
          }
