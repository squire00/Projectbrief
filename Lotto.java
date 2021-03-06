/*Lotto.java
Group Project start
9 December 2018*/




public class Lotto{


	private int lottoNums[][];	//2d array for our lottery numbers chosen
	private int random[];		//1d array for the winning numbers generated by the random method in java
	private int winnings;
	private int linesWon;				//must have a minimum of 3 winning numbers for it to count
	private int correctGuesses;			//correct guesses on line 1
	private int correctGuesses2;		//correct guesses on line 2
	private int correctGuesses3;		//correct guesses on line 3
	private String message;

	public Lotto(){


	lottoNums=new int[0][0];
	random=new int[0];
	winnings=0;
	linesWon=0;
	correctGuesses=0;
	correctGuesses2=0;
	correctGuesses3=0;
	message = "";

	}


	public void setLottoNums(int[][] lottoNums){
		this.lottoNums = lottoNums;
	}

	public void setRandom(int[] random){
			this.random = random;
	}




	public void compute(){

		// This loop is for the numbers generated by the random method in java
		for(int i=0;i < random.length;i++){
		// Two loops, one for the lottery numbers selected then, within that, another for the number of times to play...
						for(int a=0;a<lottoNums.length;a++){
							for(int b=0;b < lottoNums[a].length;b++){


								if(random[i]==lottoNums[a][b]){

									if(a==0){

									correctGuesses=correctGuesses+1;// identifies the number of correct guesses on line 1
									}

									if(a==1){

									correctGuesses2=correctGuesses2+1;// identifies the number of correct guesses on line 2

									}

									if(a==2){

									correctGuesses3=correctGuesses3+1;// identifies the number of correct guesses on line 3
									}
								}

							}


						}


					}





		//if statements are used to check for conditions outlined in the spec
		//you must allow winnings to be augmented for a win on any line


					if((correctGuesses == 3)){
						winnings=winnings+100;

					}

					if((correctGuesses2 == 3)){
						winnings=winnings+100;

					}
					if((correctGuesses3 == 3)){
						winnings=winnings+100;

					}


					if((correctGuesses == 4)){
						winnings=winnings+250;
					}
					if((correctGuesses2 == 4)){
						winnings=winnings+250;
					}

					if((correctGuesses3 == 4)){
						winnings=winnings+250;

					}



					if((correctGuesses == 5)){
						winnings=winnings+1000;

					}

					if((correctGuesses2 == 5)){
						winnings=winnings+1000;
					}

					if((correctGuesses3 == 5)){
						winnings=winnings+1000;
					}


					if((correctGuesses == 6)){
						message = "Won the Lottery";
					}

					if((correctGuesses2 == 6)){
						message = "Won the Lottery";
					}

					if((correctGuesses3 == 6)){

						message = "Won the Lottery";
					}


					//you must allow for the possibility of each line being a winner

					if((correctGuesses >= 3)){
						linesWon=linesWon+1;
					}
					if((correctGuesses2 >= 3)){

						linesWon=linesWon+1;
					}

					if((correctGuesses3 >= 3)){
						linesWon=linesWon+1;
					}



	}


	public int getWinnings(){
			return winnings;
	}

	public int getLinesWon(){
			return linesWon;
	}

	public int getCorrectGuesses(){
			return correctGuesses;
	}


	public int getCorrectGuesses2(){
			return correctGuesses2;
	}

	public int getCorrectGuesses3(){
			return correctGuesses3;
	}

	public String getMessage(){
			return message;


	}




}


