package Java;

public class Methods {

public static void main(String[] args) {
		
		Methods s=new Methods();
	int f=	s.test1();
	System.out.println(f);
	int o=	s.test2(2, 2);
		
		System.out.println(o);
		
		

	}

	public int test1() {
		
		System.out.println("I'm Test 1");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;
	}
	
	
	
	public int test2(int a , int b) {
		
		System.out.println("I'm Test 2");
		int c=a/b;
		return c;
		
	}
	
	
	
	
	
}
