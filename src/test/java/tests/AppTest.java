package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppTest extends BaseTest {

	@Test
	public void Medigo_user() throws InterruptedException, MalformedURLException {
		final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
		URL url = new URL(URL_STRING);
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(AndroidMobileCapabilityType.AUTO_GRANT_PERMISSIONS,true);
		capabilities.setCapability("locationContextEnabled", "true");
		user = new AndroidDriver<MobileElement>(url, capabilities);
		user.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);

		MobileElement user2 = user.findElementById("xyz.medigo.user:id/edtPhoneNumber");
		user2.sendKeys("0987654321");
		MobileElement user3 = user.findElementById("xyz.medigo.user:id/btnGetSMSCode");
		user3.click();
		MobileElement user4 = user.findElementById("xyz.medigo.user:id/txt_pin_entry");
		user4.sendKeys("123456");
		MobileElement user5 = user.findElementById("xyz.medigo.user:id/btnVerifySMSCode");
		user5.click();

//		MobileElement user6 = user.findElementById("xyz.medigo.user:id/tv_allow_location");
//		user6.click();
//		MobileElement user7 = user.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button");
//		user7.click();

		MobileElement user8 = user.findElementById("xyz.medigo.user:id/home_finding_location");
		user8.click();
		MobileElement user9 = user.findElementById("xyz.medigo.user:id/tv_address");
		user9.click();
		MobileElement user10 = user.findElementById("xyz.medigo.user:id/action_done");
		user10.click();
		MobileElement user11 = user.findElementById("xyz.medigo.user:id/tab_medicine");
		user11.click();
		MobileElement user12 = user.findElementById("xyz.medigo.user:id/imgIconClose");
		user12.click();

		MobileElement user13 = user.findElementById("xyz.medigo.user:id/tvSearch");
		user13.click();
		MobileElement user14 = user.findElementById("xyz.medigo.user:id/edtSearch");
		user14.sendKeys("do");
		Thread.sleep(500);
		user.navigate().back();
		MobileElement user141 = user.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
						".scrollIntoView(new UiSelector().textContains(\"Đông Trùng Hạ Thảo\"))"));

		user141.click();
		MobileElement user142 = user.findElementById("xyz.medigo.user:id/tvBuyNow");
		user142.click();

		MobileElement user20 = user.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]");
		user20.click();
		MobileElement user21 = user.findElementById("xyz.medigo.user:id/tvNext");
		user21.click();
		MobileElement user22 = user.findElementById("xyz.medigo.user:id/tvOrderSucessView");
		user22.click();

		WebDriverWait wait = new WebDriverWait(user, 30);
		wait.until(ExpectedConditions.visibilityOf(user.findElementById("com.android.permissioncontroller:id/permission_allow_button")));
		MobileElement user23 = user.findElementById("com.android.permissioncontroller:id/permission_allow_button");
		user23.click();
		MobileElement user24 = user.findElementById("xyz.medigo.user:id/audio_btn_answer");
		user24.click();

		WebDriverWait wait2 = new WebDriverWait(user, 30);
		wait2.until(ExpectedConditions.visibilityOf(user.findElementById("xyz.medigo.user:id/shipper_number")));
		user.navigate().back();
		MobileElement user26 = user.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup");
		user26.click();
		user.quit();
	}


}
