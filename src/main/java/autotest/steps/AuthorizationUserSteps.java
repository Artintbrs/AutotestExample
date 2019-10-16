package autotest.steps;

import autotest.screen.elements.*;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class AuthorizationUserSteps extends StepBase{

    public AuthorizationUserSteps(AppiumDriver driver) {
        super(driver);
    }

    protected AllertMessageForm allertMessageForm = new AllertMessageForm();
    protected AuthorizationForm authorizationForm = new AuthorizationForm();
    protected ApartmentForm apartmentForm = new ApartmentForm();
    protected Controls controls = new Controls();
    protected MenuForm menuForm = new MenuForm();
    protected ProfileSettingsForm profileSettingsForm = new ProfileSettingsForm();


    @Step("Подтвердить сообщение о недоступности сервера")
    public void messageServerIsNotReachable(String textMessage) {
        allertMessageForm.messagePanel()
                .waitUntil(visible, 3000);
        allertMessageForm.messageText(textMessage).shouldBe(appears);
        allertMessageForm.okButton().click();
    }

    @Step("Проверка отображения экрана авторизации")
    public void shouldBeAuthorizationScreen() {
        authorizationForm.textHeader()
                .waitUntil(visible, 12000);
        authorizationForm.buttonMenu().shouldBe(appears);
        authorizationForm.textWelcome().shouldBe(appears);
        authorizationForm.login().shouldBe(appears);
        authorizationForm.password().shouldBe(appears);
        authorizationForm.showPassword().shouldBe(appears);
        authorizationForm.textForgotPass().shouldBe(appears);
        authorizationForm.resetPass().shouldBe(appears);
        authorizationForm.btnLogIn().shouldBe(appears);
        authorizationForm.btnReg().shouldBe(appears);
    }

    @Step("Авторизация пользователя")
    public void logInUser(String login, String pass) {
        authorizationForm.btnLogIn().should(disabled);
        authorizationForm.login().sendKeys(login);
        authorizationForm.btnLogIn().should(disabled);
        authorizationForm.password().sendKeys(pass);
        authorizationForm.showPassword().click();
        assertThat("Отображается введенный пароль", authorizationForm.password().getText(), equalTo(pass));
        authorizationForm.btnLogIn().should(enabled);
        authorizationForm.btnLogIn().click();
        apartmentForm.textHeaders()
                .waitUntil(visible, 12000);
    }

    @Step("Ошибка авторизации")
    public void logInUserError(String login, String pass, String houseName) {
        authorizationForm.btnLogIn().should(disabled);
        authorizationForm.login().sendKeys(login);
        authorizationForm.btnLogIn().should(disabled);
        authorizationForm.password().sendKeys(pass);
        authorizationForm.showPassword().click();
        assertThat("Отображается введенный пароль", authorizationForm.password().getText(), equalTo(pass));
        authorizationForm.btnLogIn().should(enabled);
        authorizationForm.btnLogIn().click();
        apartmentForm.textHeaders()
                .waitUntil(visible, 12000);
    }

    @Step("Изменение пароля")
    public void changePassword (String pass) {
        apartmentForm.textHeaders()
                .waitUntil(visible, 60000);
        controls.buttonMenu().click();
        menuForm.profileSettings().
                waitUntil(visible, 30000)
                .click();
        profileSettingsForm.textHeader().shouldBe(appears);
        profileSettingsForm.textPass().click();
        profileSettingsForm.edit().clear();
        profileSettingsForm.edit().sendKeys(pass + "\n");
        controls.buttonMenu().click();
    }


}
