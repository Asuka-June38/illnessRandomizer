public class ResponseProvider {
    public static String Get(String input){
        String response = "";

         if (input.equals("y")) {
             response = "Take rest!";
        }
            else if (input.equals("n")) {
                response = "Go back to work!";
        }
            else {
                response = "Your answer is unreadable. Are you ok?";
        }
            return response;
    }
}
