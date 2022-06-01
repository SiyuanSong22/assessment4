package assessment4;

import java.util.StringTokenizer;

public class Food {
	private static final char[] AddFood = null;

	public static void main(String[] args) {
		System.out.println(AddFood);//main statement to run the java

	}
	 private String foodID;
     private String foodName;
     private String foodDescription;
     private double foodPrice;
     private int foodCalorie;
     private String foodType;//all the things we need
     
     public Food (String ID, String Name, String Description, double Price, int Calorie, String Type)
     {
    	 foodID=ID;
    	 foodName=Name;
    	 foodDescription=Description;
    	 foodPrice=Price;
    	 foodCalorie=Calorie;
    	 foodType=Type;
     }
     public String AddFood ()
     {
    	 if(foodID.length()!=5 || Character.isDigit(foodID.charAt(0))==false)
    	 {
    		 return "The food information cannot be added";
    	 }
         int countcharactorN= countcharactorfoodName (foodName);	 
         if (countcharactorN <5 || countcharactorN>30)//Food name should be between 5 and 30 characters
         {
    	     return "The food information cannot be added";
         }
         int countWordD= countWordsfoodDescription (foodDescription);	 
         if (countWordD <5 || countWordD>50)//Food description should be between 5 and 50 words
         {
        	 return "The food information cannot be added";
         }
         if ((foodType !="kids food"&&(foodCalorie >= 0 && foodCalorie<=800))||(foodType !="Healthy food"&&(foodCalorie > 800 && foodCalorie<=1000))||(foodType !="Elderly food"&&(foodCalorie > 1000 && foodCalorie<=1500)))
         {
        	 return "The food information cannot be added";//It should not be possible to add foods with more than 1500 calorie If the type of food is ¡°Kid Food¡±, their calorie should be less than 800.
         }

         if ((foodPrice <= 5 && foodPrice >= 150) ||(foodCalorie>1000 && foodPrice < 100)) //The price of each food should be between $5 and $150,The price of foods with more than 1000 calories should be less than $100.
         {
        	 return "The food information cannot be added";
         }
         return "food information can be added";
     }
	private int countWordsfoodDescription(String foodDescription) 
	{
		StringTokenizer stringTokenizer1 = new StringTokenizer(foodDescription);
		return stringTokenizer1.countTokens();
	}
	private int countcharactorfoodName(String foodName)
	{
		StringTokenizer stringTokenizer2 = new StringTokenizer(foodName);
		return stringTokenizer2.countTokens();//to run the count number 
	}
}
