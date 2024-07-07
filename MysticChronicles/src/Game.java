import java.util.Scanner;

public class Game {
    public Scanner input = new Scanner(System.in);
    public void start(){
        System.out.println("**************************");
        System.out.println("*** MYSTIC CHRONICLES  ***");
        System.out.println("please enter your name : ");
        String playerName = input.nextLine();
        Player player1 = new Player(playerName);
        System.out.println();
        System.out.println("Welcome " + player1.getName() +"! The realms are in need of your courage and skill.\nBegin your epic adventure and become a legend. " );
        System.out.println();
        player1.selectChar();

        Location location = null;

        while (true){
            System.out.println();
            System.out.println("Locations: \n 1- House \n 2-Store \n 3-Cave \n 4-Forest \n 5-River \n 6-Mine \n 7-Desert \n 0-Exit \n Please select a location:");
            int select =input.nextInt();
            switch (select){
                case 0:
                    location =null;
                    break;
                case 1:
                    location = new House(player1);
                    break;
                case 2:
                    location = new Store(player1);
                    break;
                case 3:
                    location =new Cave(player1);
                    break;
                case 4:
                    location = new Forest(player1);
                    break;
                case 5:
                    location = new River(player1);
                    break;
                case 6 :
                    location = new Mine(player1);
                    break;
                case 7:
                    location = new Desert(player1);
                    break;
                default:
                    location= new House(player1);
            }
            if (location == null){
                System.out.println("see you later");
                break;
            }
            if(!location.LocationStatus()){
                System.out.println("GAME OVER");
                break;
            }
        }

    }
}
