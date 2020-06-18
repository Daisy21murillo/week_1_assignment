//Daisy Murillo
//Wednesday June 17, 2020 

package week1assignment;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// item price 
		double cellphone = 120.99;
		double laptop = 340.56;	
		
		// amount of money in wallet 
		double checking = 1000.34; 
		
		// number of friends 
		int friends = 4; 
		
		//age in years
		int age = 20; 
		
		//first name 
		String firstName = "Daisy";
		
		//last name 
		String lastName = "Murillo";
		
		//middle initial -- dont have therefore it's empty
		String middleI = " ";
		
		
		//New amount of money in wallet after buying the item
		double newAmount = checking - cellphone - laptop;
		System.out.println("After buy my cellphone, my wallet went down to $" + newAmount);
		
		//Number of friends you’ve made each year
		int numOfFriends = age * friends;
		System.out.println("Each year I make " + friends + " friends. Now, that I'm 20 years old, I've made " + numOfFriends + " friends in my lifetime!");
		
		//Full Name 
		String fullName = firstName + middleI + lastName; 
		System.out.println("Hi there! My name is " + fullName);

	}

}
