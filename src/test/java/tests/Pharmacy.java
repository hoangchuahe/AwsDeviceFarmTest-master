package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class Pharmacy extends BaseTest{
    @Test
    public void Pharmacy_side() throws InterruptedException {
    MobileElement pharmacy2 = user.findElementById("xyz.medigo.pharmacy:id/login_phar_code");
        pharmacy2.sendKeys("cuongmedi");
    MobileElement pharmacy3 = user.findElementById("xyz.medigo.pharmacy:id/continue_button");
        pharmacy3.click();
    MobileElement pharmacy4 = user.findElementById("xyz.medigo.pharmacy:id/login_email");
        pharmacy4.sendKeys("lalala@gmail.com");
    MobileElement pharmacy5 = user.findElementById("xyz.medigo.pharmacy:id/login_password");
        pharmacy5.sendKeys("123123");
    MobileElement pharmacy6 = user.findElementById("xyz.medigo.pharmacy:id/login_button");
        pharmacy6.click();

    WebDriverWait wait = new WebDriverWait(user, 60);
        wait.until(ExpectedConditions.visibilityOf(user.findElementById("xyz.medigo.pharmacy:id/btn_accept")));
    MobileElement pharmacy7 = user.findElementById("xyz.medigo.pharmacy:id/btn_accept");
        pharmacy7.click();
    MobileElement pharmacy8 = user.findElementById("xyz.medigo.pharmacy:id/button_call_free");
        pharmacy8.click();
    MobileElement pharmacy9 = user.findElementById("com.android.permissioncontroller:id/permission_allow_button");
        pharmacy9.click();

        Thread.sleep(5000);

    MobileElement pharmacy10 = user.findElementById("xyz.medigo.pharmacy:id/audio_btn_end");
        pharmacy10.click();
    MobileElement pharmacy11 = user.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.TextView");
        pharmacy11.click();

    MobileElement pharmacy12 = user.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView");

        Thread.sleep(500);
    swipeElementAndroid(pharmacy12,"RIGHT", (AndroidDriver) user, 800);

    MobileElement pharmacy13 = user.findElementById("xyz.medigo.pharmacy:id/btn_yes");
        pharmacy13.click();
    MobileElement pharmacy14 = user.findElementById("xyz.medigo.pharmacy:id/tvViewOrder");
        pharmacy14.click();

        Thread.sleep(500);
        user.navigate().back();
        user.quit();
}

    public static void swipeElementAndroid(MobileElement el, String dir, AndroidDriver user, int s) {
        final int ANIMATION_TIME = 500; // ms

        final int PRESS_TIME = 500; // ms
        Rectangle rect = el.getRect();
        PointOption pointOptionStart, pointOptionEnd;
        pointOptionStart = PointOption.point(rect.x, rect.y);
        switch (dir) {
            case "DOWN": // from up to down
                pointOptionEnd = PointOption.point(rect.x , rect.y - s);
                break;
            case "UP": // from down to up
                pointOptionEnd = PointOption.point(rect.x , rect.y + s);
                break;
            case "LEFT": // from right to left
                pointOptionEnd = PointOption.point(rect.x - s, rect.y);
                break;
            case "RIGHT": // from left to right
                pointOptionEnd = PointOption.point(rect.x + s, rect.y);
                break;
            default:
                throw new IllegalArgumentException("swipeElementAndroid(): dir: '" + dir + "' NOT supported");
        }

        // execute swipe using TouchAction
        try {
            new TouchAction(user)
                    .press(pointOptionStart)
                    // a bit more reliable when we add small wait
                    .waitAction(WaitOptions.waitOptions(Duration.ofMillis(PRESS_TIME)))
                    .moveTo(pointOptionEnd)
                    .release().perform();
        } catch (Exception e) {
            System.err.println("swipeElementAndroid(): TouchAction FAILED\n" + e.getMessage());
            return;
        }

        // always allow swipe action to complete
        try {
            Thread.sleep(ANIMATION_TIME);
        } catch (InterruptedException e) {
            // ignore
        }
    }
}
