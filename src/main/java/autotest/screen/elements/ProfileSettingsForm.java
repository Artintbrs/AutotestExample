package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProfileSettingsForm {

    /**
     * Текст заголовка экрана "Profile settings"
     */
    public SelenideElement textHeader() {

        return $(By.xpath("//android.widget.TextView[contains(@text,'Profile settings')]"));
    }

    /**
     * Поле Имя
     */
    public SelenideElement name() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_name"));
    }

    /**
     * Имя пользователя
     */
    public SelenideElement nameUser() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_view_name"));
    }

    /**
     * E-mail
     */
    public SelenideElement email() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_view_email"));
    }

    /**
     * Текст Пароль
     */
    public SelenideElement textPass() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_view_password"));
    }

    /**
     * Поле для смены пароля
     */
    public SelenideElement edit() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/edit_text_field"));
    }


    /**
     * Поле Пароль
     */
    public SelenideElement pass() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_password"));
    }

    /**
     * Поле Телефон
     */
    public SelenideElement phone() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_phone"));
    }

    /**
     * Текст Телефон
     */
    public SelenideElement textPhone() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_view_phone"));
    }

    /**
     * Поле Имя
     */
    public SelenideElement login() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_name"));
    }

    /**
     * Кнопка "Удалить аккаунт"
     */
    public SelenideElement btnDelete() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/button_delete_account"));
    }

    /**
     * Кнопка для закрытия поля без сохранения изменений
     */
    public SelenideElement buttonSkip() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/image_button_skip"));
    }

}
