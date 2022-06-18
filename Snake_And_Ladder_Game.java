
//Utkarsh Chaurasia
import java.util.*;

public class Snake_And_Ladder_Game {

    public void cls() { // Function for CLEAR SCREEN
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public int snake(int game) { // Function for storing all the SNAKES
        switch (game) {
            case 12:
                return 8;
            case 21:
                return 19;
            case 37:
                return 22;
            case 54:
                return 34;
            case 59:
                return 44;
            case 62:
                return 40;
            case 75:
                return 56;
            case 88:
                return 11;
            case 99:
                return 65;

            default:
                return game;
        }
    }

    public int ladder(int game) { // Function for storing all the LADDERS
        switch (game) {
            case 6:
                return 15;
            case 14:
                return 48;
            case 24:
                return 36;
            case 45:
                return 78;
            case 70:
                return 91;
            case 79:
                return 98;
            case 87:
                return 95;

            default:
                return game;
        }
    }

    public static void main(String[] args) { // Main Loop Begin's

        // Reset
        String RESET = "\033[0m"; // Text Reset

        // Regular Colors
        String YELLOW = "\033[0;33m"; // YELLOW
        String CYAN = "\033[0;36m"; // CYAN

        // Bold
        String GREEN_BOLD = "\033[1;32m"; // GREEN
        String YELLOW_BOLD = "\033[1;33m"; // YELLOW

        // Underline
        String GREEN_UNDERLINED = "\033[4;32m"; // GREEN

        // Background
        String RED_BACKGROUND = "\033[41m"; // RED

        // High Intensity
        String WHITE_BRIGHT = "\033[0;97m"; // WHITE

        // Bold High Intensity
        String RED_BOLD_BRIGHT = "\033[1;91m"; // RED
        String PURPLE_BOLD_BRIGHT = "\033[1;95m";// PURPLE

        Scanner sc = new Scanner(System.in);
        Snake_And_Ladder_20115091_Shilpa_Sahu obj = new Snake_And_Ladder_20115091_Shilpa_Sahu();

        obj.cls();
        int[][] store = { { 100, 99, 98, 97, 96, 95, 94, 93, 92, 91 }, // To create the BOARD
                { 81, 82, 83, 84, 85, 86, 87, 88, 89, 90 },
                { 80, 79, 78, 77, 76, 75, 74, 73, 72, 71 },
                { 61, 62, 63, 64, 65, 66, 67, 68, 69, 70 },
                { 60, 59, 58, 57, 56, 55, 54, 53, 52, 51 },
                { 41, 42, 43, 44, 45, 46, 47, 48, 49, 50 },
                { 40, 39, 38, 37, 36, 35, 34, 33, 32, 31 },
                { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 },
                { 20, 19, 18, 17, 16, 15, 14, 13, 12, 11 },
                { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 } };

        int game = 0, dice_show = 0;

        System.out.print(GREEN_UNDERLINED + "Total no. of players:" + RESET + " " + YELLOW);
        int no_of_players = sc.nextInt();

        String[] player_name = new String[no_of_players];
        String last_name = "";

        int[] player_game_pos = new int[no_of_players];
        int[] start = new int[no_of_players];
        int last_player_no = 0;

        for (int i = 0; i < no_of_players; i++) {
            System.out.print(GREEN_UNDERLINED + "Enter your name:" + RESET + " " + CYAN);
            player_name[i] = sc.next();
            player_game_pos[i] = 0;
            start[i] = 0;
        }

        System.out.print(RESET);

        sc.nextLine();

        while (game < 100) // Main ALGORITHM

        {
            for (int player_no = 0; player_no < no_of_players; player_no++) {
                obj.cls();

                int die = (int) Math.floor(Math.random() * (6) + 1);

                game = player_game_pos[last_player_no];
                if (start[player_no] == 1 && player_game_pos[last_player_no] + die <= 100) {
                    game += die;
                    game = obj.snake(game);
                    game = obj.ladder(game);
                    player_game_pos[last_player_no] = game;
                } else if (die == 6) {
                    start[player_no] = 1;
                }

                for (int i = 0; i < 10; i++) {
                    for (int j = 0; j < 10; j++) {
                        if (store[i][j] > 0 & store[i][j] < 10) {
                            System.out.print("  ");
                        } else if (store[i][j] != 100) {
                            System.out.print(" ");
                        }

                        boolean printed = false;

                        int last_player_pos = 0;

                        for (int k = 0; k < player_game_pos.length; k++) {

                            if (store[i][j] == player_game_pos[k] & store[i][j] != last_player_pos) {

                                System.out.print(RED_BACKGROUND + store[i][j] + RESET + " ");

                                last_player_pos = player_game_pos[k];
                                printed = true;
                            }
                        }

                        if (!printed) {
                            if (store[i][j] == 12 ||
                                    store[i][j] == 21 ||
                                    store[i][j] == 35 ||
                                    store[i][j] == 37 ||
                                    store[i][j] == 54 ||
                                    store[i][j] == 59 ||
                                    store[i][j] == 62 ||
                                    store[i][j] == 75 ||
                                    store[i][j] == 88 ||
                                    store[i][j] == 99) {
                                System.out.print(GREEN_BOLD + store[i][j] + " " + RESET);
                            }

                            else if (store[i][j] == 6 ||
                                    store[i][j] == 14 ||
                                    store[i][j] == 24 ||
                                    store[i][j] == 45 ||
                                    store[i][j] == 70 ||
                                    store[i][j] == 79 ||
                                    store[i][j] == 87) {
                                System.out.print(YELLOW_BOLD + store[i][j] + " " + RESET);
                            }

                            else {
                                System.out.print(store[i][j] + " ");
                            }
                        }
                    }
                    System.out.println();
                }
                System.out.println(
                        GREEN_BOLD + "\nSnakes: 12=>8 21=>19 35=>3 37=>22 54=>34 59=>44 62=>40 75=>56 88=>11 99=>65"
                                + RESET);

                System.out.println(YELLOW_BOLD + "Ladders: 6=>15 14=>48 24=>36 45=>78 70=>91 79=>98 87=>95\n" + RESET);

                if (dice_show == 1) {
                    System.out.print(CYAN + last_name + RESET);
                    System.out.println("'s " + PURPLE_BOLD_BRIGHT + "Dice :" + die + "\n");
                }
                System.out.println(WHITE_BRIGHT + "Players:");

                for (int i = 0; i < no_of_players; i++) {
                    System.out.print(CYAN + player_name[i] + ": " + RESET);
                    System.out.println(player_game_pos[i]);

                }
                if (game == 100) {
                    System.out.print(RED_BOLD_BRIGHT + "\nCongratulations!!! " + CYAN + last_name + RESET
                            + " won the GAME Snake & Ladders!");
                    break;
                }

                System.out.println("\n\nIt's " + CYAN + player_name[player_no] + RESET + "'s turn. "
                        + "Press Enter to roll Dice. ");

                sc.nextLine();

                dice_show = 1;
                last_name = player_name[player_no];
                last_player_no = player_no;
            }
        }
        System.out.print("\nPress enter to exit.");
        sc.nextLine();

    }
}
