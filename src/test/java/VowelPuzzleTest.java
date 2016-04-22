import org.junit.*;
import static org.junit.Assert.*;

public class VowelPuzzleTest {

@Test
public void vowelRemover_replaceSentenceVowelsWithDash_dashForVowels() {
  VowelPuzzle testVowelPuzzle = new VowelPuzzle();
  String expected = "Th- s-n w-ll c-m- --t t-m-rr-w" ;
  assertEquals(expected, testVowelPuzzle.vowelRemover("The sun will come out tomorrow"));
  }
}
