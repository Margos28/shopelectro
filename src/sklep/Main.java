package sklep;

public class Main {

	public static void main(String[] args) {
		System.out.println("Witamy w nszym Sklepie ELEKTRO posiadamy poniżsy asortymanet");
		
		Phone[] mobilePhones = createPhones();

		showPhoneDetails(mobilePhones);

		Tv[] tvs = createTvs();

		showTvs(tvs);
		Client klient1 = new Client(1, "Jan", "Kowalski");
		Client klient2 = new Client(2, "Marek", "Chrzan");
		
		Shop elektro = new Shop("elektro");
		
		elektro.addNewPhone(mobilePhones[0]);
		elektro.addNewPhone(mobilePhones[1]);
		elektro.addNewPhone(mobilePhones[2]);
		elektro.addNewPhone(mobilePhones[3]);
		elektro.addNewPhone(mobilePhones[4]);
		elektro.addNewTv(tvs[0]);
		elektro.addNewTv(tvs[1]);
		elektro.addNewTv(tvs[2]);
		elektro.addNewTv(tvs[3]);
		elektro.addNewTv(tvs[4]);
		elektro.addNewTv(tvs[5]);
		System.out.println("-----------------------------");
		
//		Phone newSamsung = elektro.getPhoneById(2);
//		if(newSamsung != null) {
//			newSamsung.showDetails();
//		}
//		Tv newTv = elektro.getTvById(2);
//		if(newTv != null)
//		{
//			newTv.showDetails();
//		}
//		elektro.getPhoneById(1);
//		elektro.getPhoneById(2);
//		elektro.getPhoneById(3);
//		elektro.getPhoneById(4);
//		elektro.getPhoneById(5);
//		elektro.getTvById(1);
//		elektro.getTvById(2);
//		elektro.getTvById(3);
//		elektro.getTvById(4);
//		elektro.getTvById(5);
		
		System.out.println("-----------------------------");
		klient1.buyPhone(elektro.getPhoneById(2));
		klient1.buyTv(elektro.getTvById(3));
		klient2.buyPhone(elektro.getPhoneById(3));
		klient1.buyTv(elektro.getTvById(2));
		klient2.buyTv(elektro.getTvById(2));
		klient2.buyTv(elektro.getTvById(6));
		klient2.buyPhone(elektro.getPhoneById(2));
		klient2.removePhone(elektro.getPhoneById(3));
		klient1.removeTv(elektro.getTvById(3));
		klient1.buyPhone(elektro.getPhoneById(1));
		klient2.buyPhone(elektro.getPhoneById(1));
		
		
		klient1.showDetails();
		System.out.println("++++++++------++++++");
		klient2.showDetails();
		klient2.getTotalAmount();
		klient1.getTotalAmount();
		
		
	}	


	private static Tv[] createTvs() {
		Tv rubin = new Tv(1, "Rubin", "ultra", 82, 2000);
		Tv grundig = new Tv(2, "Grundig", "mega", 65, 6500);
		Tv toshiba = new Tv(3, "toshiba", "mini", 15, 3000);
		Tv lg = new Tv(4, "LG", "medium", 32, 4200);
		Tv philips = new Tv(5, "philips", "max", 39, 1500);
		Tv medion = new Tv(6, "medion"," maximus ",75, 8520);
		Tv[] tvs = { rubin, grundig, lg, philips, toshiba, medion };
		return tvs;
	}

	private static Phone[] createPhones() {
		Phone nokia = new Phone(1, "Nokia", "625", 2, 310);
		Phone samsung = new Phone(2, "Samsung", "Galaxy mini 2", 1, 550);
		Phone xiaomi = new Phone(3, "Xiaomi", "mi9", 5, 650);
		Phone apple = new Phone(4, "Apple", "Iphone 8", 12, 1000);
		Phone sony = new Phone(5, "Sony", "Xperia2", 3, 800);

		Phone[] mobilePhones = { nokia, samsung, xiaomi, sony, apple };
		return mobilePhones;
	}
	
	
	private static void showPhoneDetails(Phone[] mobilePhones) {
		// Arrays.stream(mobilePhones).forEach(p -> p.showDetails());
		System.out.println("------ MOBILE PHONES ------");
		for (Phone phone : mobilePhones) {
			phone.showDetails();
		}
	}

	private static void showTvs(Tv[] tvs) {
		System.out.println("------ TVs------");
		for (Tv tv : tvs) {
			tv.showDetails();
		}
	}
	
}
