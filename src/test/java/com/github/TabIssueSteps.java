package com.github;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TabIssueSteps {

    @Step("Open link {url}")
    public void openUrl(String url) {
        open(url);
    }

    @Step("Check issue with number {issueNumber}")
    public void checkIssueWithNumberOnPage(String issueNumber){
        $(withText("#" + issueNumber)).should(Condition.visible);
    }
}
