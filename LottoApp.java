/*LottoApp.java
Group Project start
9 December 2018*/



import javax.swing.*;
import java.lang.Math.*;
public class LottoApp{

	public static void main(String args[]){

				String answer="yes";
				JOptionPane.showMessageDialog(null, "Please enter your numbers(between 1 and 40) if you wish to play the game ");
				do{
				int c=0; // how many times do you want to play the game

				int lottoNums[][] = new int[c=Integer.parseInt(JOptionPane.showInputDialog(null, "How many times do you want to play the game?(must be between 1 and 3)"))][6];
				int random [] = new int[6];
				int history [] = new int[3];
				int winnings = 0;
				int linesPlayed = 0;
				int linesWon = 0;
				int correctGuesses = 0;
				int correctGuesses2 = 0;
				int correctGuesses3 = 0;
				String message = "";



				Lotto myGo = new Lotto();

				// Get the numbers, we need two loops, one for the lottery lines and one for the number of games to play
				for(int a = 0; a < lottoNums.length; a++){
					// We can pick any of the 3 top level array elements to get the length for the second level...
					for(int b = 0; b < lottoNums[0].length; b++){

						lottoNums[a][b] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the lottery numbers for line " + (a + 1) + ", line position " + (b + 1) + " : "));
						linesPlayed=c;
					}
				}

				for(int i=0;i < random.length;i++){



				random[i]=(int)(Math.random()*40+1);

				System.out.println("The correct winning lotto numbers are " +random[i]);




				}



				myGo.setLottoNums(lottoNums);
				myGo.setRandom(random);
				myGo.compute();
				winnings = myGo.getWinnings();
				linesWon = myGo.getLinesWon();
				correctGuesses = myGo.getCorrectGuesses();
				correctGuesses2 = myGo.getCorrectGuesses2();
				correctGuesses3= myGo.getCorrectGuesses3();
				message= myGo.getMessage();

			history[0]=linesPlayed;
			history[1]=linesWon;
			history[2]=winnings;

			JOptionPane.showMessageDialog(null, "The number of lines played was " +history[0]);
			JOptionPane.showMessageDialog(null, "The number of lines played won was " +history[1]);
			JOptionPane.showMessageDialog(null, "The amount of the winnings was " +history[2]+message);



			if(linesPlayed==1){
			JOptionPane.showMessageDialog(null, "You guessed " +correctGuesses+ " number(s) on line 1");
			}

			if(linesPlayed==2){
			JOptionPane.showMessageDialog(null, "You guessed " +correctGuesses+ " number(s) on line 1,"+correctGuesses2+ " number(s) on line 2  " );
			}


			if(linesPlayed==3){
			JOptionPane.showMessageDialog(null, "You guessed " +correctGuesses+ " number(s) on line 1,"+correctGuesses2+ " number(s) on line 2 and " +correctGuesses3+" number(s) on line 3 ");
			}
			answer=JOptionPane.showInputDialog(null, "Do you want to play the game again(yes or no) ") ;

			}








		while(answer.equalsIgnoreCase("yes"));




	}



}

