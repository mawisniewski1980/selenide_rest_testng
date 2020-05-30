package org.pages;

import com.codeborne.selenide.Condition;

import org.abstracts.AbstractPage;

import java.util.List;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class GoogleSearchPage extends AbstractPage {

    public void search(String value) {
        $("input[name='q']")
                .shouldBe(Condition.visible, Condition.enabled)
                .setValue(value)
                .pressEnter();
    }

    public List getResults() {
        return $$("div.r a");
    }



}
