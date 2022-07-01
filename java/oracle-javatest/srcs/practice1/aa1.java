package practice1;

	public class aa1 {
		int lum=2;
		int iron=1;
		int steel=2;

		void shield(int a) {
			this.lum*=a;
			this.iron*=a;
			System.out.println("³ª¹« : "+this.lum+", Ã¶ : "+this.iron);
			System.out.println();
			this.lum=2;
			this.iron=1;
		}
		void Ssield(int steel) {
			shield(2*steel);
			this.steel*=steel;
			System.out.println("°­Ã¶ : "+this.steel);
			this.steel=2;
		}
		
		
		public static void main(String[] args) {
			aa1 a1=new aa1();
			a1.Ssield(3);

			a1.shield(2);
		}
	}

