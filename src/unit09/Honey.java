package unit09;
/*
Author: QAlexBall
Date: 2017/9/06
Content: test super called parents class methond
 */
class Bees {
    Honey [] beeHA;
}

class Raccoon {
    Kit k;
    Honey rh;
}

class Kit {
    Honey kh;
}

class Bear {
    Honey hunny;
}

public class Honey {
    public static void main(String [] args) {
        Honey honeypot = new Honey();
        Honey [] ha = {honeypot, honeypot, honeypot, honeypot};
        Bees b1 = new Bees();
        b1.beeHA = ha;
        Bear [] ba = new Bear[5];
        for (int x=0; x < 5; x++) {
            ba[x] = new Bear();
            ba[x].hunny = honeypot;
        }// close for
        Kit k = new Kit();
        k.kh = honeypot;
        Raccoon r = new Raccoon();

        r.rh = honeypot;
        r.k = k;
        k = null;

    }// close main
}
