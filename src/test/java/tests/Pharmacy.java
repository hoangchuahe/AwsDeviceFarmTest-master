package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class Pharmacy extends BaseTest {
//    @BeforeMethod
//    public void launch() throws InterruptedException {
//        launchPharmacyApp();
//    }

    @Test
    public void login() {
        driver.findElementById("xyz.medigo.pharmacy:id/login_phar_code").sendKeys("automation");
        driver.findElementById("xyz.medigo.pharmacy:id/continue_button").click();
        driver.findElementById("xyz.medigo.pharmacy:id/login_email").sendKeys("automation@gmail.com");
        driver.findElementById("xyz.medigo.pharmacy:id/login_password").sendKeys("123123");
        driver.findElementById("xyz.medigo.pharmacy:id/login_button").click();
    }

    @Test // Accept
    public void test_1() throws InterruptedException {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"NHẬN ĐƠN\"))")).click();
        driver.findElementById("xyz.medigo.pharmacy:id/order_create").click();
        driver.findElementById("xyz.medigo.pharmacy:id/lnAddMoreProduct").click();
        driver.findElementByAccessibilityId("Từ kho hàng").click();
        driver.findElementById("xyz.medigo.pharmacy:id/edtSearch").sendKeys("do");
//        driver.findElement(MobileBy.AndroidUIAutomator(
//                "new UiScrollable(new UiSelector().scrollable(true))" +
//                        ".scrollIntoView(new UiSelector().textContains(\"Tăng cường sức khỏe\"))")).click();
        driver.findElementByAndroidUIAutomator("new UiSelector().textContains(\"Tăng cường sức khỏe\")").click();
        driver.findElementById("xyz.medigo.pharmacy:id/tvPlusOne").click();
        driver.findElementById("xyz.medigo.pharmacy:id/btnAddMedicine").click();
        MobileElement el23 = driver.findElementById("xyz.medigo.pharmacy:id/button_send");
        Thread.sleep(1500);

        swipeElementAndroid(el23, "RIGHT", driver, 1000);

        driver.findElementById("xyz.medigo.pharmacy:id/btn_yes").click();

    }

    @Test(priority = 2) // Modify product
    public void product() throws InterruptedException {
        driver.findElementById("xyz.medigo.pharmacy:id/tab_warehouse").click();
        Thread.sleep(1000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"THÊM SẢN PHẨM MỚI\"))")).click();
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText").sendKeys("b");
        Thread.sleep(1000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"Gel tẩy\"))")).click();
        Thread.sleep(1000);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[8]/android.view.View[4]/android.widget.EditText").sendKeys("333333");
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[8]/android.view.View[6]/android.widget.EditText").sendKeys("444444");
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"HOÀN THÀNH\"))")).click();
        Thread.sleep(1000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"OK\"))")).click();
        Thread.sleep(1000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"Gel tẩy\"))")).click();
        Thread.sleep(1000);
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View[4]/android.widget.EditText").sendKeys("222222");
        driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View[6]/android.widget.EditText").sendKeys("333333");
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"HOÀN THÀNH\"))")).click();
        Thread.sleep(1000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"Gel tẩy\"))")).click();
        Thread.sleep(1000);
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"Xoá\"))")).click();
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"OK\"))")).click();
    }
}
