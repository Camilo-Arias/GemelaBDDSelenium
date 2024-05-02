package com.gemela.co.pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ParamMenuPage extends PageObject {

    @FindBy(xpath = "//a[.='PARAMETROS GENERALES']")
    protected WebElement btnParameters;

}
