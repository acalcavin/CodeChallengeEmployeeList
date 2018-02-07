package CodeChallengeDay11;

public class Employee {

	String name;
	int age;
	String favoriteFood;
	
	Employee(String n, int a, String ff){
		this.name = n;
		this.age = a;
		this.favoriteFood = ff;
	}
	
	Employee(){	
	}
	
	//begin getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getFavoriteFood() {
		return favoriteFood;
	}
	public void setFavoriteFood(String favoriteFood) {
		this.favoriteFood = favoriteFood;
	}
	//end getters and setters
	
	public String toString() {
		return String.format("%s, %d, %s", this.name, this.age, this.favoriteFood);
	}
	
}