package com.Utest.stepdefinitions;


import com.Utest.model.UtestData;
import com.Utest.questions.Answer;
import com.Utest.tasks.Login;
import com.Utest.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Jeferson is a user who wants to create an account on the platform$")
    public void jefersonIsAUserWhoWantsToCreateAnAccountOnThePlatform(List<UtestData> utestData) throws Exception {
        OnStage.theActorCalled("Jeferson").wasAbleTo(OpenUp.thepage());
    }

    @When("^He sends the information required for registration$")
    public void heSendsTheInformationRequiredForRegistration(List<UtestData> utestData) throws Exception{
        OnStage.theActorInTheSpotlight().wasAbleTo(Login.OnThePage(utestData.get(0).getStrName(), utestData.get(0).getStrLastName(), utestData.get(0).getStrEmail(), utestData.get(0).getStrMonth(), utestData.get(0).getDay(), utestData.get(0).getYear(), utestData.get(0).getStrCity(), utestData.get(0).getPostal(), utestData.get(0).getStrPassword(), utestData.get(0).getStrConfirm()));
    }

    @Then("^He must obtain a virtual account to be able to enter when required$")
    public void heMustObtainAVirtualAccountToBeAbleToEnterWhenRequired(String questions) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(questions)));
    }

}
