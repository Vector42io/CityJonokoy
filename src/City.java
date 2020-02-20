import java.util.Scanner;

public class City {
    public static void main(String[] args) {






        boolean controller = true;
        while(controller) {
            Scanner input = new Scanner(System.in);
            System.out.println("Player1: ");
            String word1 = input.nextLine();
            word1 = word1.toUpperCase();
            int pos1 = word1.length() -1 ;
            System.out.println(word1.charAt(pos1));
            int player1_level = 0;
            player1_level++;

            System.out.println("Player2: ");
            String word2 = input.nextLine();
            int first_letter2 = word2.charAt(0);
            word2 = word2.toUpperCase();
            int pos2 = word2.length() - 1;
            int player2_level = 0;
            player2_level++;
            if (first_letter2 == word1.charAt(pos1)) {
                System.out.println(word2.charAt(pos2));


            }
            else if (first_letter2 != pos1){
                controller = false;
                System.out.println("Player1: " + player1_level);
                System.out.println("Player2: " + player2_level);
            }
        }
    }

}