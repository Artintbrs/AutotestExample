package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class Controls {

    /**
     * Кнопка вызова бокового меню
     */
    public SelenideElement buttonMenu() {
        return $(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]"));
    }

    /**
     * Кнопка обновить данные
     */
    public SelenideElement buttonRefresh() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/action_refresh"));
    }

    /**
     * Кнопка настройки
     */
    public SelenideElement buttonSettings() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/action_settings"));
    }

    /**
     * Кнопка на прадыдущий экран
     */
    public SelenideElement buttonBack() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/arrow_prev"));
    }

    /**
     * Кнопка на следующий экран
     */
    public SelenideElement buttonNext() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/arrow_next"));
    }

    /**
     * Кнопка верхней панели вернуться на предыдущий экран
     */
    public SelenideElement buttonBackScreen() {
        return $(By.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
    }

}
