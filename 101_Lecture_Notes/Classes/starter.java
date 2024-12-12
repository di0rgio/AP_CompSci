/* 
    Lecture note example - Classes
*/
import pkg.*;
import java.util.*;

class starter{
    public static void main(String args[]) {
        Car mobile = new Car();
        Car batmobile = new Car("Lambo", 525, "Black");
        mobile.vroom();
        batmobile.vroom();
    }
}