
    // abstract class
    abstract class Animal8 {
        // abstract method (no body)
        abstract void sound();

        // normal method
        void sleep() {
            System.out.println("This animal is sleeping");
        }
    }

    // child class Dog
    class Dog8 extends Animal8 {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    // child class Cat
    class Cat extends Animal8 {
        @Override
        void sound() {
            System.out.println("Cat meows");
        }
    }

    public class AbstarctPro {
        public static void main(String[] args) {
            Animal a;

            a = new Dog();
            a.sound();   // Output: Dog barks
           // a.sleep();   // Output: This animal is sleeping

            a = new Animal();
            a.sound();   // Output: Cat meows
        }
    }

