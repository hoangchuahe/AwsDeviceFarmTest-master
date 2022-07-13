package tests;

import org.testng.annotations.Test;

public class AppTest extends BaseTest {

    @Test
    public void Login() throws InterruptedException {
        driver.findElementById("xyz.medigo.user:id/edtPhoneNumber").sendKeys("3216549870");
        driver.findElementById("xyz.medigo.user:id/btnGetSMSCode").click();
        driver.findElementById("xyz.medigo.user:id/txt_pin_entry").sendKeys("123456");
        driver.findElementById("xyz.medigo.user:id/btnVerifySMSCode").click();
        driver.findElementById("xyz.medigo.user:id/tv_input_location").click();
        driver.findElementById("xyz.medigo.user:id/tv_address").click();
        driver.findElementById("xyz.medigo.user:id/action_done").click();
    }

}
