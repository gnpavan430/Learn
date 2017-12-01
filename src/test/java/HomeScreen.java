//package <set your test package>;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.URL;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomeScreen {
    private String reportDirectory = "reports";
    private String reportFormat = "xml";
    private String testName = "Untitled";
    protected AndroidDriver<AndroidElement> driver = null;

    DesiredCapabilities dc = new DesiredCapabilities();

    @Before
    public void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        //dc.setCapability(MobileCapabilityType.UDID, "F7AZFG01Y863");
        dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");

        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.klm.mobile.android.core.activity.DebugTripsActivity");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.afklm.mobile.android.gomobile.klm");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);
    }

    @Test
    public void testUntitled() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        /*driver.startActivity("com.afklm.mobile.android.gomobile.klm", "com.klm.mobile.android.core.activity.DebugTripsActivity");
        driver.manage().timeouts().implicitlyWait(16000, TimeUnit.MILLISECONDS);*/
        new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@text='My trips' and ./parent::*[@id='toolbar']]")));
        driver.manage().timeouts().implicitlyWait(20000, TimeUnit.MILLISECONDS);
        Thread.sleep(8000);
        driver.findElement(By.xpath("//*[@text='Flying Blue' and @top='true']")).click();
       // List<AndroidElement> androidElements = driver.findElements(By.xpath("//*[@text='My trips' and @enabled='true' and @onScreen='true']"));
    /*    for(int i=0;i<androidElements.size();i++){
            if(androidElements.get(i).equals(driver.findElement(By.xpath("//*[@resource-id='com.afklm.mobile.android.gomobile.klm:id/largeLabel']")))){
                return;
            }
            else{
                new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(androidElements.get(i))));
            }
        }*/


    }

    @After
    public void tearDown() {
        driver.quit();
    }
}