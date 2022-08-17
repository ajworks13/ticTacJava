import java.util.*;

class Main {  

	//global

	private static void theGameBoard(String choice){
		String[][][] gameBoard = new String[][][]{{
			{"_","_","_"},
			{"_","_","_"},
			{"_","_","_"}
		},};

	}
	
  public static void main(String args[]) { 
		boolean gameOver = false;
		/*
		String[][][] gameBoard = new String[][][]{{
			{"_","_","_"},
			{"_","_","_"},
			{"_","_","_"}
		},};
		*/
		Scanner sc = new Scanner(System.in);

		System.out.println("Player 1, Enter your name to start playing:");
		String player1 = sc.nextLine();

		System.out.println("Player 2, Enter your name to start playing with " + player1);
		String player2 = sc.nextLine();

		do{
			System.out.println("Player 1, GO!\nSelect from 1 - 9 ");
			String p1Choice = sc.nextLine();


			theGameBoard(p1Choice);
			
		}while(gameOver != true);

		for(int x = 0; x < gameBoard.length; x++){
			for(int y = 0; y < gameBoard[x].length; y++){
				for(int z = 0; z < gameBoard[x][y].length; z++){
					System.out.print(gameBoard[x][y][z]);
				}
				System.out.println("");
			}
			System.out.println("");
		}


		
  } // main


	
}
