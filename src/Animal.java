public class Animal {
    private int age;
    private int legs;
    private double height;

    public Animal(int age, int legs, double height){
        this.age = age;
        this.legs = legs;
        this.height = height;
    }
    public int getAge(){
        return this.age;
    }
    public int getLegs(){
        return this.legs;
    }
    public double getHeight(){
        return this.height;
    }
    public void setAge(int newAge){
        this.age = newAge;
    }
    public void setLegs(int legs){
        this.legs = legs;
    }
    public void setHeight(double height){
        this.height = height;
    }
}

