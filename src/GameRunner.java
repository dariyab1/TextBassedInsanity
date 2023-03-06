import java.util.*;
public class GameRunner {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        Board game=new Board();
        game.printBoard();
        int x=5;
        int playerTurn=0;
        while(!(game.checkWin())){
            System.out.println("Which spot do you want to move?");

            int from=input.nextInt();
            game.movePegForward(from);

            game.printBoard();
        }
        System.out.println("You won!");


    }
}
