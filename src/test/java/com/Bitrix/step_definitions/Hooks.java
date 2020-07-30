package com.Bitrix.step_definitions;

import com.Bitrix.utilities.ConfigurationReader;
import com.Bitrix.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("empty hook before");


    }

    @After
    public void tearDown(){
        System.out.println("empty hook after");

    }
}
