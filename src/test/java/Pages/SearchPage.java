package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;

public class SearchPage {

    public static AppiumDriver<MobileElement> driver;

    private final By SearchArea = By.id("trendyol.com:id/edittext_search_view");
    private final By SearchButton = By.id("trendyol.com:id/imageview_action_start");
    private final By SelectSearched = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/android.widget.LinearLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.ScrollView/android.widget.FrameLayout/" +
            "androidx.appcompat.widget.LinearLayoutCompat/androidx.appcompat.widget.LinearLayoutCompat/" +
            "androidx.appcompat.widget.LinearLayoutCompat/androidx.recyclerview.widget.RecyclerView/android.widget.RelativeLayout[1]/android.widget.TextView[1]");
    private final By SelectProduct = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/" +
            "android.widget.FrameLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout[1]/w1.a/android.widget.LinearLayout/" +
            "android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[2]/" +
            "android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.view.ViewGroup/androidx.viewpager.widget.ViewPager/" +
            "androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout/android.widget.ImageView");
    private final By AddToBasket = By.id("trendyol.com:id/primaryButton");
    private final By GoToBasket = By.id("trendyol.com:id/textViewNavigateToBasket");
    private final By ApproveBasket = By.id("trendyol.com:id/buttonReservationlessCartDialogMain");
    private final By ApproveBasket2 = By.id("trendyol.com:id/buttonApproveBasket");
    private final By TooltipClose = By.id("trendyol.com:id/imageViewTooltipClose");

    public SearchPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
    }

    public void SearchTest() throws InterruptedException {

        driver.findElement(SearchButton).click();
        Thread.sleep(2000);
        driver.findElement(SearchArea).sendKeys("bilgisayar");
        Thread.sleep(2000);
        driver.findElement(SelectSearched).click();
        Thread.sleep(2000);
        driver.findElement(SelectProduct).click();
        Thread.sleep(2000);
        driver.findElement(AddToBasket).click();
        Thread.sleep(2000);
        driver.findElement(GoToBasket).click();
        Thread.sleep(2000);
    }

}
