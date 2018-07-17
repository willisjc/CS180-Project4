import java.util.ArrayList;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

    }

    public void addHero() {
        Scanner sc = new Scanner (System.in);
        int choice;
        System.out.println("Enter world");
        System.out.println("1 - Marvel");
        System.out.println("2 - DC");
        do {
            choice = sc.nextInt();
            sc.nextLine();
        } while (choice != 1 || choice != 2);
        System.out.println("Enter name");
        System.out.println("Enter weapon");
        String weapon = sc.nextLine();
        System.out.println("Enter vehicle");
        String vehicle = sc.nextLine();
        System.out.println("Enter powers");
        int i = 0;
        String input;
        String[] powers = new String[5];
        do {
            input = sc.nextLine();
            i++;
            
        } while (!input.equals("\n"));
    }

    public void modifyHero(String name) {

    }

    public void removeHero(String name) {

    }

    public void printDetail(String name) {

    }

    public void printHeroes() {

    }

    public ArrayList<SuperHero> getHeroList() {

    }

    public void run() {
        Scanner sc = new Scanner(System.in);
        String[] options = {"Add Hero", "Modify Hero", "Remove Hero", "Print Hero Details", "Print all Heroes", "Read from file", "Write to file", "Exit"};
        int choice;
        do {
            for (int i = 0; i < 8; i++) {
                System.out.printf("%d - %s\n", i + 1, options[i]);
            }
            do {
                choice = sc.nextInt();
                sc.nextLine();
            } while (!(choice <= 8 && choice >=1));
            switch (choice) {
                case 1:
                    addHero();
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:

                    break;
                case 8:

                    break;

            }
        } while (choice != 8);
    }

    void addFromFile(String filename) {

    }

    void writeToFile(String filename) {

    }


}
