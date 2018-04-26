package castle;

import java.util.Scanner;

public class game {
		
	public Room currentRoom;
		
		private void createRooms() {
			Room outside,main,Aca,Lir,Lab,citong,ccan,fcan,fh;							//初始化房间
			
			fh = new Room("Fenghuang Dormitory");
			fcan = new Room("Fenghuang Restaurant");
			ccan = new Room("Citong Retaurant");
			citong = new Room("Citong Dormitory");
			Lab = new Room("Laboratory Building");
			Lir = new Room("Library");
			Aca= new Room("Academic Building");
			outside = new Room("outside");	
			main = new Room("Main Building");  				//定义房间
			
			outside.setExit("north", main);
			main.setExit("south", outside);
			main.setExit("west", Aca);
			main.setExit("northwest", Lir);
			Aca.setExit("east", main);
			Aca.setExit("northwest", Lab);
			Aca.setExit("northeast", Lir);
			Lir.setExit("southwest", Aca);
			Lir.setExit("west", Lab);
			Lir.setExit("southeast", main);
			Lir.setExit("north", citong);	
			Lir.setExit("northeast", fcan);
			Lab.setExit("east", Lir);
			Lab.setExit("southeast", Aca);
			citong.setExit("sourth", Lir);
			citong.setExit("west", ccan);
			citong.setExit("east", fcan);
			citong.setExit("northeast", fh);
			ccan.setExit("east", citong);
			fh.setExit("southwest", fcan);
			fh.setExit("sourhtwest", citong);
			fcan.setExit("northeast", fh);
			
			
			currentRoom = outside;
		}
	
		private void printWelcome() {
			System.out.println();
			System.out.println("Welcome to HuaQiao University !");
			System.out.println("This is a very stupid guide");
			System.out.println("If you need help,please entry : 'help'");
			System.out.println();
			showPrompt();
		}
	
		private void printHelp() {
			System.out.println("Are you lost ?  You can do something like this : go  bye  help.");
			System.out.println("Example:\tgo east");
			}
		
		private void goRoom(String direction) {
			Room nextRoom = currentRoom.getExit(direction);
			if (nextRoom == null) {
				System.out.println("Sorry,there is no way to go.");
			}
			else {
				currentRoom = nextRoom;
				showPrompt();
			}
		}
				
		private void showPrompt() {
				System.out.println("You are "+ currentRoom+" now!");
				System.out.print("Exit: ");
				System.out.print(currentRoom.getExitdesc());
				System.out.println( );
		}
			
		
	public static void main(String[] args) {
			Scanner in = new Scanner(System.in);
			game game = new game();
			game.createRooms();
			game.printWelcome();
			
			while( true ) {
				String line = in.nextLine();
				String[] words = line.split(" ");
				
				if (words[0].equals("help")) {
					game.printHelp();
					
				}else if (words[0].equals("go")) {
					game.goRoom(words[1]);
				
				}else if(words[0].equals("bye")) {
					 break;
				}
			}
			
			System.out.println("pleasure of you visit !");
			in.close();
	}

}
