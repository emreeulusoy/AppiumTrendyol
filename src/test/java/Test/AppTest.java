package Test;

import Pages.BasketPage;
import Pages.LoginPage;
import Pages.SearchPage;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AppTest extends DriverFactory {

LoginPage loginPage;
SearchPage searchPage;
BasketPage basketPage;

    @Test
    public void appTest() throws InterruptedException {

        loginPage = new LoginPage(driver);
        searchPage = new SearchPage(driver);
        basketPage = new BasketPage(driver);

        loginPage.LoginTest();
        driver.findElement(By.id("trendyol.com:id/tab_home")).click();
        Thread.sleep(4000);
        searchPage.SearchTest();
        basketPage.BasketTest();

    }
}
