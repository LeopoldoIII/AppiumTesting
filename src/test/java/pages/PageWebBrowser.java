package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PageWebBrowser {


    public PageWebBrowser(AppiumDriver<MobileElement> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Mobile Elements

    @AndroidFindBy(id = "com.android.chrome:id/search_box_text")
    private MobileElement txtBoxSearch;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout[1]/android.widget.ListView/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView")
    public MobileElement btnFirstResult;



    // First Functions it calls Mobile Elements
    public void webRequest(AndroidDriver<MobileElement> driver, String baseURL) {

        driver.get(baseURL);


    }


}
