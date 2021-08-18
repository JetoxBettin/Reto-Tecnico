package com.Utest.tasks;

import com.Utest.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strMonth;
    private String day;
    private String year;
    private String strCity;
    private String postal;
    private String strPassword;
    private String strConfirm;

    public Login(String strName, String strLastName, String strEmail, String strMonth, String day, String year, String strCity, String postal, String strPassword, String strConfirm) {
        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strMonth = strMonth;
        this.day = day;
        this.year = year;
        this.strCity = strCity;
        this.postal = postal;
        this.strPassword = strPassword;
        this.strConfirm = strConfirm;
    }
    public static Login OnThePage(String strName, String strLastName, String strEmail, String strMonth, String day, String year, String strCity, String postal, String strPassword, String strConfirm) {
        return Tasks.instrumented(Login.class, strName, strLastName, strEmail, strMonth, day, year, strCity, postal, strPassword, strConfirm);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue((strName)).into(UtestLoginPage.INPUT_NAME),
                Enter.theValue((strLastName)).into(UtestLoginPage.INPUT_LASTNAME),
                Enter.theValue((strEmail)).into(UtestLoginPage.INPUT_EMAIL),
                SelectFromOptions.byVisibleText((strMonth)).from(UtestLoginPage.INPUT_MONTH),
                SelectFromOptions.byVisibleText((day)).from(UtestLoginPage.INPUT_DAY),
                SelectFromOptions.byVisibleText((year)).from(UtestLoginPage.INPUT_YEAR),
                Click.on(UtestLoginPage.NEXT_BUTTON),
                Enter.theValue((strCity)).into(UtestLoginPage.CITY),
                Enter.theValue((postal)).into(UtestLoginPage.POSTAL),
                Click.on(UtestLoginPage.NEXT_BUTTON_DEVICES),
                Click.on(UtestLoginPage.BUTTON_NEXT),
                Enter.theValue((strPassword)).into(UtestLoginPage.PASSWORD),
                Enter.theValue((strConfirm)).into(UtestLoginPage.CONFIRM_PASSWORD),
                Click.on(UtestLoginPage.INFORMED),
                Click.on(UtestLoginPage.TERMS),
                Click.on(UtestLoginPage.PRIVACY),
                Click.on(UtestLoginPage.BUTTON_COMPLETE)
        );
    }
}