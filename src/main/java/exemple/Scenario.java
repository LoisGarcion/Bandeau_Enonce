package exemple;

import bandeau.Bandeau;

import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Scenario {

    private Map<Animation, Integer> listAnimation;

    private Bandeau bandeau;

    public Scenario(Bandeau bandeau){
        listAnimation = new HashMap<>();
        this.bandeau = bandeau;
    }

    public void ajouterAnim(Animation anim, int nbRepetition){
        listAnimation.put(anim,nbRepetition);
    }

    public void resetBandeau(){
        bandeau.setForeground(Color.black);
        bandeau.setBackground(Color.white);
        bandeau.setFont(new Font("Dialog", Font.BOLD, 30 ));
    }

    public void lancer(){
        for(Map.Entry<Animation, Integer> animation : listAnimation.entrySet()){
            for(int i = 0; i < animation.getValue() ; i++){
                animation.getKey().jouer(this.bandeau);
                resetBandeau();
            }
        }
    }
}

