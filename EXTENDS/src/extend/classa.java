package extend;

public class classa extends classes{									//watch商品
		
		public classa(String name, int price) {
			super(name, price);
		}

		@Override
		public void print() {							//表的print函数
			System.out.println("this is a watch.				Name:"+name+"	Price:"+price);
			super.print();
		}
}
