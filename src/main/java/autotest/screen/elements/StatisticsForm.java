package autotest.screen.elements;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class StatisticsForm {

    /**
     * "Текст заголовка экрана Statistics"
     *
     */
    public SelenideElement textHeader(String name) {
        return $(By.xpath("//android.widget.TextView[contains(@text,'" + name + "')]"));
    }

    /**
     * Переключить экраны
     */
    public SelenideElement tabDots(int i) {
        return $(By.xpath("//android.widget.HorizontalScrollView[@resource-id='com.SES.EXAMPLEClient.debug:id/tabDots']" +
                "/android.widget.LinearLayout" +
                "/android.support.v7.app.ActionBar$Tab[@index='"+ i +"']"));
    }

    /**
     * Заголовок экрана Потребления
     */
    public SelenideElement consumption(String name) {
        return $(By.xpath("//android.widget.TextView[@resource-id='com.SES.EXAMPLEClient.debug:id/chart_name' and @text='" + name +"']"));
    }

    /**
     * Кнопка календарь
     */
    public SelenideElement calendar() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/chart_period"));
    }

    /**
     * График
     */
    public SelenideElement statisticChart() {
        return $(By.id("com.SES.EXAMPLEClient.debug:id/statistic_chart"));
    }

}
