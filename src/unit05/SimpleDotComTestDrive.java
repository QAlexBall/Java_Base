package unit05;

public class SimpleDotComTestDrive {
    public static void main(String []args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);


        int []locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while(isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("you took " + numOfGuesses + " guessees");
            }
        }
        /*
        dot.setLocationCells(locations);


        String userGuess = "2";
        String result = dot.checkYourself(userGuess);

        String testResult =  "failed";
        if (result.equals("hit")) {
            testResult = "passed";
        }

        System.out.println(testResult);
        */
    }
}
