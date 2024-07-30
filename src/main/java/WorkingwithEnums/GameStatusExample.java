package WorkingwithEnums;

public class GameStatusExample {
    public static void main(String[] args) {
        for(GameStatus gameStatus :GameStatus.values())
        {
            System.out.println(gameStatus);
        }
        GameStatus currentstatus = GameStatus.PAUSE;
        System.out.println(currentstatus);
    }
    
      
}
