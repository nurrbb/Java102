import java.util.Scanner;

public class Game {
    public Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("*** MYSTIC CHRONICLES  ***");
        System.out.println("please enter your name : ");
        String playerName = input.nextLine();
        Player player1 = new Player(playerName);
        System.out.println("Welcome " + player1.getName() +"! The realms are in need of your courage and skill.\n Begin your epic adventure and become a legend. " );
        player1.selectChar();

        Location location = null;
        while (true){
            System.out.println("Locations: \n  1- House \n 2-Store \n Please select a location:");
            int select =input.nextInt();
            switch (select){
                case 1:
                    location = new House(player1);
                    break;
                case 2:
                    location = new Store(player1);
                    break;
                default:
                    location= new House(player1);
            }
            System.out.println(location.getName());
            if(!location.LocationStatus()){
                System.out.println("GAME OVER");
                break;
            }
        }

    }
}
