package com.github;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.*;

public class CheckIssueLambdaTests {

    @Test
    public void CheckIssue(){
        SelenideLogger.addListener("allure", new AllureSelenide());

        String url = "https://github.com/eroshenkoam/allure-example/issues";
        String issueNumber = "65";

        step("Open link", () -> {
            open(url);
        });

        step("Check issue with number ", () ->{
            $(withText("#" + issueNumber)).should(Condition.exist);
        });
    }


}
