package extend;

public class videoGames extends classes {
	private int numberOfplays;
	public videoGames(String name, int price,int number) {
		super(name, price);
		numberOfplays = number;
		
		
	}

	@Override
	public void print() {
		System.out.println("this is a videoGames.		Name: "+name+"	Price:"+price+"		PalyingTime:"+numberOfplays);
		super.print();
	}

}
