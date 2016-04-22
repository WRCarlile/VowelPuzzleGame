import org.junit.*;
import static org.junit.Assert.*;

public class VowelPuzzleTest {

  @Test
public void vowelRemover_replaceeEwithDash_dashForE() {
  VowelPuzzle testVowelPuzzle = new VowelPuzzle();
  String expected = "Th- sun will com- out tomorrow" ;
  assertEquals(expected, testVowelPuzzle.vowelRemover("The sun will come out tomorrow"));
  }
}
