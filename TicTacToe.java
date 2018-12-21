/****************************************************************************
 *
 * Created by: Julie Nguyen
 * Created on: Dec 2018
 * Created for: ICS4U
 * Tic Tac Toe (X's and O's) program
 *
 ****************************************************************************/

import java.util.Scanner;

public class TicTacToe {
	public static void main(String[] args) {
		// main stub, get user input here
		Scanner input = new Scanner(System.in);
		String[] board = {"e", "e", "e", "e", "e", "e", "e", "e", "e"};
		
		System.out.println("Welcome to tic tac toe! (note: 'e' stands for empty)\n");
		printExample();
		
		do {
			boolean fullBoard = isFull(board);
			if(fullBoard == true) {
				System.exit(0);
			}
			else {
				System.out.println("\nWhich space would you like to the X? ");
				if(input.hasNextInt()) {
					int space = input.nextInt();
					if(space >= 0 && space <= 8 && board[space].equalsIgnoreCase("e")) {
						board[space] = "X";
						compNextMove(board);
					}
					else if (board[space].equalsIgnoreCase("X") || board[space].equalsIgnoreCase("O")){
						System.out.println("That spot's taken!");
					}
					else {
						System.out.println("Error");
						break;
					}
				}
				else {
					System.out.println("Error");
					break;
				}
			}
		} while (true);
	}
	
	public static boolean winOrLost(String[] board, String takenSpace) {
        // returns true or false for whether or not inputted array is a magic square
        if((board[0] == takenSpace && board[1] == takenSpace && board[2] == takenSpace) || (board[3] == takenSpace && board[4] == takenSpace && board[5] == takenSpace) || (board[6] == takenSpace && board[7] == takenSpace && board[8] == takenSpace) || (board[0] == takenSpace && board[3] == takenSpace && board[6] == takenSpace) || (board[1] == takenSpace && board[4] == takenSpace && board[7] == takenSpace) || (board[2] == takenSpace && board[5] == takenSpace && board[8] == takenSpace) || (board[0] == takenSpace && board[4] == takenSpace && board[8] == takenSpace) || (board[2] == takenSpace && board[4] == takenSpace && board[6] == takenSpace)) {
            return true;
        }
        else {
            return false;
        }
    }
	
	public static int compNextMove(String[] currentBoard) {
		// calculates the best next move for computer based on current board
		
		return 1;
	}
	
	public static boolean isFull(String[] presentBoard) {
		// returns whether board is full or not
		boolean full = false;
		for(int counter = 0; counter < presentBoard.length; counter++) {
			if(presentBoard[counter].equalsIgnoreCase("e")) {
				full = false;
			}
			else {
				full = true;
			}
		}
		return full;
	}
	
	public static void printBoard() {
		// prints current game state
		
	}
	
	public static void printExample() {
		// prints out example board for user
		System.out.println("----+----+----");
		for(int count = 0; count < 9; count ++) {
            if(count == 2 || count == 5 || count == 8) {
            	System.out.print("| " + count + " |\n");
            	System.out.println("----+----+----");
            }
            else {
                System.out.print("| " + count + " ");
            }
        }
	}
}
