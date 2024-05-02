package com.gemela.co.steps;

import com.gemela.co.pages.LoginPage;
//import net.serenitybdd.annotations.Step;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginStep extends LoginPage {

    public void waitForElementToBeVisible(WebElement webElement) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(60));
        wait.until(ExpectedConditions.elementToBeClickable(webElement));
    }
    @Step("Ingresar usuario")
    public void typeUser(String user) {
        inputUser.sendKeys(user);
    }

    @Step("Ingresar contraseña")
    public void typePass(String pass) {
        inputPass.sendKeys(pass);
    }

    @Step("Dar click en boton captcha")
    public void captcha() throws InterruptedException {
//    btnCaptcha.click();
        Thread.sleep(20000);
    }

    @Step("Click en el boton Login")
    public void clickLogin() {
        waitForElementToBeVisible(btnLogin);
        btnLogin.click();
    }

    @Step("Click en el boton Logout")
    public void clickLogout() {
        divBTNLogout.click();
    }
}
