package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MenuForm {

    /**
     * Login пользователя
     */
    public SelenideElement textLogin() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_view_nav_title"));
    }

    /**
     * Exit
     */
    public SelenideElement textExit() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_view_nav_change_account"));
    }

    /**
     * Квартира
     */
    public SelenideElement homePlace() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Квартира')]"));
    }

    /**
     * Офис
     */
    public SelenideElement officePlace() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Офис')]"));
    }

    /**
     * Имя домовладения
     */
    public SelenideElement housePlace(String name) {
        return $(By.xpath("//android.widget.TextView[@resource-id='com.SES.EXAMPLEClient.debug:id/text_view_nav_list_item_homeplace' and @text='" + name + "']"));
    }

    /**
     * Кнопка добавить место
     */
    public SelenideElement addPlace() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Add home')]"));
    }

    /**
     * Настройки профиля
     */
    public SelenideElement profileSettings() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/nav_item_profile_settings"));
    }

    /**
     * Помощь
     */
    public SelenideElement help() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/nav_item_help"));
    }

    /**
     * О приложении
     */
    public SelenideElement about() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/nav_item_about"));
    }


}
