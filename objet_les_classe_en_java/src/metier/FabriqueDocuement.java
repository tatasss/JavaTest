package metier;

import java.io.Serializable;
import java.security.PublicKey;

public class FabriqueDocuement implements Serializable {
    public FabriqueDocuement() {
    }
    public Document createDocuement (String titre, int nbPage,Auteur auteur){
        return new Livre(titre,nbPage,auteur);
    }
    public Document createDocuement (String titre, int nbPage,Frequence frequence){
        return new Revue(titre,nbPage,frequence);
    }
}
