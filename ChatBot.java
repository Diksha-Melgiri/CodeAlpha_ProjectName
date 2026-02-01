 import java.util.Scanner;

class ChatBot {

    public static String getResponse(String input) {
        input = input.toLowerCase();

        if (input.contains("hello") || input.contains("hi")) {
            return "Hello! How can I help you today?";
        }
        else if (input.contains("name")) {
            return "I am an AI Chatbot created using Java.";
        }
        else if (input.contains("ai")) {
            return "AI stands for Artificial Intelligence.";
        }
        else if (input.contains("help")) {
            return "I can answer basic questions related to AI and Java.";
        }
        else if (input.contains("bye")) {
            return "Goodbye! Have a great day 😊";
        }
        else {
            return "Sorry, I did not understand that. Please try again.";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("AI Chatbot Started (type 'bye' to exit)");

        while (true) {
            System.out.print("You: ");
            String userInput = sc.nextLine();

            String response = getResponse(userInput);
            System.out.println("Bot: " + response);

            if (userInput.toLowerCase().contains("bye")) {
                break;
            }
        }
        sc.close();
    }
} 
    

