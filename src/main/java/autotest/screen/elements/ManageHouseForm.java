package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ManageHouseForm {


    /**
     * Текст заголовка экрана "Manage house"
     */
    public SelenideElement textHeader() {
        return $(By.xpath("//android.view.ViewGroup[@resource-id='com.SES.EXAMPLEClient.debug:id/toolbar']" +
                "//android.widget.TextView[@text='Manage house']"));
    }

    /**
     * Поле "Имя дома"
     */
    public SelenideElement houseName() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_view_home_name"));
    }

    /**
     * Редактируемое поле "Имя дома"
     */
    public SelenideElement houseNameEditText() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/edit_text_field"));
    }

    /**
     * Поле "Notification settings"
     */
    public SelenideElement notificationsSettings() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_notifications_settings"));
    }

    /**
     * Поле "Add family members"
     */
    public SelenideElement addFamilyMembers() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_add_family_members"));
    }

    /**
     * Поле Setting "Nobody is at home"
     */
    public SelenideElement nobodyIsAtHomeSettings() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_nobody_is_at_home_settings"));
    }

    /**
     * Поле "Workdays settings"
     */
    public SelenideElement workdaysSettings() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_workdays_settings"));
    }

    /**
     * Поле "Report day of counters" "Report day"
     */
    public SelenideElement countersReportDay() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_counters_report_day"));
    }

    /**
     * Поле "WiFi settings"
     */
    public SelenideElement wifiSettings() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_wifi_settings"));
    }

    /**
     * Поле "Statistics"
     */
    public SelenideElement statistics() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_statistics"));
    }

    /**
     * Поле "Delete home"
     */
    public SelenideElement deleteHome() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/container_delete_home"));
    }

    /**
     * Сообщение подтверждения удаления домовладения
     */
    public SelenideElement alertDeleteHome() {
        return $(By.xpath("//android.view.ViewGroup[@resource-id='com.SES.EXAMPLEClient.debug:id/alertTitle']" +
                "//android.widget.TextView[@text='House deleting']"));
    }

    /**
     * Сообщение "Are you sure you want to delete this house?"
     */
    public SelenideElement messageDeleteHome() {
        return $(By.xpath("//android.view.ViewGroup[@resource-id='android:id/message']" +
                "//android.widget.TextView[@text='Are you sure you want to delete this house?']"));
    }

    /**
     * Кнопка "No"
     */
    public SelenideElement buttonNo() {
        return $(By.id("android:id/button2"));
    }

    /**
     * Кнопка "Yes" "ОК"
     */
    public SelenideElement buttonYes() {
        return $(By.id("android:id/button1"));
    }


    /**
     * Текст на экране добавить членов семьи "Invite your family members to application. They can have full access for managing or limited for view."
     */
    public SelenideElement textComment() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Invite your family')]"));
    }

    /**
     * Кнопка "Invite family members"
     */
    public SelenideElement buttonInvite() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/button_invite"));
    }

    /**
     * Модульное окно Send invite
     */
    public SelenideElement textSend() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Send invite')]"));
    }

    /**
     * Кнопка "Choose from contacts"
     */
    public SelenideElement buttonContact() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/button_from_contact"));
    }

    /**
     * Разрешить доступ приложения к списку контактов
     */
    public SelenideElement permissionContact() {
        return $(By.id("com.android.packageinstaller:id/perm_desc_root"));
    }

    /**
     * Контакт
     */
    public SelenideElement contact(String name) {
        return $(By.xpath("//android.widget.TextView[@resource-id='com.android.contacts:id/cliv_name_textview' and @text='" + name + "']"));
    }

    /**
     * Кнопка "Enter e-mail"
     */
    public SelenideElement buttonEnterEmail() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/button_enter_email"));
    }

    /**
     * Кнопка "Cancel"
     */
    public SelenideElement buttonCancel() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/button_cancel"));
    }

    /**
     * Кнопка "Allow"
     */
    public SelenideElement buttonAllow() {
        return $(By.id("com.android.packageinstaller:id/permission_allow_button"));
    }

    /**
     * Экран контактов пользователя
     */
    public SelenideElement headerContact() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'Choose a contact')]"));
    }

    /**
     * Поле для ввода имени
     */
    public SelenideElement editTextName() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/edit_text_name"));
    }

    /**
     * Поле для ввода E-mail
     */
    public SelenideElement editTextEmail() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/edit_text_email"));
    }

    /**
     * Поле для выбора роли
     */
    public SelenideElement spinnerRole() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/spinner_role"));
    }

    /**
     * Роль управляющего
     */
    public SelenideElement valueManage() {
        return $(By.xpath("//android.widget.TextView[@text='Manage']"));
    }

    /**
     * Роль наблюдателя
     */
    public SelenideElement valueView() {
        return $(By.xpath("//android.widget.TextView[@text='View']"));
    }

    /**
     * Сообщение об успешном добавлении
     */
    public SelenideElement messageAdded() {
        return $(By.xpath("//android.widget.TextView[@text='User added successfully']"));
    }

    /**
     * Сообщение об отправки сообщения пользователю
     */
    public SelenideElement messageSent() {
        return $(By.xpath("//android.widget.TextView[@text='An invitation message has been sent to the user']"));
    }

    /**
     * Добавленный пользователь
     */
    public SelenideElement checkAdded(String nameUser) {
        return $(By.xpath("//android.view.ViewGroup[@resource-id='com.SES.EXAMPLEClient.debug:id/text_name']" +
                "//android.widget.TextView[@text='" + nameUser + "']"));
    }

    /**
     * Переключатель роли
     */
    public SelenideElement switchRole() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/switch_role"));
    }

    /**
     * Роль добавленного пользователя
     */
    public SelenideElement textRole(String role) {
        return $(By.xpath("//android.view.ViewGroup[@resource-id='com.SES.EXAMPLEClient.debug:id/text_role']" +
                "//android.widget.TextView[@text='" + role + "']"));
    }

    /**
     * Сообщение об удалении пользователя
     */
    public SelenideElement alertTitle() {
        return $(By.xpath("//android.view.ViewGroup[@resource-id='com.SES.EXAMPLEClient.debug:id/alertTitle']" +
                "//android.widget.TextView[@text='Delete user from house?']"));
    }



    /**
     * Пиктограмма настройки Wi-Fi
     */
    public SelenideElement picWiFi() {
        return $(By.xpath("//android.widget.ImageView[@content-desc=\"WiFi settings\"]"));
    }

    /**
     * Текст на экране список Wi-Fi
     */
    public SelenideElement textWiFiList() {
        return $(By.xpath("//android.widget.TextView[contains(@text,'WiFi list')]"));
    }

    /**
     * Кнопка добавить Wi-Fi
     */
    public SelenideElement buttonAddWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/button_add_wifi" ));
    }


    /**
     * Название WiFi
     */
    public SelenideElement nameWiFi(String name) {
        return $(By.xpath("//android.widget.TextView[@resource-id='com.SES.EXAMPLEClient.debug:id/text_wifi_name' and @text='" + name + "']"));
    }

    /**
     * Кнопка настройки Wi-Fi
     */
    public SelenideElement buttonSettingWiFi(int i) {
        return $(By.xpath("//android.widget.ExpandableListView[@resource-id='com.SES.EXAMPLEClient.debug:id/exp_list_wifi']" +
                "/android.widget.LinearLayout[" + i + "]/android.widget.RelativeLayout/android.widget.ImageView[@resource-id='com.SES.EXAMPLEClient.debug:id/settings_button']"));
    }

    /**
     * Информация о подключенных устройствах
     */
    public SelenideElement connectedDevices(int i) {
        return $(By.xpath("//android.widget.ExpandableListView[@resource-id='com.SES.EXAMPLEClient.debug:id/exp_list_wifi']" +
                "/android.widget.LinearLayout[" + i + "]/android.widget.RelativeLayout/android.widget.TextView[@resource-id='com.SES.EXAMPLEClient.debug:id/empty']"));
    }

    /**
     * Текст на экране настройки Wi-Fi
     */
    public SelenideElement textEditWiFi() {
        return $(By.xpath("//android.widget.TextView[@text='Edit WiFi']"));
    }

    /**
     * Поле с именем Wi-Fi
     */
    public SelenideElement fieldNameWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/ssid"));
    }

    /**
     * Поле с паролем Wi-Fi
     */
    public SelenideElement passWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/password"));
    }

    /**
     * Показать пароль Wi-Fi
     */
    public SelenideElement showPassWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/text_input_password_toggle"));
    }

    /**
     * Кнопка сохранить
     */
    public SelenideElement buttonSaveWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/save_button"));
    }

    /**
     * Кнопка удалить
     */
    public SelenideElement buttonDeleteWiFi() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/delete_button"));
    }

    /**
     * Пиктограмма добавления Wi-Fi
     */
    public SelenideElement picConnectionWiFi() {
        return $(By.xpath("//android.widget.ImageView[@content-desc=\"WiFi connection\"]" ));
    }

    /**
     * Текст на экране Добавить Wi-Fi
     */
    public SelenideElement textAddWiFi() {
        return $(By.xpath("//android.widget.TextView[@text='Add WiFi']" ));
    }
}
