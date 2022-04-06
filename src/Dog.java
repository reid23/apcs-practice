public class Dog extends Animal{
    public Dog(int age, double height){
        super(age, 4, height);
    }
    public void bark(){
        System.out.println("woof");
    }
    @Override
    public void setLegs(int legs){
        if(legs<=4){
            super.setLegs(legs);
        }
    }
}
