import java.util.*;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class VowelPuzzle {
  public static void main(String[] args) {
    staticFileLocation("/public");
    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/detector", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String userInput = request.queryParams("sentence");
      VowelPuzzle newPuzzle = new VowelPuzzle();
      String results = newPuzzle.vowelRemover(userInput);
      model.put("results", results);
      model.put("template", "templates/detector.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());

    get("/winner", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      String userInput = request.queryParams("sentence");
      VowelPuzzle newPuzzle = new VowelPuzzle();
      String results = newPuzzle.vowelRemover(userInput);
      String sentenceInput = request.queryParams("answer");

      String winner = newPuzzle.compareSentences(results,sentenceInput);
      System.out.println(results);
      System.out.println(sentenceInput);
      model.put("winner", winner);
      model.put("template", "templates/winner.vtl");
      return new ModelAndView(model, "templates/layout.vtl");
    }, new VelocityTemplateEngine());
  }

  // public static String compareSentences(String results, String sentenceInput){
  //   String win = "You Win!";
  //   String tryAgain = "Try Again!";
  //   if (sentenceInput.equals(sentenceInput)) {
  //      return win;
  //   } else {
  //     return tryAgain;
  //   }
  // }

  public static String vowelRemover(String userInput) {
    String newSentence = userInput.replace('e','-');
    newSentence = newSentence.replace('a','-');
    newSentence = newSentence.replace('u','-');
    newSentence = newSentence.replace('i','-');
    newSentence = newSentence.replace('o','-');
    return newSentence;
  }
  public static String compareSentences(String results, String sentenceInput){
    String win = "You Win!";
    String tryAgain = "Try Again!";
    if (sentenceInput.equals(sentenceInput)) {
       return win;
    } else {
      return tryAgain;
    }
  }
}
