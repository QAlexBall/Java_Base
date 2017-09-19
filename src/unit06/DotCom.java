package unit06;

import java.util.ArrayList;

public class DotCom {
    private  String name;
    private  ArrayList<String> locationCells;

    public void setName(String name) {
        this.name = name;
    }

    public void setLocationCells(ArrayList<String> locationCells) {
        this.locationCells = locationCells;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);

            if (locationCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch! You sunk " +name+ "  : (");
            } else {
                result = "hit";
            }// close if
        }// close if
        return result;
    }// close method
}// close class
