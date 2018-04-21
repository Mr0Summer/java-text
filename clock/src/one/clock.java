package one;

public class clock {

	public Display hour = new Display(24);
	public Display minute = new Display(60);
	
	public void start() {
		while(true) {
		minute.Increase();
		if (minute.Getvalue()==0){
			hour.Increase();
		}
		System.out.printf("%02d:%02d\n",hour.Getvalue(),minute.Getvalue());
		}}
	
	public static void main(String[] args) {
		clock c = new clock();
		c.start();

	}

}
