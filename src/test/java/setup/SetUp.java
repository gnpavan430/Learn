package setup;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.By;
import org.junit.*;
import java.net.URL;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class SetUp {
    private static String reportDirectory = "reports";
    private static String reportFormat = "xml";
    private static String testName = "Untitled";
    protected static AndroidDriver<AndroidElement> driver = null;

    static DesiredCapabilities dc = new DesiredCapabilities();

    public static AndroidDriver<AndroidElement> getDriver() {
        return driver;
    }

    @BeforeClass
    public static void setUp() throws MalformedURLException {
        dc.setCapability("reportDirectory", reportDirectory);
        dc.setCapability("reportFormat", reportFormat);
        dc.setCapability("testName", testName);
        dc.setCapability(MobileCapabilityType.UDID, "emulator-5554");
        //dc.setCapability(MobileCapabilityType.UDID, "F7AZFG01Y863");
        dc.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY,"com.klm.mobile.android.core.activity.DebugTripsActivity");
        dc.setCapability(AndroidMobileCapabilityType.APP_PACKAGE,"com.afklm.mobile.android.gomobile.klm");
        driver = new AndroidDriver<AndroidElement>(new URL("http://localhost:4723/wd/hub"), dc);

    }

    @Test
    public void testUntitled() {
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}