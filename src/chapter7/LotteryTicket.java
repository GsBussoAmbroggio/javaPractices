package chapter7;

import java.util.Arrays;
import java.util.Random;



public class LotteryTicket {
    public static boolean search(int[]array,int numberToSearchFor){
        for (int value: array){
            if (value == numberToSearchFor){
                return true;
            }
        }
        return false;
    }

    private static final int LENGTH = 6;
    private static final int MAX_TICKET_NUMBER = 69;

    public static void main(String[] args){

        int[] ticket = generateNumbers();
        Arrays.sort(ticket);
        printTicket(ticket);
    }

    public static int[] generateNumbers(){

        int[] ticket = new int[LENGTH];
        Random random = new Random();

        for(int i=0; i< LENGTH; i++){
            int radomNumber;
            do {
                radomNumber = random.nextInt(MAX_TICKET_NUMBER) + 1;
            }while(search(ticket,radomNumber));
          ticket[i] = radomNumber;
        }

        return ticket;
    }

    public static void printTicket(int[] ticket){
        for(int i=0; i<LENGTH; i++){
            System.out.print(ticket[i] + " | ");
        }
    }
}