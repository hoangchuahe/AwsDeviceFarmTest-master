package tests;

import io.appium.java_client.MobileBy;
import org.testng.annotations.Test;

public class Interact extends BaseTest {
    @Test(priority = 1)
    public void test_login() throws InterruptedException  {
        driver.resetApp();
        new AppTest().Login();
        launchPharmacyApp();
        new Pharmacy().login();
    //}

//    @Test
//    public void test_on_demand() throws InterruptedException {
//        launchUserApp();
//        driver.findElementById("xyz.medigo.user:id/tv_find_pharmacy").click();
//        driver.findElementById("xyz.medigo.user:id/tvOrderNow").click();
//        Thread.sleep(2000);
//        launchPharmacyApp();
//        new Pharmacy().test_1();
//        launchUserApp();
//        // choose payment menthod
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]").click();
//        driver.findElementById("xyz.medigo.user:id/order_done").click();
//        driver.findElementById("xyz.medigo.user:id/rating_like_sure").click();
//        Thread.sleep(4000);
//        driver.findElementByAccessibilityId("Navigate up").click();
//    }
//    @Test
//    public void test_ecom() throws InterruptedException {
//        launchUserApp();
//        driver.findElementById("xyz.medigo.user:id/tab_medicine").click();
//        driver.findElementById("xyz.medigo.user:id/imgIconClose").click();
//        driver.findElementById("xyz.medigo.user:id/tvSearch").click();
//        driver.findElementById("xyz.medigo.user:id/edtSearch").sendKeys("soi");
//        Thread.sleep(500);
//        driver.findElement(MobileBy.AndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true))" +
//                        ".scrollIntoView(new UiSelector().textContains(\"tiết niệu\"))")).click();
//        driver.findElementById("xyz.medigo.user:id/tvBuyNow").click();
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]").click();
//        driver.findElementById("xyz.medigo.user:id/tvNext").click();
//        driver.findElementById("xyz.medigo.user:id/tvGoToHome").click();
//        launchPharmacyApp();
//        new Pharmacy().test_1();
//        launchUserApp();
//        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]").click();
//        driver.findElementById("xyz.medigo.user:id/order_done").click();
//        driver.findElementById("xyz.medigo.user:id/rating_like_sure").click();
//        Thread.sleep(2000);
//        driver.findElementByAccessibilityId("Navigate up").click();
//
//    }
//    @Test
//    public void message() throws InterruptedException {
//
//            //pharmacy
//            driver.findElementById("xyz.medigo.pharmacy:id/tab_message").click();
//            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"(Khách hàng)\")")).click();
//            driver.findElementById("xyz.medigo.pharmacy:id/tvCreateOrder").click();
//            driver.findElementById("xyz.medigo.pharmacy:id/tvCreateOrder").click();
//            driver.findElementById("xyz.medigo.pharmacy:id/lnAddMoreProduct").click();
//            driver.findElementByAccessibilityId("Từ kho hàng").click();
//            driver.findElementById("xyz.medigo.pharmacy:id/edtSearch").sendKeys("dong");
//            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"(Đông Trùng)\")")).click();
//            driver.findElementById("xyz.medigo.pharmacy:id/btnAddMedicine").click();
//            MobileElement el10_confirm_button = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView");
//            Thread.sleep(1500);
//            swipeElementAndroid(el10_confirm_button,"RIGHT", (AndroidDriver) driver, 800);
//            MobileElement el11 = driver.findElementById("xyz.medigo.pharmacy:id/btn_yes");
//            el11.click();
//
//            //user
//            launchUserApp();
//            driver.findElementById("xyz.medigo.user:id/btnConfirm").click();
//            driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"(COD)\")")).click();
//            driver.findElementById("xyz.medigo.user:id/order_done").click();
//            Thread.sleep(500);
//            driver.navigate().back();
//    }
//
//    @Test
//    public void on_demand_pharmacy() throws InterruptedException {
        //user
//        launchUserApp();
//        driver.findElementById("xyz.medigo.user:id/tv_find_pharmacy").click();
//        driver.findElementById("xyz.medigo.user:id/tvOrderNow").click();
//
//        //pharmacy
//        launchPharmacyApp();
//        driver.findElementById("xyz.medigo.pharmacy:id/btn_accept").click();
//        driver.findElementById("xyz.medigo.pharmacy:id/order_create").click();
//        driver.findElementById("xyz.medigo.pharmacy:id/lnAddMoreProduct").click();
//        driver.findElementByAccessibilityId("Từ kho hàng").click();
//        driver.findElementById("xyz.medigo.pharmacy:id/edtSearch").sendKeys("dong");
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Đông Trùng\")")).click();
//
//        driver.findElementById("xyz.medigo.pharmacy:id/btnAddMedicine").click();
//        driver.findElementById("xyz.medigo.pharmacy:id/button_cancel").click();
//        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Khách thử ứng dụng\")")).click();
//        driver.findElementById("xyz.medigo.pharmacy:id/btn_send_cancel").click();
//
//        launchUserApp();
//        driver.findElementById("xyz.medigo.user:id/tvFind_cancel").click();
//    }
//
//    @Test
//    public void on_demand_user() throws InterruptedException {
        launchUserApp();
        driver.findElementById("xyz.medigo.user:id/tv_find_pharmacy").click();
        driver.findElementById("xyz.medigo.user:id/tvOrderNow").click();

        //pharmacy
        launchPharmacyApp();
        driver.findElementById("xyz.medigo.pharmacy:id/btn_accept").click();
        driver.findElementById("xyz.medigo.pharmacy:id/order_create").click();
        driver.findElementById("xyz.medigo.pharmacy:id/lnAddMoreProduct").click();
        driver.findElementByAccessibilityId("Từ kho hàng").click();
        driver.findElementById("xyz.medigo.pharmacy:id/edtSearch").sendKeys("dong");
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Đông Trùng\")")).click();
        driver.findElementById("xyz.medigo.pharmacy:id/btnAddMedicine").click();

        //user
        launchUserApp();
        Thread.sleep(30000);
        driver.findElementById("xyz.medigo.user:id/tv_cancelPharmaRequest").click();
        driver.findElement(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\"Đợi nhà thuốc\")")).click();
        driver.findElementById("xyz.medigo.user:id/cancel_order_sent").click();
        driver.findElementById("xyz.medigo.user:id/find_cancel").click();
        Thread.sleep(500);
        driver.navigate().back();
    }
}
