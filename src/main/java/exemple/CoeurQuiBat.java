package exemple;

import bandeau.Bandeau;

import java.awt.*;

public class CoeurQuiBat implements Animation{
    @Override
    public void jouer(Bandeau bandeau) {
        bandeau.setForeground(Color.red);
        for (int i = 1; i < 10; i++) {
            bandeau.setFont(new Font("Dialog", Font.BOLD, 10 + 10*i));
            bandeau.sleep(30);
        }
        for (int i = 10; i > 1; i--) {
            bandeau.setFont(new Font("Dialog", Font.BOLD,10 + 10*i));
            bandeau.sleep(30);
        }
    }
}
