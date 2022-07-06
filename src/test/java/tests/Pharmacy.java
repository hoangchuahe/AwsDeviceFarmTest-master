package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

public class Pharmacy extends BaseTest {

    @Test // Accept
    public void test_1() throws InterruptedException {
        driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"NHẬN ĐƠN\"))")).click();
        driver.findElementById("xyz.medigo.pharmacy:id/order_create").click();
        driver.findElementById("xyz.medigo.pharmacy:id/lnAddMoreProduct").click();
        driver.findElementByAccessibilityId("Từ kho hàng").click();
        driver.findElementById("xyz.medigo.pharmacy:id/edtSearch").sendKeys("do");
        driver.findElementById("xyz.medigo.pharmacy:id/tvProductName").click();
        driver.findElementById("xyz.medigo.pharmacy:id/tvPlusOne").click();
        driver.findElementById("xyz.medigo.pharmacy:id/btnAddMedicine").click();
        MobileElement el23 = driver.findElementById("xyz.medigo.pharmacy:id/button_send");
        Thread.sleep(1500);

        swipeElementAndroid(el23, "RIGHT", driver, 800);

        driver.findElementById("xyz.medigo.pharmacy:id/btn_yes").click();

    }
    @Test// Login
    public void test_2() throws InterruptedException {
        // wrong login code
        MobileElement el1 = driver.findElementById("xyz.medigo.pharmacy:id/login_phar_code");
        el1.sendKeys("cuonglala");
        MobileElement el2 = driver.findElementById("xyz.medigo.pharmacy:id/continue_button");
        el2.click();
        // popup
        MobileElement el3 = driver.findElementById("android:id/button1");
        el3.click();
        // login again
        MobileElement el4 = driver.findElementById("xyz.medigo.pharmacy:id/login_phar_code");
        el4.sendKeys("cuongmedi");
        MobileElement el5 = driver.findElementById("xyz.medigo.pharmacy:id/continue_button");
        el5.click();
        // email and pass
        MobileElement el6 = driver.findElementById("xyz.medigo.pharmacy:id/login_email");
        el6.sendKeys("lalala@gmail.com");
        MobileElement el7 = driver.findElementById("xyz.medigo.pharmacy:id/login_password");
        el7.sendKeys("321321"); // login fail
        MobileElement el8 = driver.findElementById("xyz.medigo.pharmacy:id/login_button");
        el8.click();
        MobileElement el9 = driver.findElementById("android:id/button1");
        el9.click();
        // re input pass
        MobileElement el10 = driver.findElementById("xyz.medigo.pharmacy:id/login_password");
        el10.sendKeys("123123");
        MobileElement el11 = driver.findElementById("xyz.medigo.pharmacy:id/login_button");
        el11.click();
        Thread.sleep(2000);
    }

    @Test(priority = 2) // Modify product
    public void test_3() throws InterruptedException {
        MobileElement el25 = driver.findElementById("xyz.medigo.pharmacy:id/tab_warehouse");
        el25.click();
        Thread.sleep(1000);
        MobileElement el26 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"THÊM SẢN PHẨM MỚI\"))"));
        el26.click();
        MobileElement el27 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View/android.widget.EditText");
        el27.sendKeys("b");
        Thread.sleep(1000);
        MobileElement el28 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"Gel tẩy\"))"));
        el28.click();
        Thread.sleep(1000);
        MobileElement el29 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[8]/android.view.View[4]/android.widget.EditText");
        el29.sendKeys("333333");
        MobileElement el30 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[2]/android.view.View[8]/android.view.View[6]/android.widget.EditText");
        el30.sendKeys("444444");
        MobileElement el31 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"HOÀN THÀNH\"))"));
        el31.click();
        Thread.sleep(1000);
        MobileElement el32 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"OK\"))"));
        el32.click();
        Thread.sleep(1000);
        MobileElement el33 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"Gel tẩy\"))"));
        el33.click();
        Thread.sleep(1000);
        MobileElement el34 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View[4]/android.widget.EditText");
        el34.sendKeys("222222");
        MobileElement el35 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[8]/android.view.View[6]/android.widget.EditText");
        el35.sendKeys("333333");
        MobileElement el36 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"HOÀN THÀNH\"))"));
        el36.click();
        Thread.sleep(1000);
        MobileElement el37 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"Gel tẩy\"))"));
        el37.click();
        Thread.sleep(1000);
        MobileElement el38 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"Xoá\"))"));
        el38.click();
        MobileElement el39 = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().textContains(\"OK\"))"));
        el39.click();
    }

    @Test(priority = 2) // Modify Password
    public void test_4() throws InterruptedException {
        MobileElement el40 = driver.findElementById("xyz.medigo.pharmacy:id/tab_account");
        Thread.sleep(1000);
        el40.click();
        MobileElement el41 = driver.findElementById("xyz.medigo.pharmacy:id/info_change_pass");
        el41.click();
        MobileElement el42 = driver.findElementById("xyz.medigo.pharmacy:id/current_password");
        el42.sendKeys("123123");
        MobileElement el43 = driver.findElementById("xyz.medigo.pharmacy:id/new_password");
        el43.sendKeys("123456");
        MobileElement el44 = driver.findElementById("xyz.medigo.pharmacy:id/verify_password");
        el44.sendKeys("123456");
        MobileElement el45 = driver.findElementById("xyz.medigo.pharmacy:id/button_change_complete");
        el45.click();
        MobileElement el46 = driver.findElementById("android:id/button1");
        el46.click();
        MobileElement el47 = driver.findElementById("xyz.medigo.pharmacy:id/rlLogout");
        el47.click();
        MobileElement el48 = driver.findElementById("android:id/button1");
        el48.click();
        MobileElement el49 = driver.findElementById("xyz.medigo.pharmacy:id/continue_button");
        el49.click();
        MobileElement el50 = driver.findElementById("xyz.medigo.pharmacy:id/login_email");
        el50.sendKeys("lalala@gmail.com");
        MobileElement el51 = driver.findElementById("xyz.medigo.pharmacy:id/login_password");
        el51.sendKeys("123456");
        MobileElement el52 = driver.findElementById("xyz.medigo.pharmacy:id/login_button");
        el52.click();
        MobileElement el53 = driver.findElementById("xyz.medigo.pharmacy:id/tab_account");
        el53.click();
        MobileElement el54 = driver.findElementById("xyz.medigo.pharmacy:id/info_change_pass");
        el54.click();
        MobileElement el55 = driver.findElementById("xyz.medigo.pharmacy:id/current_password");
        el55.sendKeys("123456");
        MobileElement el56 = driver.findElementById("xyz.medigo.pharmacy:id/new_password");
        el56.sendKeys("123123");
        MobileElement el57 = driver.findElementById("xyz.medigo.pharmacy:id/verify_password");
        el57.sendKeys("123123");
        MobileElement el58 = driver.findElementById("xyz.medigo.pharmacy:id/button_change_complete");
        el58.click();
        MobileElement el59 = driver.findElementById("android:id/button1");
        el59.click();
        System.out.println("Success");
    }
}
