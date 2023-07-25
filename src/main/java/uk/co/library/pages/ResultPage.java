package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import dev.failsafe.internal.util.Assert;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.library.utility.Utility;

public class ResultPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    @CacheLookup
//    @FindBy(xpath = "//h1[contains(text(),'Permanent Tester jobs in Harrow on the Hill')]")
//    @FindBy(css = "body.site-cvlibrary-uk.header-search-bar-showing:nth-child(2) main.site-main:nth-child(7) div.site-wrapper div.page-wrapper.page-wrapper--faceted.container-1200:nth-child(2) div.page-main:nth-child(4) div.search-header:nth-child(1) div.search-header__left > h1.search-header__title")
    @FindBy(xpath = "//h1[@class='search-header__title']")

    WebElement verifyResultText;



}
