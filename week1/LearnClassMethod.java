package week1day1.assignment;

public class LearnClassMethod {
		String myMobile = " Mobile Phone";
		float size; 
		String shape;
		String IMEI;
		char brandName;
		int resolution;
		byte weight;
		boolean isTouchScreen;
		int costMobile;

				public void makeCalls() {
			System.out.println(" Making calls");
		}

		public void viewGallery() {
			System.out.println(" Vieiwing the gallery");
		}

		public void payBills() {
			System.out.println(" Paying Bills");
		}

		public static void main(String[] args) {

			
//Samsung Brand
			LearnClassMethod  samsung= new LearnClassMethod();
			samsung.brandName = 'S';
			samsung.costMobile = 50000;
			samsung.makeCalls();
			samsung.viewGallery();
			System.out.println(" samsung Brand:" + samsung.brandName);
			System.out.println(" samsung Csot:" + samsung.costMobile);

	//Apple BrandS
			LearnClassMethod apple = new LearnClassMethod();
			apple.brandName = 'A';
			apple.costMobile = 55000;
			apple.makeCalls();
			apple.viewGallery();
			System.out.println(" Apple Brand:" + apple.brandName);
			System.out.println(" Apple Csot:" + apple.costMobile);

		}

	}


