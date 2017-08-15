package unit5;

public class SimpleDotCom {
    private int [] locationCells;
    private int numOfHits = 0;

    public void setLocationCells(int[] locationCells) {
        this.locationCells = locationCells;
    }
    public String checkYourself(String strinGuess) {
        int guess = Integer.parseInt(strinGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }// out of the loop
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
