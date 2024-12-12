import java.util.*;

    
public class StepTracker{
    private int activeDays;
    private int days;
    private double steps;
    private int minSteps;
    
    public StepTracker(int min){
        minSteps = min;
    }
    
    public void addDailySteps(double steps){
        if (steps < minSteps){
            //System.out.println("Too few steps");
            days++;
            this.steps += steps;
        }
        else{
            activeDays++;
            days++;
            this.steps += steps;
        }
        
    }

    public int activeDays(){
        return activeDays;
    }
    
    public double averageSteps(){
        return steps/days;
    }
    
}

    