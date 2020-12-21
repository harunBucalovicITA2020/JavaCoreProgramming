package vježbePrezentacija;

public class Vježba7 {
    public static void main(String[] args) {
       byte heroState = 1;
       if(heroState == 1){
           System.out.println("Hero is dead!");
           heroState = 2;
           System.out.println("Hero is alive, but in critical condition!");
       }else if(heroState == 2){
           System.out.println("Hero is in critical condition");
       }else if(heroState == 3){
           System.out.println("Hero hase full helth");
       }
    }
}
