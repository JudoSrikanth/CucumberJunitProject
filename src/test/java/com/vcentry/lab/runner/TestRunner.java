package com.vcentry.lab.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)   //junit main method
@CucumberOptions(
 features="src/test/java/com/vcentry/lab/features",
 glue ="com.vcentry.lab.stepDefinition",
 plugin ={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
 monochrome= true,//readable console
dryRun=false,  //dry run used to check feature file steps 
               // we implemented in teststeps
tags="@validlogin or @sanity"
)

public class TestRunner {
	

}
