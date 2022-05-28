package Java;

public class TwoDimension {

	public static void main(String[] args) {
		
		
		int i[][]=new int [3][5];
		
		i[0][0]=23;
		i[0][1]=44;
		i[0][2]=55;
		i[0][3]=35;
		i[0][4]=45;
		
		i[1][0]=77;
		i[1][1]=56;
		i[1][2]=34;
		i[1][3]=24;
		i[1][4]=22;
		
		i[2][0]=78;
		i[2][1]=98;
		i[2][2]=97;
		i[2][3]=456;
		i[2][4]=453;
		
		System.out.println(i.length);//gives row count
		System.out.println(i[0].length);//gives column count
		
		for(int row=0;row<i.length;row++) {
			for(int col=0;col<i[0].length;col++) {
				System.out.print(i[row][col] + "\t");
			}
			System.out.println();
			
		}
	
		
		
	
	}

}
