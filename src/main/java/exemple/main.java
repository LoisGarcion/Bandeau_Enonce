package exemple;

import bandeau.Bandeau;

public class main {

    public static void main(String[] args) {
        Bandeau bandeau = new Bandeau();
        bandeau.setMessage("mon coeur");
        Scenario scenario = new Scenario(bandeau);
        scenario.resetBandeau();
        scenario.ajouterAnim(new textQuiDefile(),3);
        scenario.ajouterAnim(new CoeurQuiBat(),10);
        scenario.ajouterAnim(new Eclair(),1);
        scenario.lancer();
    }
}
