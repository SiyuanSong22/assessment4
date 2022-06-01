import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import assessment4.Food;

class TestClassFood1 {

	@Test
	void testAddFood_testCase1() //test1
	{
		Food foodtestCase1Data1 = new Food ("2abce", "banana", "yellow and sweet very delicious",10, 500,"kids food");
		//assertEquals ("the food information has been added",foodtestCase1Data1.AddFood())
		Food foodtestCase1Data2 = new Food ("2abce", "banana abac", "yellow and sweet very delicious",16, 500,"kids food");
		//assertEquals ("the food information has been added",foodtestCase1Data2.AddFood())
		Food foodtestCase1Data3 = new Food ("2abce", "banana ccdd", "yellow and sweet very delicious",16, 700,"kids food");
		//assertEquals ("the food information has been added",foodtestCase1Data3.AddFood())
		assertAll ("",()->assertEquals("food information can be added",foodtestCase1Data1.AddFood()),
				()->assertEquals("food information can be added",foodtestCase1Data2.AddFood()),
				()->assertEquals("food information can be added",foodtestCase1Data3.AddFood()));
				
	}
	
	@Test
	void testAddFood_testCase2() //test2
	{
		Food foodtestCase2Data1 = new Food ("2abce", "banana", "yellow and sweet ",100, 1000,"healthy food");
		//assertEquals ("the food information cannot be added",foodtestCase2Data1.AddFood())
		Food foodtestCase2Data2 = new Food ("2abc", "apple", "red and sweet and juicey",16, 500,"kids food");
		//assertEquals ("the food information cannot be added",foodtestCase2Data2.AddFood())
		Food foodtestCase2Data3 = new Food ("2abce", "orange", "big enough and juicy and no stone inside",16, 700,"kids food");
		//assertEquals ("the food information has been added",foodtestCase2Data3.AddFood())
		
		assertAll ("",()->assertEquals("The food information cannot be added",foodtestCase2Data1.AddFood()),
				()->assertEquals("The food information cannot be added",foodtestCase2Data2.AddFood()),
				()->assertEquals("food information can be added",foodtestCase2Data3.AddFood()));

	}
}