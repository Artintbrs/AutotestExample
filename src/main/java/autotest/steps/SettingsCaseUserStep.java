package autotest.steps;

import autotest.screen.elements.*;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.navigator;

public class SettingsCaseUserStep extends StepBase {

    public SettingsCaseUserStep(AppiumDriver driver) {
        super(driver);
    }

    protected AuthorizationForm authorizationForm = new AuthorizationForm();
    protected SettingsCaseForm settingsCaseForm = new SettingsCaseForm();

    @Step("Создать телефонный контакт")
    public void addContact() {
        authorizationForm.textHeader()
                .waitUntil(visible, 30000);
        navigator.back();
        settingsCaseForm.phoneApp()
                .waitUntil(visible, 30000)
                .click();
        settingsCaseForm.Contact()
                .waitUntil(visible, 30000)
                .click();
        settingsCaseForm.addContact()
                .waitUntil(visible, 30000)
                .click();
        settingsCaseForm.buttonClose()
                .waitUntil(visible, 30000)
                .click();
        settingsCaseForm.editName()
                .waitUntil(visible, 30000)
                .sendKeys("test");
        settingsCaseForm.buttonSaveContact().click();
        settingsCaseForm.nameContact().shouldHave(text("test"));
    }


}
