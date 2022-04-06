// import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        StepTracker S = new StepTracker(10000);
        System.out.println(S.activeDays());
        System.out.println(S.averageSteps());
        S.addDailySteps(9000);
        S.addDailySteps(5000);
        System.out.println(S.activeDays());
        System.out.println(S.averageSteps());
        S.addDailySteps(13000);
        System.out.println(S.activeDays());
        System.out.println(S.averageSteps());
        S.addDailySteps(23000);
        S.addDailySteps(1111);
        System.out.println(S.activeDays());
        System.out.println(S.averageSteps());

//        dog dash = new dog("penny", 10, 4);
//        dash.bark();
//        int i = 0;
//        do{
//            System.out.println("here");
//            i++;
//        }while(i<5);
//
//        System.out.println("here");
//        Animal a = new Animal(5, 10, 20);  // (int)(expr)
//        System.out.println(a.getAge());
//        a.setAge(10);
//        System.out.println(a.getAge());
//
//        Dog d = new Dog(4, 3.2);
//        System.out.println(d.getLegs());
//        d.setLegs(5);
//        System.out.println(d.getLegs());
//
//
//
//
//        //shapes
//        Shrinkable s = new Decagon();
//        System.out.println(s.divineArea()); //doesn't work bc not all Shrinkable classes implement divineArea, only Shapes
//        s.shrink(5);
//        System.out.println(s);
    }
}
// class dog {
//     String name;
//     int age;
//     int legs;
//     public dog(String name, int age, int legs){
//         this.name = name;
//         this.age = age;
//         this.legs = legs;
//     }
//     public void bark(){
//         System.out.println("woof, I'm " + this.name);
//     }
// }

