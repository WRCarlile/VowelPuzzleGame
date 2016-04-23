import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class VowelPuzzle {
  static String userInput = "";
  public static void main(String[] args) {
    staticFileLocation("/public");
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      userInput = request.queryParams("sentence");
      VowelPuzzle newPuzzle = new VowelPuzzle();
      String results = newPuzzle.vowelRemover(userInput);
      model.put("results", results);
      model.put("template", "templates/detector.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/winner", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      VowelPuzzle codedInput = new VowelPuzzle();
      String answerInput = request.queryParams("answer");
      String winner = codedInput.compareSentences(userInput, answerInput);
      model.put("winner", winner);
      model.put("template", "templates/winner.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }

  public static String vowelRemover(String userInput) {
    String newSentence = userInput.replace('e','-');
    newSentence = newSentence.replace('a','-');
    newSentence = newSentence.replace('u','-');
    newSentence = newSentence.replace('i','-');
    newSentence = newSentence.replace('o','-');
    return newSentence;
  }

  public static String compareSentences(String userInput, String answerInput){

    String win = "You Win!";
    String tryAgain = "Try Again!";
    if (userInput.equals(answerInput)) {
       return win;
    } else {
      return tryAgain;
    }
  }
}
