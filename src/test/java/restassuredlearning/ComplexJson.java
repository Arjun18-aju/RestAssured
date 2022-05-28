package restassuredlearning;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;
import restfiles.PayLoad;

public class ComplexJson {

	@Test
	public void testingComplex() throws IOException {
		

		JsonPath path=new JsonPath(PayLoad.dummyApi());

		int size=path.getInt("courses.size()");
		System.out.println("course count is= "+size);

		//2nd task

		int amount=path.getInt("dashboard.purchaseAmount");
		System.out.println("the purchase amount is= "+amount);

		//3rd task

		String title1=path.get("courses.title[0]");
		System.out.println("the title of first course is= "+ title1);

		//4th task
		for(int i=0;i<size;i++) {

			String coursesTitle=path.get("courses.title["+i+"]");
			int priceofCourses=path.getInt("courses.price["+i+"]");
			System.out.println("The course title= "+coursesTitle +" price of this course = "+priceofCourses);

		}

		//5th task
		for(int j=0;j<size;j++) {
			String co=path.get("courses.title["+j+"]");
			if(co.equalsIgnoreCase("cypress")) {
				int copie=path.getInt("courses.copies["+j+"]");
				System.out.println(co+" copies= "+copie);
				break;
			}


		}

		//6th task
		int multi = 0;
		int sum=0;
		for(int k=0;k<size;k++){

			int price=path.getInt("courses.price["+k+"]");
			int copies=path.getInt("courses.copies["+k+"]");

			multi=price * copies;
			// System.out.println(multi);
			sum=sum+multi;
			// System.out.println(sum);
		}


		int total=path.get("dashboard.purchaseAmount");

		Assert.assertEquals(sum, total);
	}

}
