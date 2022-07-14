package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class SupportFunc extends BaseTest{
    public static void pharmacy_modify() throws InterruptedException {
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



}
