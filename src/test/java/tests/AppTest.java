package tests;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AppTest extends BaseTest {

	@Test
	public void Login() throws InterruptedException {
		driver.findElementById("xyz.medigo.user:id/edtPhoneNumber").sendKeys("0987654321");
		driver.findElementById("xyz.medigo.user:id/btnGetSMSCode").click();
		driver.findElementById("xyz.medigo.user:id/txt_pin_entry").sendKeys("123456");
		driver.findElementById("xyz.medigo.user:id/btnVerifySMSCode").click();
		driver.findElementById("xyz.medigo.user:id/tv_allow_location").click();
		driver.findElementById("com.android.permissioncontroller:id/permission_allow_foreground_only_button").click();
		driver.findElementById("xyz.medigo.user:id/home_finding_location").click();
		driver.findElementById("xyz.medigo.user:id/tv_address").click();
		driver.findElementById("xyz.medigo.user:id/action_done").click();
	}
		@Test
		public void Cart() throws InterruptedException {
		MobileElement user8 = driver.findElementById("xyz.medigo.user:id/home_finding_location");
		user8.click();
		MobileElement user9 = driver.findElementById("xyz.medigo.user:id/tv_address");
		user9.click();
		MobileElement user10 = driver.findElementById("xyz.medigo.user:id/action_done");
		user10.click();
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
		MobileElement user141 = driver.findElement(MobileBy.AndroidUIAutomator(
				"new UiScrollable(new UiSelector().scrollable(true))" +
						".scrollIntoView(new UiSelector().textContains(\"Tăng cường sức khỏe\"))"));

		user141.click();
		MobileElement user142 = driver.findElementById("xyz.medigo.user:id/tvBuyNow");
		user142.click();

		MobileElement user20 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.ImageView[1]");
		user20.click();
		MobileElement user21 = driver.findElementById("xyz.medigo.user:id/tvNext");
		user21.click();
		MobileElement user22 = driver.findElementById("xyz.medigo.user:id/tvOrderSucessView");
		user22.click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElementById("com.android.permissioncontroller:id/permission_allow_button")));
		MobileElement user23 = driver.findElementById("com.android.permissioncontroller:id/permission_allow_button");
		user23.click();
		MobileElement user24 = driver.findElementById("xyz.medigo.user:id/audio_btn_answer");
		user24.click();

		WebDriverWait wait2 = new WebDriverWait(driver, 30);
		wait2.until(ExpectedConditions.visibilityOf(driver.findElementById("xyz.medigo.user:id/shipper_number")));
		driver.navigate().back();
		MobileElement user26 = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.view.ViewGroup");
		user26.click();
		driver.quit();
	}

}
