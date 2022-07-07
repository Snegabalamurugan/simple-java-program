class vehicle{
protected String brand = ("ford");
public void honk(){
System.out.println("pip,pip");
}
}
class Car extends vehicle{
private String modelname = ("mustang");
public static void main(String[] args){
Car myCar = new Car ();
myCar.honk();
System.out.println(myCar.brand + " " + myCar.modelname);
}
}