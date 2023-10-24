package com.sema.pages;
import com.sema.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    // WebDriver nesnesini tanımlıyoruz ve diğer sayfa sınıflarıyla paylaşılmak üzere korumalı (protected) olarak işaretliyoruz
    protected WebDriver driver = Driver.getDriver();

    // Bekleme işlemleri için WebDriverWait nesnesini tanımlıyoruz
    protected WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    // BasePage sınıfından bir nesne oluşturulduğunda çalışacak olan yapıcı metot (constructor)
    public BasePage() {
        // PageFactory kullanarak WebElement öğelerini başlatıyoruz @findElement gibi düşünebiliriz.

        PageFactory.initElements(driver, this);

        // Sayfa yüklemeleri ve öğelerin görünürlüğü için varsayılan bekleme süresini ayarlıyoruz (10 saniye)
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Tarayıcı penceresini tam ekran yapıyoruz
        driver.manage().window().maximize();
    }
}