package extend;

public class classa extends classes{									//watch商品
		
		private String name;						//表名
		public classa(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		private int price;
		
		public void print() {
			System.out.println("this is a watch. Name:"+name+"Price:"+price);
		}
}
