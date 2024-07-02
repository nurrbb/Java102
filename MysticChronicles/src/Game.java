import java.util.Scanner;

public class Game {
    public Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("welocme messega");
        System.out.println("please nickname: ");
        String playerName = input.nextLine();
        Player player1 = new Player(playerName);
        System.out.println(player1.getName() + "welcome messege");
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
