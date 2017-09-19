/*
Author: QAlexBall
Date: 2017/8/27
Contents: create an general animal list "MyAnimalList" and test
 */
package unit08;
class MyAnimalList {
    private Animal[] animals = new Animal[5];// save the animals array object
    private int nextIndex = 0;
    public void add(Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal added at " + nextIndex + "  " + a);
            nextIndex++;
        }//close if
    }//close ass
}
abstract class Animal {
}

class Dog extends Animal {
}

class Cat extends Animal {
}

public class AnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList list = new MyAnimalList();
        Dog a = new Dog();
        Cat c = new Cat();
        Animal d = new Dog();
        list.add(a);
        list.add(c);
        list.add(d);
        Object o = new Object();
        System.out.println(a.getClass() + " " + a.hashCode() + " " + a.toString());
        System.out.println(o.getClass() + " " + o.hashCode() + " " + o.toString());
    }
}
