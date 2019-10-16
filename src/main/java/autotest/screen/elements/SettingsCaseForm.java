package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SettingsCaseForm {

    /**
     * Открыть телефонный наббор
     */
    public SelenideElement phoneApp() {
        return $(By.xpath("//android.widget.TextView[@content-desc=\"Phone\"]"));
    }

    /**
     * Открыть вкладку "Добавить контакт"
     */
    public SelenideElement Contact() {
        return $(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.google.android.dialer:id/lists_pager_header']" +
                "/android.widget.LinearLayout/android.widget.RelativeLayout[3]"));
    }

    /**
     * Добавить контакт
     */
    public SelenideElement addContact() {
        return $(By.id("com.google.android.dialer:id/empty_list_view_action"));
    }

    /**
     * Кнопка закрыть всплывающее сообщение от Google
     */
    public SelenideElement buttonClose() {
        return $(By.id("com.android.contacts:id/left_button"));
    }

    /**
     * Ввести имя контакта
     */
    public SelenideElement editName() {
        return $(By.xpath("//android.widget.LinearLayout[@resource-id='com.android.contacts:id/editors']" +
                "/android.widget.EditText[1]"));
    }

    /**
     * Сохранить контакт
     */
    public SelenideElement buttonSaveContact() {
        return $(By.id("com.android.contacts:id/editor_menu_save_button"));
    }

    /**
     * Имя созданного контакта
     */
    public SelenideElement nameContact() {
        return $(By.id("com.android.contacts:id/large_title"));
    }


}
