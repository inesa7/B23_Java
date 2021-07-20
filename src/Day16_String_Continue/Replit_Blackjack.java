package Day16_String_Continue;

import java.util.Scanner;

public class Replit_Blackjack {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int house = s.nextInt();
        int player = s.nextInt();


        if(player>21){
            System.out.println("player busts");
        }else if(house>player){
            System.out.println("player loses");
        }else if(house==player){
            System.out.println("its a tie");
        }else if(player>house){
            System.out.println("player wins");
        }

    }
}
/*
In blackjack after the player asks to keep the house 4 things may happen.

if the card total is bigger then 21 the player busts.

if the house score is bigger then the player, the player loses .

if the player score is equal to the house then they are a draw.

if the player score is bigger then the house the player wins.

player and house scores are represented by player and house int variables.

check them using ifs to determine the result.

Example:

input:
8
21
output: player win

input:
10
7
output: player loss

input:
4
4
output: its a tie

input:
 7
 12
output: player win

input:
 7
 12
output: player win

input:
10
25
output: player bust
 */