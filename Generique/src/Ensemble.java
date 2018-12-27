import java.util.ArrayList;
import java.util.List;

public class Ensemble<T> {
    List<T> value;
    int card;

    public Ensemble() {
        this.value = new ArrayList<>();
    }

    public void setCard(int card) {
        this.card = card;
    }
    public boolean ajoute(T value){
        for (int i=0;i<this.value.size();i++){
            if(value.equals(this.value.get(i))){
                return false;
            }
        }
        this.value.add(value);
        return true;
    }
    public boolean enleve(T value) {
        for (int i=0;i<this.value.size();i++){
            if(value.equals(this.value.get(i))){
                this.value.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        String mon="cardinalité : "+ this.card+"\n ma liste : \n";

        for (int i=0;i<this.value.size();i++){
            mon+= this.value.get(i)+"\n";
        }
        return mon+ "\n========================================";
    }
}
