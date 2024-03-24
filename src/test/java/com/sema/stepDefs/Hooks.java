package com.sema.stepDefs;

import com.sema.utilities.ConfigurationReader;
import com.sema.utilities.DBUtils;
import com.sema.utilities.Driver;
import io.cucumber.java.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.sql.SQLException;

public class Hooks {
    private static final Logger logger = LoggerFactory.getLogger(Hooks.class);
    private static long startTime;
    private static final long MAX_DURATION_IN_MILLIS = 180000;
    @Before
    public void setup(Scenario scenario) {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        logger.info(":::: Starting test automation ::::");
        logger.info("Browser type :: {}", ConfigurationReader.getProperty("browser"));
        logger.info("Environment :: {}", ConfigurationReader.getProperty("url"));
        logger.info("Test scenario :: {}", scenario.getName());
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        startTime = System.nanoTime();

    }
    @After
    public static void tearDown(Scenario scenario) {
        long endTime = System.nanoTime();
        long durationInNanos = endTime - startTime;
        long durationInMillis = durationInNanos / 1000000;
        if (durationInMillis > MAX_DURATION_IN_MILLIS) {
            scenario.log("Scenario took too long. Failing the scenario.");
            Driver.closeDriver();
            throw new RuntimeException("Scenario took too long.");
        }
        if (scenario.isFailed()) {
            TakesScreenshot takesScreenshot = (TakesScreenshot) Driver.getDriver();
            byte[] image = takesScreenshot.getScreenshotAs(OutputType.BYTES);
            scenario.attach(image, "image/png", scenario.getName());
            logger.error("Test scenario :: {} :: Failed", scenario.getName());
        } else {
            logger.info("Test scenario :: {} :: Passed", scenario.getName());
        }
        Driver.closeDriver();

        try {
           Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
