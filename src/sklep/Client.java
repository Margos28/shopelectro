package sklep;

import java.util.ArrayList;
import java.util.List;

public class Client {
	private int id;
	private String name;
	private String lastName;
	private List<Phone> boughtphones;
	private List<Tv> boughtTvs;

	Client(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.boughtphones = new ArrayList<>();
		this.boughtTvs = new ArrayList<>();
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
	void removePhone(int phone) {
			boughtphones.remove(phone);
		}
	}
}
