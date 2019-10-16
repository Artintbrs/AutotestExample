package autotest.steps;

import autotest.screen.elements.Controls;
import autotest.screen.elements.MenuForm;
import autotest.screen.elements.ProfileSettingsForm;
import io.appium.java_client.AppiumDriver;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.appears;
import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MenuApplicationUserSteps extends StepBase {

    public MenuApplicationUserSteps(AppiumDriver driver) {
        super(driver);
    }

    protected Controls controls = new Controls();
    protected MenuForm menuForm = new MenuForm();
    protected ProfileSettingsForm profileSettingsForm = new ProfileSettingsForm();

    @Step("Вызов и проверка отображения бокового меню")
    public void shouldBeMenu(String login) {
        controls.buttonMenu().click();
        menuForm.textLogin()
                .waitUntil(visible, 3000);
        assertThat("Проверка имени пользователя", menuForm.textLogin().getText(), equalTo(login));
        menuForm.textExit().shouldBe(appears);
        menuForm.homePlace().shouldBe(appears);
        menuForm.officePlace().shouldBe(appears);
        menuForm.addPlace().shouldBe(appears);
        menuForm.profileSettings().shouldBe(appears);
        menuForm.help().shouldBe(appears);
        menuForm.about().shouldBe(appears);
    }

    @Step("Выход из приложения")
    public void logOut() {
        menuForm.textExit()
                .waitUntil(visible, 3000)
                .click();
    }


}
