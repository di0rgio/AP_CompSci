/* 
    Lecture note example - Classes
*/
package pkg;

public class Car{
    String model;
    double maxSpeed;
    boolean isElectric;
    String color;

public Car(){
    model = "Bus";
    maxSpeed = 1.1;
    isElectric = false;
    color = "Blue & Red";
}

public Car(String m, double s, String c){
    model = m;
    maxSpeed = s;
    isElectric = false;
    color = c;
}

public void vroom(){
    int count = 0;
    while(count<maxSpeed){
        System.out.print(model + " goes VROOOOOM ");
        count = count + 10;
    }
}

}