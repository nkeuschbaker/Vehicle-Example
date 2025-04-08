class Main{
	public static void main(String[] args) {
   		Vehicle v = new Vehicle();
        v.honk();
      Car myFastCar = new Car("Mustang");
      myFastCar.honk();
      System.out.println(myFastCar.brand + " " + myFastCar.modelName);
      Car otherCar = new Car("F150");
      System.out.println("My other car is a " + otherCar.modelName);
      Train train = new Train("1");
      System.out.println(train.line);
      train.choo();
  }
}

class Vehicle { // super class
  public String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle { // sub class
  public String modelName;
  
  public Car(String modelName){
  	this.modelName = modelName;
  }
  
}

class Train extends Vehicle{
	public String line;
    public Train(String line){
    	this.line = line;
    }
    public void choo(){
    	System.out.println("Choo Choo!!");
    }
}

