import org.fluentlenium.adapter.FluentTest;
import org.junit.ClassRule;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class VowelPuzzleFluentTest extends FluentTest {
  public WebDriver webDriver = new HtmlUnitDriver();

  @Override
  public WebDriver getDefaultDriver() {
    return webDriver;
  }

  @ClassRule
  public static ServerRule server = new ServerRule();

  @Test
  public void rootTest() {
    goTo("http://localhost:4567/");
    assertThat(pageSource()).contains("Vowel Game");
  }
  @Test
  public void createPuzzle() {
    goTo("http://localhost:4567/");
    fill("#sentence").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("h-ll-");
  }
  @Test
  public void checkPuzzlePass() {
    goTo("http://localhost:4567/");
    fill("#sentence").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("h-ll-");
    fill("#answer").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("You Win!");
  }
  @Test
  public void checkPuzzleFail() {
    goTo("http://localhost:4567/");
    fill("#sentence").with("hello");
    submit(".btn");
    assertThat(pageSource()).contains("h-ll-");
    fill("#answer").with("hell");
    submit(".btn");
    assertThat(pageSource()).contains("Try Again!");
  }
}
