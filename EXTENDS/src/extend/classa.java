package extend;

public class classa extends classes{									//watch��Ʒ
		
		private String name;						//����
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
