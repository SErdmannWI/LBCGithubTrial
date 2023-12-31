import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        mainMenu();
        Main audreyObject = new Main();
        System.out.println(audreyObject);
    }

    public static void mainMenu() {
        System.out.println("Welcome to the github trial program!");
        String mainMenuPrompt = "Please select which program you would like to run.\n1) Josh's program"
            + "\n2) Audrey's program\n3) Nicholai's program\n4) Scott's program)";
        int menuChoice = menuHandler(mainMenuPrompt, 1, 4);

        switch (menuChoice) {
            case 1 -> joshProgram();
            case 2 -> audreyProgram();
            case 3 -> nicholaiProgram();
            case 4 -> scottProgram();
        }

    }

    public static void joshProgram() {
        mainMenu();
        System.out.println("Im helping with this line");

    }

    public static void audreyProgram() {
        mainMenu();

    }

    public static void nicholaiProgram() {
        mainMenu();

    }

    public static void scottProgram() {
        //testing adding a comment in second branch
        TestAI mrTest = new TestAI();
        System.out.println("This is me working on my branch.");
        System.out.println("The AI's uuid is: " + mrTest.getUuid());
        mainMenu();
        Car testCar = new Car("Name", 50.0, true);

    }

    public static void audreyProgram2() {
        TestAI mrTest = new TestAI();
        System.out.println("Branches are better than twigs.");
    }

    public static int menuHandler(String menuPrompt, int min, int max) {
        Scanner userInput = new Scanner(System.in);
        boolean inputValid = false;
        int inputValue = 0;

        while (!inputValid) {
            System.out.println(menuPrompt);
            String inputString = userInput.nextLine();
            try {
                inputValue = Integer.parseInt(inputString);
                if (inputValue < min || inputValue > max) {
                    throw new IllegalArgumentException();
                } else {
                    inputValid = true;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please try again");
            }
        }
        return inputValue;
    }


}
