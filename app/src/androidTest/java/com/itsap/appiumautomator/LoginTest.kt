package com.itsap.appiumautomator

import androidx.test.ext.junit.runners.AndroidJUnit4
import com.itsap.appiumautomator.config.AppiumConfigIlink.openMobileApp
import io.appium.java_client.AppiumDriver
import org.junit.Test
import org.junit.runner.RunWith
import org.openqa.selenium.By
import java.net.MalformedURLException

@RunWith(AndroidJUnit4::class)
class LoginTest {

    private lateinit var driver: AppiumDriver

    @Test
    @Throws(MalformedURLException::class)
    fun testLogin() {
        driver = openMobileApp()
        val loginButton = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Se connecter\"]"))
        loginButton.click()
    }

//    @After
//    fun tearDown() {
//        AppiumConfig.closeDriver();
//    }
}

