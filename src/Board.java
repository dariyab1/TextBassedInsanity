import java.util.*;

public class Board {
    private ArrayList<String> board=new ArrayList<String>(Arrays.asList("X","X","X","X"," "," ","O","O","O","O"));
    private ArrayList<String> indexes=new ArrayList<String>(Arrays.asList("1","2","3","4","5","6","7","8","9","10"));
    public void printBoard(){
        System.out.println(board);
        System.out.println(indexes);
    }
    public boolean canMoveForward(int space){
        space--;
        if(board.get(space).equals("X")){

                if(board.get(space+1).equals(" ")||board.get(space+2).equals(" ")){
                    return true;

            }
        }
        else if(board.get(space).equals("O")){
                if(board.get(space-1).equals(" ")||board.get(space-2).equals(" ")){
                    return true;
                }
        }

        return false;
    }


    public void movePegForward(int from){
        if(canMoveForward(from)){
            from-=1;
            String temp=board.get(from);
            int to=from;
            if(temp.equals("X")){
                if(board.get(from+1).equals(" ")){
                to+=1;}
                else{
                    to+=2;
                }
            }
            if(temp.equals("O")){
                if(board.get(from-1).equals(" ")){
                to-=1;}
                else{
                    to-=2;
                }
            }
            board.set(to, temp);
            board.set(from, " ");}
        else{
            System.out.println("Cannot move this peg forward.");
        }
    }

    public boolean checkWin(){
        boolean O=false;
        boolean X=false;
        if(board.get(0).equals("O")&&board.get(1).equals("O")&&board.get(2).equals("O")&&board.get(3).equals("O")){
            O=true;
        }
        if(board.get(6).equals("X")&&board.get(7).equals("X")&&board.get(8).equals("X")&&board.get(9).equals("X")){
            X=true;
        }
        return X&&O;
    }

    public String getSpace(int space){
        return board.get(space-1);
    }

}
