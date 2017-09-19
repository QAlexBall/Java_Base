/*
Author: QAlexBall
Date: 2017/9/06
Content: test super called parents class methond
 */
package unit08;

abstract class Report {
    void runReport() {
        System.out.println("i'm class Report!");
    }
}

public class BuzzwordsReport extends Report {
    void runReport() {
        super.runReport();// super can call the parents class method
        buzzwordCompliance();
    }
    private void buzzwordCompliance() {
        System.out.println("i'm buzzwotldCompliance in class BuzzwordsReport!");
    }


    public static void main(String [] args) {
        BuzzwordsReport a = new BuzzwordsReport();
        a.runReport();
    }
}
