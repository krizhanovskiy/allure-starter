package com.github;

import org.junit.jupiter.api.Test;

public class CheckIssueStepTests {

    private TabIssueSteps tabIssueSteps = new TabIssueSteps();

    String url = "https://github.com/eroshenkoam/allure-example/issues";
    String issueNumber = "65";

    @Test
    public void checkIssueStepTest() {
        tabIssueSteps.openUrl(url);
        tabIssueSteps.checkIssueWithNumberOnPage(issueNumber);
    }


}
