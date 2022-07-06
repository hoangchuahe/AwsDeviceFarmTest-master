package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.*;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    static final String pharmacyAppPackage = "xyz.medigo.pharmacy";
    static final String pharmacyAppActivity = "xyz.medigo.pharmacy.ui.login.loginpharcode.LoginPharCodeActivity";
    public static AndroidDriver<MobileElement> driver;
    String userAppPackage = "xyz.medigo.user";
    String userAppActivity = "xyz.medigo.user.ui.login.LoginActivity";

    public static void swipeElementAndroid(MobileElement el, String dir, AndroidDriver user, int s) {
        final int ANIMATION_TIME = 500; // ms

        final int PRESS_TIME = 500; // ms
        Rectangle rect = el.getRect();
        PointOption pointOptionStart, pointOptionEnd;
        pointOptionStart = PointOption.point(rect.x, rect.y);
        switch (dir) {
            case "DOWN": // from up to down
                pointOptionEnd = PointOption.point(rect.x, rect.y - s);
                break;
            case "UP": // from down to up
                pointOptionEnd = PointOption.point(rect.x, rect.y + s);
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

    @BeforeTest
    public void setUpAppium() throws MalformedURLException {

        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        URL url = new URL(URL_STRING);
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("platformVersion", "10");
//        capabilities.setCapability("udid", "emulator-5554");
//        capabilities.setCapability("automationName", "UIAutomator2");
//        capabilities.setCapability("appPackage", userAppPackage);
//        capabilities.setCapability("appActivity", userAppActivity);
        //capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS, true);
        //capabilities.setCapability("locationContextEnabled", "true");
        driver = new AndroidDriver<>(url, capabilities);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @AfterTest
    public void tearDownAppium() {
        driver.quit();
    }

    public void launchUserApp() throws InterruptedException {

        driver.activateApp(userAppPackage);
        //Activity ac = new Activity(userAppPackage,userAppActivity);
        //driver.startActivity(ac);
        Thread.sleep(4000);
        Assert.assertEquals(userAppPackage, driver.getCurrentPackage());
    }

    public void launchPharmacyApp() throws InterruptedException {
//        Activity ac = new Activity(pharmacyAppPackage,pharmacyAppActivity);
//        driver.startActivity(ac);
        driver.activateApp(pharmacyAppPackage);
        Thread.sleep(4000);
        Assert.assertEquals(pharmacyAppPackage, driver.getCurrentPackage());
    }
}
