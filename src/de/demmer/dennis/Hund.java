package de.demmer.dennis;

public class Hund {
	
	private String rasse;

	private int age;
	
	private String fellfarbe;
	
	
	public Hund(int age, String fellfarbe) {
		setAge(age);
		this.fellfarbe = fellfarbe;
	}
	
	
	public Hund(String rasse, int age, String fellfarbe) {
		this.rasse = rasse;
		setAge(age);
		this.fellfarbe = fellfarbe;
	}
	
	public Hund() {
		
	}


	public String getRasse() {
		return rasse;
	}

	public void setRasse(String rasse) {
		this.rasse = rasse;
	}

	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			this.age = 0;
		} else {
			this.age = age;
		}
	}

	public String getFellfarbe() {
		return fellfarbe;
	}

	public void setFellfarbe(String fellfarbe) {
		this.fellfarbe = fellfarbe;
	}
	
	
	
	public boolean equals(Hund andererHund) {
		return this.age == andererHund.getAge();
	}
	

	
	
	
	
	
	
	
	
	

}
