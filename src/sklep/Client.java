package sklep;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private int id;
	private String name;
	private String lastName;
	private List<Phone> boughtphones;
	private List<Tv> boughtTvs;
	private int totalamount;
	
	Client(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.boughtphones = new ArrayList<>();
		this.boughtTvs = new ArrayList<>();
		this.totalamount = 0;
	}
	
	void showDetails() {
		System.out.println(
				"Imię: " + this.name + " nazwisko: " + this.lastName + "\n kupione telefony: \n" + this.boughtphones + "\n kupione tv: \n"+ this.boughtTvs);
	}

	void buyPhone(Phone phone) {
		if (boughtphones.size() < 5) {
			boughtphones.add(phone);
		} else {
			System.out.println("nie można kupic więcej");
		}
	}
	void buyTv(Tv tv) {
		if (boughtTvs.size() < 5) {
			boughtTvs.add(tv);
		}else
			System.out.println("limit wyczerpany :( ");
	}
	void removePhone(Phone phone) {
			boughtphones.remove(phone);
		}
	void removeTv(Tv tv) {
		boughtTvs.remove(tv);
	}
	void getTotalAmount()
	{
		totalamount = 0;
		for(int i = 0; i < boughtTvs.size(); i++ ) {
			 boughtTvs.get(i).getPrice();	
		
		for(int j = 0; j < boughtphones.size(); j++)
		{
			boughtphones.get(j).getPrice();
			totalamount =  boughtTvs.get(i).getPrice()+boughtphones.get(j).getPrice() ;	
		}
		}
		
		System.out.println();
		System.out.println(this.totalamount);
		
		
	}
	
	
	}


