package hw1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Locators {

    private static class Url{
        private static final String cats = "https://uhomki.com.ua/koshki/1074/";
        private static final String danItMain = "https://dan-it.com.ua/";
        private static final String w3schoolsMain = "https://www.w3schools.com/";
        private static final String jetbrainsIdea = "https://www.jetbrains.com/idea/";
        private static final String jetbrainsIdeaDownload = "https://www.jetbrains.com/idea/download/#section=windows";

    }

    private static class LocatorsList{
        private static final By danItChooseLang = By.xpath("//div[@class='choose-lang']/child::a[2]");
        private static final By loginByClassName = By.className("userbar__button-text");
        private static final By loginByXpathText = By.xpath("//span[text()='Вход']");
        private static final By loginByXpathDom = By.xpath("//a[@class='userbar__button __active']"+
                "/child::span");
        private static final By katalogCatDogGeneral = By.xpath("//div[@class ='footer__heading']" +
                "[contains (text(),'Каталог')]/../child::ul/li[3]/a");
        private static final By aboutLearning = By.xpath("//*[contains(text(), 'IT-образование')]" +
                "[(not(contains(text(), 'DAN')))]/../div/a");
        private static final By akvariumistica = By.xpath("//a[@class = 'products-menu__title-link']" +
                "[contains(text(), 'Аквариумистика')]");
        private static final By akvarium = By.xpath("//a[contains(@class,'productsMenu-submenu-a')]" +
                "//span[text()='Аквариумы']");
        private static final By contact = By.xpath("//a[@class = 'page-header__phone']");
        private static final By offline = By.xpath("//ul[@class = 'banner__meta-data banner-meta']/child::li[2]/p");
        private static final By W3schoolsLocatorsById1 = By.xpath("//div[text()='Accept all & visit the site']");
        private static final By W3schoolsLocatorsById2 = By.xpath("//a[@id = 'navbtn_tutorials']");
        private static final By W3schoolsLocatorsById3 = By.xpath("//a[@id = 'navbtn_references']");
        private static final By W3schoolsLocatorsById4 = By.xpath("//a[@id = 'navbtn_exercises']");
        private static final By W3schoolsLocatorsById5 = By.xpath("//a[@id = 'cert_navbtn']");
        private static final By W3schoolsLocatorsById6 = By.xpath("//input[@id='search2']");
        private static final By W3schoolsLocatorsById7 = By.xpath(" //input[@id = 'radio_darkpage']");
        private static final By W3schoolsLocatorsById8 = By.xpath("//a[@id = 'nav_search_btn']");
        private static final By W3schoolsLocatorsById9 = By.xpath("//a[@id = 'w3loginbtn']");
        private static final By W3schoolsLocatorsById10 = By.xpath("//input[@id = 'modalusername']");
        private static final By W3schoolsLocatorsById11 = By.xpath("//input[@id = 'current-password']");
        //private static final By UkraineTrainCentre = By.xpath("//div[@class='choose-lang']/child::a[2]");
        private static final By UkraineTrainCentreStudents = By.xpath("//p[@class = 'main-info__title']" +
                "[contains(text(),'Украинский центр по подготовке IT-кадров ')]//../../../div/ul/li[3]");
        private static final By IntellijIdeaDownloadTab = By.xpath("//a[contains(@class, 'wt-button_mode_outline')]/../child::a[6]");
        private static final By IntellijIdeaUltimateDownloadTab = By.xpath("//div[@class ='wt-row wt-row_size_m wt-row_wide wt-row_wrap wt-row_align-items_stretch']" +
                "/../../div[3]/div/child::div[1]/div/child::div[2]/span/a");
        private static final By IntellijIdeaComEditionDownloadTab = By.xpath("//div[@class ='wt-row wt-row_size_m wt-row_wide wt-row_wrap wt-row_align-items_stretch']" +
                "/../../div[3]/div/child::div[2]/div/child::div[2]/span/a");

    }


    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        Actions action = new Actions(driver);
//1.txt
/*  Поиск по className
        driver.get("https://uhomki.com.ua/koshki/1074/");
        driver.findElement(By.className("userbar__button-text")).click();*/

  /*Поиск по xpath
        //1) xpath поиск по тексту
        driver.get("https://uhomki.com.ua/koshki/1074/");
        driver.findElement(By.xpath("//span[text()='Вход']")).click();

        //2) xpath передвижение по DOM дереву
        driver.get("https://uhomki.com.ua/koshki/1074/");
        driver.findElement(By.xpath("//a[@class='userbar__button __active']"+
            "/child::span")).click();*/

// 2.txt
//  Поиск по xpath
/*        driver.get("https://uhomki.com.ua/koshki/1074/");
        System.out.println(driver.findElement(By.xpath("//div[@class ='footer__heading']" +
                        "[contains (text(),'Каталог')]/../child::ul/li[3]/a")).getText());
        driver.quit();*/
//3.txt
/*      driver.get("https://dan-it.com.ua/");
        driver.findElement(By.xpath("//div[@class='choose-lang']/child::a[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[contains(text(), 'IT-образование')]" +
                "[(not(contains(text(), 'DAN')))]/../div/a")).click();*/
//4.txt
/*        driver.get("https://uhomki.com.ua/koshki/1074/");
        //Actions action = new Actions(driver);
        WebElement we = driver.findElement(By.xpath("//a[@class = 'products-menu__title-link']" +
                "[contains(text(), 'Аквариумистика')]"));
*//*
        action.moveToElement(we).moveToElement(driver.findElement(By.xpath("//a[contains(@class,'productsMenu-submenu-a')]" +
                "//span[text()='Аквариумы']"))).click().perform();
*//*
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@class,'productsMenu-submenu-a')]" +
                "//span[text()='Аквариумы']")).click();*/
//5.txt
/*       driver.get("https://dan-it.com.ua/");
         driver.findElement(By.xpath("//div[@class='choose-lang']/child::a[2]")).click();
         System.out.println(driver.findElement(By.xpath("//a[@class = 'page-header__phone']")).getText());*/
       // driver.quit();

//6.txt
/*
         driver.get("https://dan-it.com.ua/");
         driver.findElement(By.xpath("//div[@class='choose-lang']/child::a[2]")).click();
         action.moveToElement(driver.findElement(By.xpath("//ul[@class = 'banner__meta-data banner-meta']/child::li[2]/p"))).build().perform();
*/
//7.txt
/*        driver.get("https://www.w3schools.com/");
        action.click(driver.findElement(By.xpath("//div[text()='Accept all & visit the site']"))).perform();
        action.moveToElement(driver.findElement(By.xpath("//a[@id = 'navbtn_tutorials']"))).perform();
        Thread.sleep(1000);
        action.moveToElement(driver.findElement(By.xpath("//a[@id = 'navbtn_references']"))).perform();
        Thread.sleep(1000);
        action.moveToElement(driver.findElement(By.xpath("//a[@id = 'navbtn_exercises']"))).perform();
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.xpath("//a[@id = 'cert_navbtn']"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id='search2']")).sendKeys("tag <a>");
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.xpath(" //input[@id = 'radio_darkpage']"))).perform();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@id = 'nav_search_btn']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id = 'w3loginbtn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id = 'modalusername']")).sendKeys("l.kozlova");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@id = 'current-password']")).sendKeys("tag <a>");*/
//8.txt
/*      driver.get("https://dan-it.com.ua/");
        driver.findElement(By.xpath("//div[@class='choose-lang']/child::a[2]")).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(By.xpath("//p[@class = 'main-info__title']" +
                "[contains(text(),'Украинский центр по подготовке IT-кадров ')]//../../../div/ul/li[3]")).getText());
        driver.quit();*/
//9.txt
/*
        driver.get("https://www.jetbrains.com/idea/");
        //action.moveToElement(driver.findElement(By.xpath("//div[@class='jetbrains-cookies-banner-3__actions']/button[text()='[A]ccept All']"))).click().build().perform();
        //driver.findElement(By.xpath("//button[text()='[A]ccept All']")).click();
               // "//div[@class='jetbrains-cookies-banner-3__actions']/button[text()='[A]ccept All']"))
        // button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@class, 'wt-button_mode_outline')]/../child::a[6]")).click();
*/
/*
        driver.get("https://www.jetbrains.com/idea/download/#section=windows");
        action.moveToElement(driver.findElement(By.xpath("//div[@class ='wt-row wt-row_size_m wt-row_wide wt-row_wrap wt-row_align-items_stretch']" +
                "/../../div[3]/div/child::div[1]/div/child::div[2]/span/a"))).click().build().perform();
        Thread.sleep(2000);
        driver.get("https://www.jetbrains.com/idea/download/#section=windows");
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(By.xpath("//div[@class ='wt-row wt-row_size_m wt-row_wide wt-row_wrap wt-row_align-items_stretch']" +
                "/../../div[3]/div/child::div[2]/div/child::div[2]/span/a"))).click().build().perform();*/


////////////////////////Использование вложенных классов: Url и LocatorsList//////////////////////////////////


//1.txt
  //Поиск по className
        driver.get(Url.cats);
        driver.findElement(LocatorsList.loginByClassName).click();
        Thread.sleep(1000);

   //Поиск по xpath
        //1) xpath поиск по тексту
        driver.get(Url.cats);
        driver.findElement(LocatorsList.loginByXpathText).click();
        Thread.sleep(1000);
        //2) xpath передвижение по DOM дереву
        driver.get(Url.cats);
        driver.findElement(LocatorsList.loginByXpathDom).click();
        Thread.sleep(1000);
// 2.txt
//  Поиск по xpath

        driver.get(Url.cats);
        System.out.println(driver.findElement(LocatorsList.katalogCatDogGeneral).getText());
        //driver.quit();
//3.txt
      driver.get(Url.danItMain);
        driver.findElement(LocatorsList.danItChooseLang).click();
        Thread.sleep(2000);
        driver.findElement(LocatorsList.aboutLearning).click();
        Thread.sleep(1000);
//4.txt
        driver.get(Url.cats);
        WebElement we = driver.findElement(LocatorsList.akvariumistica);
        action.moveToElement(we).moveToElement(driver.findElement(LocatorsList.akvarium)).click().perform();
        Thread.sleep(2000);
        //driver.findElement(LocatorsList.akvarium).click();
//5.txt
         driver.get(Url.danItMain);
         //driver.findElement(LocatorsList.danItChooseLang).click();
         System.out.println(driver.findElement(LocatorsList.contact).getText());
        // driver.quit();

//6.txt
         driver.get(Url.danItMain);
         //driver.findElement(LocatorsList.danItChooseLang).click();
         action.moveToElement(driver.findElement(LocatorsList.offline)).build().perform();
//7.txt
        driver.get(Url.w3schoolsMain);
        action.click(driver.findElement(LocatorsList.W3schoolsLocatorsById1)).perform();
        action.moveToElement(driver.findElement(LocatorsList.W3schoolsLocatorsById2)).perform();
        Thread.sleep(1000);
        action.moveToElement(driver.findElement(LocatorsList.W3schoolsLocatorsById3)).perform();
        Thread.sleep(1000);
        action.moveToElement(driver.findElement(LocatorsList.W3schoolsLocatorsById4)).perform();
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(LocatorsList.W3schoolsLocatorsById5)).perform();
        Thread.sleep(1000);
        driver.findElement(LocatorsList.W3schoolsLocatorsById6).sendKeys("tag <a>");
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(LocatorsList.W3schoolsLocatorsById7)).perform();
        Thread.sleep(1000);
        driver.findElement(LocatorsList.W3schoolsLocatorsById8).click();
        Thread.sleep(2000);
        driver.findElement(LocatorsList.W3schoolsLocatorsById9).click();
        Thread.sleep(1000);
        driver.findElement(LocatorsList.W3schoolsLocatorsById10).sendKeys("l.kozlova");
        Thread.sleep(1000);
        driver.findElement(LocatorsList.W3schoolsLocatorsById11).sendKeys("tag <a>");
