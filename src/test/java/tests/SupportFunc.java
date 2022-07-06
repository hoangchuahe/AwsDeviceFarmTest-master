package tests;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class SupportFunc extends BaseTest{
    WebDriverWait wait = new WebDriverWait(driver, 3);
    private void P_code(String code){
        driver.findElementById("xyz.medigo.pharmacy:id/login_phar_code").sendKeys(code);
        driver.findElementById("xyz.medigo.pharmacy:id/continue_button").click();
        wait.until(ExpectedConditions.visibilityOf(driver.findElementById("xyz.medigo.pharmacy:id/parentPanel")));
        if(driver.findElementById("xyz.medigo.pharmacy:id/parentPanel").isDisplayed()){
            driver.findElementById("android:id/button1").click();
        }
    }

    public void P_Login(String code, String id, String pass){

//        driver.findElementById("xyz.medigo.pharmacy:id/login_phar_code").sendKeys(code);
//        driver.findElementById("xyz.medigo.pharmacy:id/continue_button").click();
//        wait.until(ExpectedConditions.visibilityOf(driver.findElementById("xyz.medigo.pharmacy:id/parentPanel")));
//        if(driver.findElementById("xyz.medigo.pharmacy:id/parentPanel").isDisplayed()){
//            driver.findElementById("android:id/button1").click();
//        }else {
//            driver.findElementById("xyz.medigo.pharmacy:id/login_email").sendKeys(id);
//            driver.findElementById("xyz.medigo.pharmacy:id/login_password").sendKeys(pass);
//            wait.until(ExpectedConditions.visibilityOf(driver.findElementById("xyz.medigo.pharmacy:id/parentPanel")));
//            if(driver.findElementById("xyz.medigo.pharmacy:id/parentPanel").isDisplayed()){
//                driver.findElementById("android:id/button1").click();
//            }
//        }
    }
}
