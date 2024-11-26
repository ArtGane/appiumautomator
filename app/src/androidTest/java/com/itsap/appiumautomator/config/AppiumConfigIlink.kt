package com.itsap.appiumautomator.config;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.*;

object AppiumConfigIlink {

    private lateinit var driver: AppiumDriver

    @JvmStatic
    fun main(args: Array<String>) {
        try {
            openMobileApp()
        } catch (e: MalformedURLException) {
            e.printStackTrace()
        }
    }

    @Throws(MalformedURLException::class)
    internal fun initializeDriver() {
            val capabilities = DesiredCapabilities().apply {
                setCapability("appium:deviceName", "WKE6R4PRT4ZXHEX8")
                setCapability("appium:platformName", "Android")
                setCapability("appium:platformVersion", "12")
                setCapability("appium:automationName", "UiAutomator2")
                setCapability("appium:app", "C:/Users/argane.samson/AndroidStudioProjects/AppiumAutomator/apks/app-ilinkvistest-vistest.apk")
                setCapability("appium:appPackage", "fr.itsap.app_intervenants.vistest")
                setCapability("appium:appActivity", "fr.itsap.app_intervenants.MainActivity")
            }

            val url = URL("http://172.16.143.145:4723")

            println("Tentative de connexion à Appium...")
            driver = AndroidDriver(url, capabilities)
                println("Driver initialisé avec succès!")
    }

    fun openMobileApp(): AppiumDriver {
        initializeDriver()
        return driver
    }

//    fun closeDriver() {
//        driver.close();
//    }
}


