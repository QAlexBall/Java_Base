/*
Author: QAlexBall
Date: 2017/9/06
Content: test super called parents class methond
 */
package unit09;

public class Duck {
    int pounds = 6;
    float floatabbility = 2.1F;
    String name= "Generic";
    long[] feathers = {1, 2, 3, 4, 5, 6, 7};
    boolean canFly = true;
    int maxSpeed = 25;

    // Constructor overload
    public Duck(float density, int weight) {
        floatabbility = density;
        maxSpeed = weight;
        System.out.println("type 5 duck");
    }

    public Duck() {
        System.out.println("type 1 duck");
    }

    public Duck(boolean Fly) {
        canFly = Fly;
        System.out.println("type 2 duck");
    }

    public Duck(int airspeed, float density) {
        pounds = airspeed;
        floatabbility = density;
        System.out.println("type 4 duck");
    }

    public Duck(String name, long[] feathers) {
        this.name = name;
        this.feathers = feathers;
        System.out.println("type 3 duck");
    }

}// close Duck