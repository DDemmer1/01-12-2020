package de.demmer.dennis;

public class Application {
	public static void main(String[] args) {
		
		Hund bello = new Hund(-55, "braun");
		bello.setRasse("Labrador");
		
		Hund wuffi = new Hund("Pekinese", 4 , "weiﬂ");
		
		Hund klausi = new Hund();
		klausi.setRasse("Pudel");
		klausi.setAge(4);
		klausi.setFellfarbe("weiﬂ");
		

		String fell1 = wuffi.getFellfarbe();
		String fell2 = klausi.getFellfarbe();
		
		if(fell1.equals(fell2)) {
			System.out.println("Die Fellfarbe ist gleich!");
		} else {
			System.out.println("Die Fellfarbe ist nicht gleich!");
		}
				
		
		String msg = wuffi.getFellfarbe() == klausi.getFellfarbe() ? "Die Fellfarbe ist gleich!" : "Die Fellfarbe ist nicht gleich!";
		System.out.println(msg);
		
		
		switch(klausi.getRasse()) {
		case "Pudel": 
			System.out.println("wuff...");
			break;
		case "Labrador":
			System.out.println("Wuff!");
			break;
		case "Pekinese":
			System.out.println("...wuf...");
			break;
		default: System.out.println("Wuff");
			break;
		}
		
		
		String s1 = "test";
		String s2 = "test";
		System.out.println(s1.equals(s2));
		
		System.out.println(klausi.equals(wuffi));
		
		
		
		
		
		
		
		
		
		

	}
}
