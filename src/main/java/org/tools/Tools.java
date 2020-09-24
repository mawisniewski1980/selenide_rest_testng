package org.tools;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.codeborne.selenide.Selenide.*;

public class Tools {

    protected static final Logger LOG = LoggerFactory.getLogger("STDOUT_LOGGER");

    public static boolean isIframeExists() {
        return $(By.tagName("iframe")).exists();
    }

    public static int countIframe() {
        return $$(By.tagName("iframe")).size();
    }

    public static void closePopUp() {

        if (isIframeExists() && countIframe() > 0) {

            switchTo().frame(0);

            if ($("div[id='introAgreeButton']").isDisplayed()) {
                $("div[id='introAgreeButton']").click();
                switchTo().defaultContent();
            }

        }

    }
}
