package extend;

public class classb extends classes {						//beg��Ʒ 

		public classb(String name, int price) {
			super(name, price);
		}
		@Override
		public void print() {						//����print����
				System.out.println("this is a beg.				Name:"+name+"	Price:"+price);
				super.print();
		}
}
