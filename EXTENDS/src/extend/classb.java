package extend;

public class classb extends classes {						//beg商品 
			
		private String name;					//包名
		private int price;							//价格
			
		public classb(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		public void print() {						//包的print函数
				System.out.println("this is a beg. Name:"+name+"Price:"+price);
		}
}
