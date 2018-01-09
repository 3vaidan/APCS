/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li> Uses indexOf to find strings
 * </li><li> Handles responding to simple words and phrases 
 * </li></ul> This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
 /**
  * Get a default greeting  
  * @return a greeting
  */
 public String getGreeting()
 {
  return "Hello, let's talk.";
 }
 
 /**
  * Gives a response to a user statement
  * @param statement the user statement
  * @return a response based on the rules given
  */
 public String getResponse(String statement)
 {
  String response = "";
  if (statement.indexOf(" no ") >= 0 || (statement.indexOf("no") >= 0  && statement.length() == 2))
  {
   response = "Why so negative?";
  }
  else if (statement.indexOf(" mother ") >= 0
    || statement.indexOf(" father ") >= 0
    || statement.indexOf(" sister ") >= 0
    || statement.indexOf(" brother ") >= 0)
  {
   response = "Tell me more about your family.";
  }
  else if (statement.indexOf(" dog ") >= 0 || statement.indexOf(" cat ") >= 0) {
   response = "Tell more more about your pets!"; 
  }
  else if (statement.trim().length() == 0) {
   response = "Please enter something!"; 
  }
  else if(statement.indexOf("mean") >= 0) {
   response = "That isn't very nice!"; 
  } else if(statement.indexOf("weather") >= 0) {
   response = "It is 22 degrees out!"; 
  } else if(statement.indexOf("jacob") >= 0) {
   response = "I hear jacob is a nice guy!"; 
  } else if(findKeyword(statement,"I want to")) {
   response = transformIWantToStatement(statement); 
  }
  else if(findKeyword(statement,"I want")) {
   response = transformIWantStatement(statement); 
  } else if (findKeyword(statement,"you")) {
    response = youMeResponse(statement);
  } else
  {
   response = getRandomResponse();
  } 
  return response;
 }

 /**
  * Pick a default response to use if nothing else fits.
  * @return a non-committal string
  */
 private String getRandomResponse()
 {
  
  String response = "";
  String[] responses = {"Interesting, tell me more.","Hmm.","Do you really think so?","You don't say.","Nice weather today aint it?","Cool.","I agree","I don't think so.","Whatever you say!","Okay.","Thanks for that!"};
  final int NUMBER_OF_RESPONSES = responses.length;
  double r = Math.random();
  int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
  return responses[whichResponse];
 }
 
 public Boolean findKeyword(String statement, String key) {
  return statement.indexOf(key) >= 0;
 }
 
 public String transformIWantToStatement(String statement) {
  return "Have fun when you"+statement.substring(9);
 }
 
 public String transformIWantStatement(String statement) {
  return "Would you really be happy if you had"+statement.substring(6);
 }
 
 public String youMeResponse(String statement) {
  return "Why do you "+statement.substring(0,statement.length()-4).substring(2)+" me?"; 
 }
}
