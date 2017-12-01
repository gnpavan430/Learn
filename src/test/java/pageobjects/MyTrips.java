package pageobjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;
import setup.SetUp;

public class MyTrips extends SetUp {
    static AndroidDriver<AndroidElement> driver = getDriver();
   static  AndroidElement homeScreen_MyTrips = driver.findElement(By.xpath("//*[@resource-id='com.afklm.mobile.android.gomobile.klm:id/my_trips']"));
    static AndroidElement myTrips_UpcomingTrips = driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab' and @index='0']"));
    static AndroidElement myTrips_PreviousTrips = driver.findElement(By.xpath("//*[@class='android.support.v7.app.ActionBar$Tab' and @index='1']"));
    static AndroidElement myTrips_Notifications = driver.findElement(By.xpath("//*[@id='menu_notification']"));
    static AndroidElement myTrips_AddBookingActionButton= driver.findElement(By.xpath("//*[@id='floating_action_button_book_a_trip']"));
    static AndroidElement myTrips_noUpcomingTripsText=driver.findElement(By.xpath("//*[@text='You have no upcoming trips.']"));
    static AndroidElement myTrips_AddABooking = driver.findElement(By.xpath("//*[@text='Add a booking']"));

    public static AndroidElement getHomeScreen_MyTrips() {
        return homeScreen_MyTrips;
    }

    public static void setHomeScreen_MyTrips(AndroidElement homeScreen_MyTrips) {
        MyTrips.homeScreen_MyTrips = homeScreen_MyTrips;
    }

    public static AndroidElement getMyTrips_UpcomingTrips() {
        return myTrips_UpcomingTrips;
    }

    public static void setMyTrips_UpcomingTrips(AndroidElement myTrips_UpcomingTrips) {
        MyTrips.myTrips_UpcomingTrips = myTrips_UpcomingTrips;
    }

    public static AndroidElement getMyTrips_PreviousTrips() {
        return myTrips_PreviousTrips;
    }

    public static void setMyTrips_PreviousTrips(AndroidElement myTrips_PreviousTrips) {
        MyTrips.myTrips_PreviousTrips = myTrips_PreviousTrips;
    }

    public static AndroidElement getMyTrips_Notifications() {
        return myTrips_Notifications;
    }

    public static void setMyTrips_Notifications(AndroidElement myTrips_Notifications) {
        MyTrips.myTrips_Notifications = myTrips_Notifications;
    }

    public static AndroidElement getMyTrips_AddBookingActionButton() {
        return myTrips_AddBookingActionButton;
    }

    public static void setMyTrips_AddBookingActionButton(AndroidElement myTrips_AddBookingActionButton) {
        MyTrips.myTrips_AddBookingActionButton = myTrips_AddBookingActionButton;
    }

    public static AndroidElement getMyTrips_noUpcomingTripsText() {
        return myTrips_noUpcomingTripsText;
    }

    public static void setMyTrips_noUpcomingTripsText(AndroidElement myTrips_noUpcomingTripsText) {
        MyTrips.myTrips_noUpcomingTripsText = myTrips_noUpcomingTripsText;
    }

    public static AndroidElement getMyTrips_AddABooking() {
        return myTrips_AddABooking;
    }

    public static void setMyTrips_AddABooking(AndroidElement myTrips_AddABooking) {
        MyTrips.myTrips_AddABooking = myTrips_AddABooking;
    }
}
