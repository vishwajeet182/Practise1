package earlyBinding;

	 public class MobileDriver
	  {
		 public static void main(String[] args)
		 {
			Mobile M1=new Mobile("I-Phone", 6 ,256, "Golden");
			M1.displayMobile();
			System.out.println("This Is A Battery Inside A Mobile");
			M1.b1.displayBatery();
			
		}
	   }
