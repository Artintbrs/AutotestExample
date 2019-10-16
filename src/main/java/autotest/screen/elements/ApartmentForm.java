package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ApartmentForm {

    /**
     * Текст заголовка экрана домовладения
     */
    public SelenideElement textHeader(String name) {
        return $(By.xpath("//android.widget.TextView[contains(@text,'" + name + "')]"));
    }

    /**
     * Текст заголовка экрана домовладения
     */
    public SelenideElement textHeaders() {
        return $(By.xpath("//android.view.ViewGroup[@resource-id='com.SES.EXAMPLEClient.debug:id/toolbar']" +
                "/android.widget.TextView[@index='1']"));
    }

    /**
     * Иконка с домом
     */
    public SelenideElement atHome() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_at_home"));
    }

    /**
     * Текст под иконкой "В доме"
     */
    public SelenideElement textInHouse() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'In house')]"));
    }

    /**
     * Текст под иконкой "Вышел"
     */
    public SelenideElement textGone() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Gone')]"));
    }

    /**
     * Вкладка Heat
     */
    public SelenideElement textHeat() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Heat')]"));
    }

    /**
     * Вкладка Water
     */
    public SelenideElement textWater() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Water')]"));
    }

    /**
     * Кнопка "Добавить девайс"
     */
    public SelenideElement buttonAddDevice() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/button_add_device"));
    }

}
