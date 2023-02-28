import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Configuration.browserSize;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Testgithub {
    @BeforeAll
    static void beforeAll() {
        browserSize = "1920x1080";
    }

    @Test
    void gitTest() {
        open("https://github.com/selenide/selenide");
        $("#wiki-tab").click();
        $(".gollum-markdown-content").shouldHave(text("Soft assertions"));
        $(byText("Soft assertions")).click();
        $(".markdown-body").shouldHave(text("Using JUnit5 extend test class"));

    }

}
