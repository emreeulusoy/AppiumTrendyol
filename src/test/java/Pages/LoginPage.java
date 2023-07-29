package Pages;

import Test.DriverFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class LoginPage extends DriverFactory {

    private final By Region = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/" +
            "android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/" +
            "android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView");
    private final By SelectGender = By.xpath("//android.widget.Button[@text='ERKEK']");
    private final By MyAccount = By.id("trendyol.com:id/tab_account");
    private final By Email = By.xpath("//android.widget.EditText[@text='E-Posta']");
    private final By Password = By.xpath("//android.widget.EditText[@text='Şifre']");
    private final By LoginButton = By.id("trendyol.com:id/buttonLogin");
    private final By HomePage = By.id("trendyol.com:id/tab_home");
    private final By CloseAds = By.id("trendyol.com:id/imageViewBottomArrow");

    public LoginPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void LoginTest() throws InterruptedException {

        driver.findElement(Region).click();
        Thread.sleep(4000);
        driver.findElement(SelectGender).click();
        Thread.sleep(2000);
        driver.findElement(MyAccount).click();
        Thread.sleep(2000);
        driver.findElement(Email).sendKeys("seleniumwd.template@gmail.com");
        driver.findElement(Password).sendKeys("seleniumwd1");
        Thread.sleep(2000);
        driver.findElement(LoginButton).click();
        Thread.sleep(4000);


    }

}
