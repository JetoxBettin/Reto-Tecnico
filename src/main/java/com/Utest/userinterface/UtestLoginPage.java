package com.Utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class UtestLoginPage extends PageObject {

    public static final Target INPUT_NAME = Target.the("Se debe ingresa los nombres").located(By.id("firstName"));
    public static final Target INPUT_LASTNAME = Target.the("Se debe ingresan los apellidos").located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("Se debe ingresa el email").located(By.id("email"));
    public static final Target INPUT_MONTH = Target.the("Se debe ingresa el mes del cumpleaños").located(By.id("birthMonth"));
    public static final Target INPUT_DAY = Target.the("Se debe ingresar el día de nacimiento").located(By.id("birthDay"));
    public static final Target INPUT_YEAR = Target.the("Se debe ingresar el año de nacimiento").located(By.id("birthYear"));
    public static final Target NEXT_BUTTON = Target.the("Paso a seguir").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
    public static final Target CITY = Target.the("Ciudad").located(By.id("city"));
    public static final Target POSTAL = Target.the("Codigo Postal").located(By.id("zip"));
    public static final Target NEXT_BUTTON_DEVICES = Target.the("Agregar Díspositvos").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    public static final Target BUTTON_NEXT = Target.the("Siguiente").located(By.xpath("//*[@id='regs_container']/div/div[2]/div/div[2]/div/div[2]/div/a"));
    public static final Target PASSWORD = Target.the("Crear Contraseña").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirmar Contraseña").located(By.id("confirmPassword"));
    public static final Target INFORMED = Target.the("Información del manjo de información").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target TERMS = Target.the("Terminos y Condiciones del ingreso").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target PRIVACY = Target.the("Politicas de Seguridad de la pagína").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BUTTON_COMPLETE = Target.the("Completado").located(By.xpath("//*[@id='laddaBtn']"));
    public static final Target POST = Target.the("Texto del boton").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a/span"));
}
