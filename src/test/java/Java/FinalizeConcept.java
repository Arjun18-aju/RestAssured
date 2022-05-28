package Java;

public class FinalizeConcept {
	
	
	public void finalize() {
		
		System.out.println("Im finalize");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FinalizeConcept con=new FinalizeConcept();
	
		con=null;
		System.gc();

	}

}
