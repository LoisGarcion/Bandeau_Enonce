package exemple;

import bandeau.Bandeau;

public class textQuiDefile implements Animation{
    @Override
    public void jouer(Bandeau bandeau) {
        char temp;
        StringBuilder builder;
        for(int i = 0 ; i < bandeau.getMessage().length() ; i++){
            builder = new StringBuilder(bandeau.getMessage());
            temp = builder.charAt(builder.length()-1);

            for(int j = builder.length()-1  ; j> 0 ; j--){
                builder.setCharAt(j,builder.charAt(j-1));
            }

            builder.setCharAt(0,temp);
            bandeau.sleep(100);
            bandeau.setMessage(builder.toString());
        }
    }

}
