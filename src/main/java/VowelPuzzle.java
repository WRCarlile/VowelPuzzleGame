import java.util.*;
import java.util.Map;
import java.util.HashMap;
// import spark.ModelAndView;
// import spark.template.velocity.VelocityTemplateEngine;
// import static spark.Spark.*;

public class VowelPuzzle {
  public static void main(String[] args) {
    // staticFileLocation("/public");
    //   get("/", (request, response) -> {
    //     Map<String, Object> model = new HashMap<String, Object>();
    //     model.put("template", "templates/home.vtl");
    //     return new ModelAndView(model, "templates/layout.vtl");
    //   }, new VelocityTemplateEngine());
    //
    //   get("/detector", (request, response) -> {
    //     Map<String, Object> model = new HashMap<String, Object>();
    //
    //     String userInput = request.queryParams("blank");
    //     App newApp = new App();
    //     Boolean results = newApp.methodName(userInput);
    //     model.put("results", results);
    //
    //     model.put("template", "templates/detector.vtl");
    //     return new ModelAndView(model, "templates/layout.vtl");
    //   }, new VelocityTemplateEngine());
  }

  public static String vowelRemover(String userInput) {
    // String newSentence = userInput.toCharArray();

    // char e = 'e';
    String newSentence = userInput.replace('e','-');
    newSentence = newSentence.replace('a','-');
    newSentence = newSentence.replace('u','-');
    newSentence = newSentence.replace('i','-');
    newSentence = newSentence.replace('o','-');
    System.out.println(newSentence);
    return newSentence;

  }

}
