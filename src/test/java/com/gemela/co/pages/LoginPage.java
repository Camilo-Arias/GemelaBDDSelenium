package com.gemela.co.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {

    @FindBy(id = "txtusu")
    protected WebElement inputUser;

    @FindBy(id = "txtpas")
    protected WebElement inputPass;

    @FindBy(id = "rc-anchor-container")
    protected WebElement btnCaptcha;

    @FindBy(id = "loginbtnIni")
    protected WebElement btnLogin;

    @FindBy(xpath = "//a[.='Salir']")
    protected WebElement btnLogout;

    @FindBy(id = "botonSalir")
    protected WebElement divBTNLogout;

}
