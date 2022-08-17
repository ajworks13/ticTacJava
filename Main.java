import java.util.*;

class Main {  

	//global

	private static void referee(){
		
	}

	private static void theGameBoard(String choice, String whichPlayer){
		String[][][] gameBoard = new String[][][]{{
			{"_","_","_"},
			{"_","_","_"},
			{"_","_","_"}
		},};
		String[][][] thePlayersDecisions = new String[][][]{
			{
				{"","",""},
				{"","",""},
				{"","",""}
			},
		};

		if(gameBoard[0][0][0].equals("X") && thePlayersDecisions[0][0][0].equals("player1")){
			do{
				
			}while()
		}

		if(choice.equals("1") && whichPlayer.equals("player1")){
			gameBoard[0][0][0] = "X";
			thePlayersDecisions[0][0][0] = "player1";
		}

		

		for(int x = 0; x < gameBoard.length; x++){
			for(int y = 0; y < gameBoard[x].length; y++){
				for(int z = 0; z < gameBoard[x][y].length; z++){
					System.out.print(gameBoard[x][y][z]);
				}
				System.out.println("");
			}
			System.out.println("");
		}

	}
	
  public static void main(String args[]) { 
		boolean gameOver = false;
		String player1Name = "player1";
		String player2Name = "player2";
		
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
			System.out.println("Player 1, GO!\nType one number from 1 through 9 ");
			String p1Choice = sc.nextLine();
			
			theGameBoard(p1Choice, player1Name);

			System.out.println("Player 2! Go\nType one number from 1 through 9");
			String p2Choice = sc.nextLine();

			theGameBoard(p2Choice,player2Name);
			
		}while(gameOver != true);
/*
		for(int x = 0; x < gameBoard.length; x++){
			for(int y = 0; y < gameBoard[x].length; y++){
				for(int z = 0; z < gameBoard[x][y].length; z++){
					System.out.print(gameBoard[x][y][z]);
				}
				System.out.println("");
			}
			System.out.println("");
		}
*/

		
  } // main


	
}
