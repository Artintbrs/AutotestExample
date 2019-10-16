package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AddHomeForm {

    /**
     * Текст заголовка экрана "Add Home +"
     */
    public SelenideElement textHeader() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Add home +')]"));
    }

    /**
     * Текст приветствия "Add Home +"
     */
    public SelenideElement textWelcome() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Welcome')]"));
    }

    /**
     * Текст назовите новое место
     */
    public SelenideElement textQuestion() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'How would you like to name your house?')]"));
    }

    /**
     * Поле "Имя дома"
     */
    public SelenideElement houseName() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/et_home_name"));
    }

    /**
     * Кнопка "Создать"
     */
    public SelenideElement create() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/add_home"));
    }

    /**
     * Текст заголовка экрана Добавить WI-FI в новое домовладение
     */
    public SelenideElement textHeaderNewHouse(String name) {
        return $(By.xpath("//android.widget.TextView[contains(@text,'" + name + "')]"));
    }

    /**
     * Текст ...WiFi network...
     */
    public SelenideElement textWiFi() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'WiFi network')]"));
    }

    /**
     * Имя домавладения
     */
    public SelenideElement nameHouse() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/tv_home_name"));
    }

    /**
     * Поле имя Wi-Fi
     */
    public SelenideElement nameWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/et_wifi_name"));
    }

    /**
     * Поле пароля
     */
    public SelenideElement passwordWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/et_wifi_password"));
    }

    /**
     * Кнопка показать/скрыть пароль Wi-Fi
     */
    public SelenideElement showPassword() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_input_password_toggle"));
    }

    /**
     * Кнопка "Создать Wi-Fi"
     */
    public SelenideElement createWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/save_wifi"));
    }

    /**
     * Пропустить Создание Wi-Fi
     */
    public SelenideElement skipCreateWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/skip"));
    }

}
