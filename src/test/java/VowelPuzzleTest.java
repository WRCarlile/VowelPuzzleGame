import org.junit.*;
import static org.junit.Assert.*;

public class VowelPuzzleTest {

@Test
public void vowelRemover_replaceSentenceVowelsWithDash_dashForVowels() {
  VowelPuzzle testVowelPuzzle = new VowelPuzzle();
  String expected = "Th- s-n w-ll c-m- --t t-m-rr-w" ;
  assertEquals(expected, testVowelPuzzle.vowelRemover("The sun will come out tomorrow"));
  }
@Test
public void compareSentences_compareTheCodedSentenceWithTheUncoded_youWin() {
  VowelPuzzle testVowelPuzzle = new VowelPuzzle();
  String expected = "You Win!";
  assertEquals(expected, testVowelPuzzle.compareSentences("The sun will come out tomorrow", "The sun will come out tomorrow"));
  }
@Test
public void compareSentences_compareTheCodedSentenceWithTheUncoded_tryAgain() {
  VowelPuzzle testVowelPuzzle = new VowelPuzzle();
  String expected = "Try Again!";
  assertEquals(expected, testVowelPuzzle.compareSentences("The sun will come out tomorrow", "The son will come out tomorrow"));
  }

}
