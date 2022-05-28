package restassuredlearning;

import org.apache.commons.lang3.RandomStringUtils;

public class Utils {

	
		public static String FirstName() {
			
			String str=new RandomStringUtils().randomAlphabetic(2);
			
			return ("arjun" + str);
		}
			
			public static String job() {
				
				String str=new RandomStringUtils().randomAlphabetic(5);
				
				return ("Auto" + str);
			
			
			
		}
	

}
