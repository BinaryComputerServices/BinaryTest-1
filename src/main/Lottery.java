package main;

public class Lottery extends Player {

	
	public int[] getNumbers() {
		return numbers;
	}

	public String getWinner() {
		return winner;
	}

	public String getDrawer() {
		return drawer;
	}

	public void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public void setDrawer(String drawer) {
		this.drawer = drawer;
	}

	private int numbers[];
	private String winner;
	private String drawer;
	
	public Lottery(){
		numbers = null;
		winner = "";
		drawer="";
	}
	
	
	
}
