package com.qa.efficiency.common;

import org.junit.Test;

public class ActivitiesTests extends BaseTest {

    private final static String BASE_URL = "https://aksis.dev.qsupport.ru/activities";

    @Test
    public void createActivities(){
        ActivitiesPage activitiesPage = new ActivitiesPage(BASE_URL);
        activitiesPage.clickOnCreate();
        int a = 0;
    }
}