//8.txt
      driver.get(Url.danItMain);
       // driver.findElement(LocatorsList.danItChooseLang).click();
        Thread.sleep(1000);
        System.out.println(driver.findElement(LocatorsList.UkraineTrainCentreStudents).getText());
        //driver.quit();
//9.txt
        driver.get(Url.jetbrainsIdea);
        //action.moveToElement(driver.findElement(By.xpath("//div[@class='jetbrains-cookies-banner-3__actions']/button[text()='[A]ccept All']"))).click().build().perform();
        //driver.findElement(By.xpath("//button[text()='[A]ccept All']")).click();
               // "//div[@class='jetbrains-cookies-banner-3__actions']/button[text()='[A]ccept All']"))
        // button[@data-jetbrains-cookies-banner-action='ACCEPT_ALL']")).click();
        Thread.sleep(2000);
        driver.findElement(LocatorsList.IntellijIdeaDownloadTab).click();

//10.txt
        driver.get(Url.jetbrainsIdeaDownload);
        action.moveToElement(driver.findElement(LocatorsList.IntellijIdeaUltimateDownloadTab)).click().build().perform();
        Thread.sleep(2000);
        driver.get(Url.jetbrainsIdeaDownload);
        Thread.sleep(2000);
        action.moveToElement(driver.findElement(LocatorsList.IntellijIdeaComEditionDownloadTab)).click().build().perform();
        }

}

