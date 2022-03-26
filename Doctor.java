
public class Doctor extends HospitalEmployee {
	
	public String specialty;

	public Doctor(String name, int number, String specialty) {
		super(name, number);
		// TODO Auto-generated constructor stub
		this.specialty=specialty;
	}

	
	@Override
	public String toString() {
		return   name + " " +  number + " " + specialty ;
	}


	@Override
	public void work() {
		// TODO Auto-generated method stub
		//super.work(); 
		System.out.println (name + " works for the hospital. "+name + " is a(n) "+ specialty + " doctor.");
	}

}
