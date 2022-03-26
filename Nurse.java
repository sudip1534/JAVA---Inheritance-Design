
public class Nurse extends HospitalEmployee{
	
	public int numOfPatients;

	public Nurse(String name, int number, int numOfPatients) {
		super(name, number);
		// TODO Auto-generated constructor stub
		this.numOfPatients=numOfPatients;
	}

	@Override
	public String toString() {
		return   name + " " +  number + " has " + numOfPatients + " patients" ;
	}

	@Override
	public void work() {
		// TODO Auto-generated method stub
		 System.out.println (name + " works for the hospital. "+ name + " is a nurse with "+ numOfPatients + " patients.");
	}


}
