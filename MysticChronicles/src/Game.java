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

    }
}
