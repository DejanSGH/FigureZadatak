import java.util.ArrayList;

public class PriorityQueue {

    private ArrayList<Figura> listaFigura;
    private Sortiranje s;

    public enum Sortiranje {RASTUCE, OPADAJUCE};

    public PriorityQueue(Sortiranje s) {
        this.listaFigura = new ArrayList<Figura>();
        this.s = s;
    }

    public void dodaj(Figura f){

        int znak = (s == Sortiranje.OPADAJUCE) ? 1 : -1;

        for (int i = 0; i < listaFigura.size(); i++) {
            if(f.getPovrsina() * znak > listaFigura.get(i).getPovrsina() * znak){
                listaFigura.add(f);
                return;
            }
        }
        listaFigura.add(f);

    }
}
