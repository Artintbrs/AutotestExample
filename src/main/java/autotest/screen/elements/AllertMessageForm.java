package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;

public class AllertMessageForm {

    /**
     * Сообщение о недоступности сервера
     */
    public SelenideElement messagePanel() {
        return $(By.id("android:id/parentPanel"));
    }

    /**
     * Текст сообщения о недоступности сервера
     */
    public SelenideElement messageText(String textMessage) {
        return $(By.xpath("//android.widget.TextView[contains(@text,'"+ textMessage + "')]"));
    }

    /**
     * Кнопка "ОК"
     */
    public SelenideElement okButton() {
        return $(By.id("android:id/button1"));
    }

}
