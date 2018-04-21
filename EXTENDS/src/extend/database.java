package extend;

import java.util.ArrayList;

public class database {
	
		private ArrayList<classes> c = new ArrayList<classes>();
		
		public void add(classes CLASS) {
			c.add(CLASS);
		}
		
		public void list() {
			for (classes CLASS : c ) {
				CLASS.print();
			}
		}
//-----------------------------------------------------------------------------------------
	public static void main(String[] args) {
		
			database db = new database();
			db.add( new classb( "ANTA" , 998 )  );
			db.add( new classa( "CASIO" , 1000 )  );

			db.list();
		
		
		
	}

}
