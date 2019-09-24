package com.main.cucumber.stepdefs;

import com.main.TranslationApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = TranslationApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
