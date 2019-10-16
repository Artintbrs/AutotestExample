package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class AuthorizationForm {

    /**
     * Кнопка бокового меню
     */
    public SelenideElement buttonMenu() {
        return $(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
    }

    /**
     * Текст заголовка экрана авторизации
     */
    public SelenideElement textHeader() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Login')]"));
    }

    /**
     * Текст приветствия "Welcome"
     */
    public SelenideElement textWelcome() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Welcome')]"));
    }

    /**
     * Поле логина
     */
    public SelenideElement login() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/login"));
    }

    /**
     * Поле пароля
     */
    public SelenideElement password() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/password"));
    }

    /**
     * Кнопка показать/скрыть пароль
     */
    public SelenideElement showPassword() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_input_password_toggle"));
    }

    /**
     * Текст "Forgot password?"
     */
    public SelenideElement textForgotPass() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Forgot password?')]"));
    }

    /**
     * Востановить пароль "Forgot password?"
     */
    public SelenideElement resetPass() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/reset_btn"));
    }

    /**
     * Кнопка "Log In"
     */
    public SelenideElement btnLogIn() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/login_button"));
    }

    /**
     * Кнопка "Registration"
     */
    public SelenideElement btnReg() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/registration_button"));
    }




}
