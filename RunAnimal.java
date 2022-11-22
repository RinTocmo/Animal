import java.util.Scanner;
public class RunAnimal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Choose an animal. Press B for Bird, C for Car, or D for Dog: ");
        String choose = sc.nextLine();
        
        if (choose.equalsIgnoreCase("B")) {
            Bird b1 = new Bird();
            
            b1.eat();
            b1.sleep();
            b1.makeSound();
            
        }
        if (choose.equalsIgnoreCase("C")) {
            Cat c1 = new Cat();
            
            c1.eat();
            c1.sleep();
            c1.makeSound();
            
        }
        if (choose.equalsIgnoreCase("D")) {
            Dog d1 = new Dog();
            
            d1.eat();
            d1.sleep();
            d1.makeSound();
        }
        else {
            System.out.println("Invalid Input");
        }
        sc.close();
    
    }
    
}
