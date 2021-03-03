package expectedPrograms.logics;

public interface Sim {
	void dial();

}

class Airtel implements Sim {
	public void dial() {
		System.out.println("dialing from Airtel");
	}
}

class VodaFone implements Sim {
	public void dial() {
		System.out.println("dialing from vodafone");
	}
}

class SimFactory {

	static Sim getInstance() {
		java.util.Scanner scn = new java.util.Scanner(System.in);
		System.out.println("enter Sim");
		String SimName = scn.next();
		Sim s = null;
		if (SimName.equalsIgnoreCase("Airtel")) {
			s = new Airtel();
		}
		if (SimName.equalsIgnoreCase("VodaFone")) {
			s = new VodaFone();
		}
		return s;
	}
}

class Phone {
	Sim s;

	Phone() {
		s = SimFactory.getInstance();

	}

	void dial() {
		s.dial();
	}
}

