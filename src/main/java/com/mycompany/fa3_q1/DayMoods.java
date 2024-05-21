package com.mycompany.fa3_q1;
import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author Tertius
 */
public class DayMoods {
    // Enum Class
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }
    
    // Secondary class
    public class enumDayMood {
        public static Component frame;
        public static void telDayMood (Day day){
            switch (day) {
                case MONDAY:
                    JOptionPane.showMessageDialog (frame, "Mondays are bad.");
                break;
                case FRIDAY:
                    JOptionPane.showMessageDialog (frame, "Fridays are better.");
                break;
                case SATURDAY: case SUNDAY:
                    JOptionPane.showMessageDialog (frame, "Weekends are best.");
                break;
                default:
                    JOptionPane.showMessageDialog (frame, "Midweek days are so-so.");
                break;
                }
        }
    }
    
    // Main program method
    public static void main (String[] args){
        int option = Integer.parseInt(JOptionPane.showInputDialog("Please enter the day of the week:\n1. Monday"
                + "\n2. Teusday\n3. Wednesday\n4. Thursday\n5. Friday\n6. Saturday\n7. Sunday"));
        
        Day myVar = null;
            
        // Check day
        if(option == 1){
            myVar = Day.MONDAY;
        }
        else if(option == 2){
            myVar = Day.TUESDAY;    
        }
        else if(option == 3){
            myVar = Day.WEDNESDAY;    
        }
        else if(option == 4){
            myVar = Day.THURSDAY;    
        }
        else if(option == 5){
            myVar = Day.FRIDAY;    
        }
        else if(option == 6){
            myVar = Day.SATURDAY;    
        }
        else if(option == 7){
            myVar = Day.SUNDAY;
        }
        else{
            System.exit(0);
        }
        
        // Print out result
        enumDayMood.telDayMood(myVar);
    }
}
