package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class Interact extends BaseTest {
    @Test
    public void test_login() throws InterruptedException {
        //Activity ac = new Activity(userAppPackage,userAppActivity);
        //driver.startActivity(ac);
        driver.resetApp();
        driver.findElementById("xyz.medigo.user:id/edtPhoneNumber").sendKeys("0987654321");
        driver.findElementById("xyz.medigo.user:id/btnGetSMSCode").click();
        driver.findElementById("xyz.medigo.user:id/txt_pin_entry").sendKeys("123456");
        driver.findElementById("xyz.medigo.user:id/btnVerifySMSCode").click();
        driver.findElementById("xyz.medigo.user:id/tv_allow_location").click();
        driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
        driver.findElementById("xyz.medigo.user:id/home_finding_location").click();
        driver.findElementById("xyz.medigo.user:id/tv_address").click();
        driver.findElementById("xyz.medigo.user:id/action_done").click();

        launchPharmacyApp();
        driver.findElementById("xyz.medigo.pharmacy:id/login_phar_code").sendKeys("cuongmedi");
        driver.findElementById("xyz.medigo.pharmacy:id/continue_button").click();
        driver.findElementById("xyz.medigo.pharmacy:id/login_email").sendKeys("lalala@gmail.com");
        driver.findElementById("xyz.medigo.pharmacy:id/login_password").sendKeys("123123");
        driver.findElementById("xyz.medigo.pharmacy:id/login_button").click();
//    }

//    @Test
//    public void test_on_demand() throws InterruptedException {
        launchUserApp();
        //xyz.medigo.user:id/tvCancel
        //xyz.medigo.user:id/imgIconPaymentSelected
        driver.findElementById("xyz.medigo.user:id/tv_find_pharmacy").click();
        driver.findElementById("xyz.medigo.user:id/tvOrderNow").click();
        Thread.sleep(2000);

        launchPharmacyApp();
        new Pharmacy().test_1();

        launchUserApp();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]").click();
        driver.findElementById("xyz.medigo.user:id/order_done").click();
        driver.findElementById("xyz.medigo.user:id/rating_like_sure").click();
        Thread.sleep(4000);
        driver.findElementByAccessibilityId("Navigate up").click();
//    }
//    @Test
//    public void test_ecom() throws InterruptedException {
        launchUserApp();
        //xyz.medigo.user:id/tvCancel
        //xyz.medigo.user:id/imgIconPaymentSelected
        MobileElement user11 = driver.findElementById("xyz.medigo.user:id/tab_medicine");
        user11.click();
        MobileElement user12 = driver.findElementById("xyz.medigo.user:id/imgIconClose");
        user12.click();
        MobileElement user13 = driver.findElementById("xyz.medigo.user:id/tvSearch");
        user13.click();
        MobileElement user14 = driver.findElementById("xyz.medigo.user:id/edtSearch");
        user14.sendKeys("do");
        Thread.sleep(500);
        driver.navigate().back();
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"Tăng cường sức khỏe\"))")).click();

        driver.findElementById("xyz.medigo.user:id/tvBuyNow").click();

        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]").click();
        driver.findElementById("xyz.medigo.user:id/tvNext").click();
        driver.findElementById("xyz.medigo.user:id/tvGoToHome").click();
        launchPharmacyApp();
        new Pharmacy().test_1();
        launchUserApp();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]").click();
        driver.findElementById("xyz.medigo.user:id/order_done").click();
        driver.findElementById("xyz.medigo.user:id/rating_like_sure").click();
        Thread.sleep(2000);
        driver.findElementByAccessibilityId("Navigate up").click();

    }
}
