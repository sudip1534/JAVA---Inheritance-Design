
public class Surgeon extends Doctor {
	
	public boolean active;

	public Surgeon(String name, int number, String specialty, boolean active) {
		super(name, number, specialty);
		this.active = active;
	}

	@Override
	public String toString() {
		return   name + " " +  number + " " + specialty + "Operating: " + active ;
	}

	
	@Override
	public void work() {
		// TODO Auto-generated method stub
	
		if(active==true)
			System.out.println (name + " works for the hospital. "+ name + " is operating now.");
		else
			System.out.println (name + " works for the hospital. "+ name + " is not operating now.");
	}

	
		/*if(active==true)
			System.out.println ( name + " is operating now.");
		else
			System.out.println ( name + " is not operating now.");*/
	
	

}
