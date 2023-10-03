
public class Dog {
     String name;
     String bred;
     double weight;

    public void sayHello(){
        System.out.println("bark bark");
    }
    public static void main(String[] args) {
         Dog firstDog = new Dog();
         firstDog.bred = "breed 1";
         firstDog.name = "mona";
         firstDog.weight = 3.5 ;
         firstDog.sayHello();

         Dog secondDog = new Dog();
         secondDog.sayHello();
         Cat coco = new Cat();
         coco.sumTwoValues(6 , 7);
         coco.subTwoValues( 9,7);
         coco.sayHello();
         coco.sayMeow();
        System.out.println( coco.sumTwoValues(6 , 7));
        System.out.println(coco.subTwoValues(9,7));

    }
}