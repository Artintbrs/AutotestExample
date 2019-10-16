package autotest.steps;

import autotest.screen.elements.Controls;
import autotest.screen.elements.MenuForm;
import autotest.screen.elements.ProfileSettingsForm;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

public class ProfileUserSteps  extends StepBase {

    public ProfileUserSteps(AppiumDriver driver) {
        super(driver);
    }

    protected ProfileSettingsForm profileSettingsForm = new ProfileSettingsForm();
    protected Controls controls = new Controls();
    protected MenuForm menuForm = new MenuForm();

    @Step("Прейти к профилю")
    public void getProfileSettings () {
        controls.buttonMenu().click();
        menuForm.profileSettings().
                waitUntil(visible, 30000)
                .click();
    }

    @Step("Проверка экрана настроек профиля")
    public void sholdBeProfileSettings () {
        profileSettingsForm.textHeader().
                waitUntil(visible, 30000);
        profileSettingsForm.name().should(appears);
        profileSettingsForm.nameUser().should(appears);
        profileSettingsForm.email().should(appears);
        profileSettingsForm.pass().should(appears);
        profileSettingsForm.phone().should(appears);
        profileSettingsForm.login().should(appears);
        profileSettingsForm.btnDelete().should(appears);
    }

    @Step("Добавить телефон")
    public void addPhone (String phoneNumber) {
        profileSettingsForm.phone().click();
        profileSettingsForm.edit().clear();
        profileSettingsForm.edit().sendKeys(phoneNumber + "\n");
        profileSettingsForm.textPhone().shouldHave(text(phoneNumber));
    }
}
