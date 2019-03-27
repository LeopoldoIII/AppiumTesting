package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class PageExample {


    public PageExample(AppiumDriver<MobileElement> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    //Mobile Elements

    @AndroidFindBy(id = "com.example.mobileapp:id/btn_example")
    public MobileElement btnExample;


    @AndroidFindBy(id = "com.example.mobileapp:id/txt_Example")
    public MobileElement txtExample;


    @AndroidFindBy(id = "com.example.mobileapp:id/txtBox_Example")
    public MobileElement txtBoxExample;

    @AndroidFindBy(id = "com.example.mobileapp:id/txtList_Example")
    public MobileElement txtListExample;

    @AndroidFindBy(id = "com.example.mobileapp:id/chkBox_Example")
    public MobileElement chkBox;



    // First Functions it calls Mobile Elements
    public void fuctionExample(AndroidDriver<MobileElement> driver) {

        btnExample.click();
        txtExample.getText();
        txtBoxExample.sendKeys("TextExample");
        txtListExample.click();

    }


}



