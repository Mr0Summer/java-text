package extend;

public class classb extends classes {						//beg商品 

		public classb(String name, int price) {
			super(name, price);
		}
		@Override
		public void print() {						//包的print函数
				System.out.println("this is a beg.				Name:"+name+"	Price:"+price);
				super.print();
		}
}
