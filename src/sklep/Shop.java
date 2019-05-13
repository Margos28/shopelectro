package sklep;

import java.util.ArrayList;
import java.util.List;

public class Shop {
	private String name;
	private List<Phone> phones;
	private List<Tv> tvs;

	Shop(String name)
	{
		this.name =name;
		this.phones =new ArrayList<>();
		this.tvs = new ArrayList<>();
	}
	
	void addNewPhone(Phone phone) {
		phones.add(phone);
	}
	void addNewTv(Tv tv) {
		tvs.add(tv);
	}
	
	Phone getPhoneById(int id) {
		for(Phone phone:phones ) {
			if (phone.getId()==id) {
				return phone;
			}
		}
		System.out.println("nie znaleziono");
		return null;
	}
	Tv getTvById(int id) {
		for(Tv tv:tvs) {
			if (tv.getId()==id) {
				return tv;
			}
		}
		System.out.println("brak");
		return null;
	}
	
	}

