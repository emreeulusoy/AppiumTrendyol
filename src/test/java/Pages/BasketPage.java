package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class BasketPage {

    public static AppiumDriver<MobileElement> driver;

    private final By IncreaseProduct = By.id("trendyol.com:id/image_add");
    private final By RemoveFromBasket = By.id("trendyol.com:id/imageViewDeleteProduct");
    private final By DeleteButton = By.id("trendyol.com:id/textViewBasketRemoveAction");

    public BasketPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void BasketTest() throws InterruptedException {

        driver.findElement(IncreaseProduct).click();
        Thread.sleep(2000);
        driver.findElement(RemoveFromBasket).click();
        Thread.sleep(2000);
        driver.findElement(DeleteButton).click();
        Thread.sleep(2000);

    }
}
