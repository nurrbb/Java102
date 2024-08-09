import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Store patikaStore = new Store();
        Scanner scanner = new Scanner(System.in);
        patikaStore.mainMenu(scanner);
        scanner.close();
    }
}