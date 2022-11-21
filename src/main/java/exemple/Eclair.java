package exemple;

import bandeau.Bandeau;

import java.awt.*;
import java.util.Random;

public class Eclair implements Animation{
    @Override
    public void jouer(Bandeau bandeau) {
        String temp = bandeau.getMessage();
        bandeau.setMessage("");
        bandeau.setForeground(Color.black);
        bandeau.setBackground(Color.black);
        for(int i = 0 ; i < temp.length() ; i++){
            bandeau.setMessage(bandeau.getMessage() + temp.charAt(i));
            bandeau.setBackground(Color.YELLOW);
            bandeau.sleep(700);
            bandeau.setBackground(Color.black);
            bandeau.sleep(new Random().nextInt(4000));
        }
        bandeau.setForeground(Color.YELLOW);

    }
}
