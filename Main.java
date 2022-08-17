import java.util.*;

class Main {  
  public static void main(String args[]) { 
		String[][][] gameBoard = new String[][][]{{
			{"1","2","3"},
			{"4","5","6"},
			{"7","8","9"}
		},};

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
}
