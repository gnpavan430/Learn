package testCases;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import pageobjects.MyTrips;
import setup.SetUp;

public class AddABookingTC extends SetUp {
    AndroidDriver<AndroidElement>driver=getDriver();




    @Test
    public void addABooking() throws InterruptedException {
        Thread.sleep(4000);
        MyTrips.getHomeScreen_MyTrips().click();
       if(MyTrips.getMyTrips_noUpcomingTripsText().isDisplayed()){
           MyTrips.getMyTrips_AddABooking().click();
       }
       else{
           MyTrips.getMyTrips_AddBookingActionButton().click();
       }
    }
}
