package product1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.BrowserOperations;

import java.net.MalformedURLException;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RemoteBrowserTests1 {

    @Test
    @DisplayName("The about tab verification1")
    public void about_tab_is_on_home_page1() {
        BrowserOperations browserOperations = new BrowserOperations();
        WebDriver browser = null;
        try {
            browser = browserOperations.openNewBrowser(browserOperations.browserName);
            browser.get("https://optymyze.com/about/");
            WebElement href = browser.findElement(By.xpath("//a[@href='/about/']"));
            assertTrue((href.isDisplayed()));
            browser.quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("The developers tab verification1")
    public void developers_tab_is_on_home_page1() {
        BrowserOperations browserOperations = new BrowserOperations();
        WebDriver browser = null;
        try {
            browser = browserOperations.openNewBrowser(browserOperations.browserName);
            browser.get("https://optymyze.com/developers/");
            WebElement href = browser.findElement(By.xpath("//a[@href='/developers/']"));
            assertTrue((href.isDisplayed()));
            browser.quit();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
