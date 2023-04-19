package view;

import controller.Controller;

import java.util.Scanner;

public class View {
    private Controller controller;

    public View(Controller controller) {
        this.controller = controller;
    }

    public void run() {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter information about person or type \"exit\" to stop program:");
                String userInput = scanner.nextLine();
                if (userInput.toLowerCase().equals("exit")) {
                    break;
                } else {
                    controller.saveData(userInput);
                    System.out.println("Save succeeded");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
