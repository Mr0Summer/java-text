package extend;

public class classb extends classes {						//beg��Ʒ 
			
		private String name;					//����
		private int price;							//�۸�
			
		public classb(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		public void print() {						//����print����
				System.out.println("this is a beg. Name:"+name+"Price:"+price);
		}
}