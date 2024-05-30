package com.gemela.co.definitions;

import com.gemela.co.pages.validations.ValidationPages;
import com.gemela.co.steps.LoginStep;
import com.gemela.co.steps.validations.ValidationStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
//import net.serenitybdd.annotations.Steps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.util.EnvironmentVariables;
import org.junit.Assert;

public class LoginDef {

    private EnvironmentVariables environmentVariables;

    @Steps(shared = true)
    LoginStep loginStep;

    @Steps(shared = true)
    ValidationStep validationStep;

    @Given("el usuario navega en dc2tvaweb7:3089GemelaLogin")
    public void el_usuario_navega_en_dc2tvaweb7_gemela_login() {
//        loginStep.open();
        String currentURL = environmentVariables.optionalProperty("environments.qa.webdriver.base.url").get();
        loginStep.openPageURL(currentURL);
    }

    @When("lleno formulario de {string} and {string}")
    public void lleno_formulario_de_and(String user, String pass) {
        loginStep.typeUser(user);
        loginStep.typePass(pass);
    }

    @When("solución capchat")
    public void solución_capchat() throws InterruptedException {
        loginStep.captcha();
    }

    @Then("el logueo es exitoso")
    public void el_logueo_es_exitoso() {
        loginStep.clickLogin();
        Assert.assertTrue(validationStep.loginOk());
    }

    @When("selecciono salir")
    public void selecciono_salir() {
        loginStep.clickLogin();
        loginStep.clickLogout();
    }

    @Then("la sesión cierra exitosamente")
    public void la_sesión_cierra_exitosamente() {
        Assert.assertTrue(validationStep.logout());
    }
}
