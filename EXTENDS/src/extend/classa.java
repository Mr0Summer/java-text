package extend;

public class classa extends classes{									//watch��Ʒ
		
		public classa(String name, int price) {
			super(name, price);
		}

		@Override
		public void print() {							//���print����
			System.out.println("this is a watch.				Name:"+name+"	Price:"+price);
			super.print();
		}
}
