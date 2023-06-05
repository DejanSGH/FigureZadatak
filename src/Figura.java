public abstract class Figura {

    protected Tacka[] temena;
    private String naziv;
    private float povrsina;

    public Figura(int brojTemena, Tacka[] nizTemena) {
        this.temena = new Tacka[brojTemena];
        for (int i = 0; i < brojTemena; i++) {
            this.temena[i] = nizTemena[i];
        }
    }

    abstract void racunanjePovrsine();


    public String getNaziv() {
        return naziv;
    }

    public float getPovrsina() {
        return povrsina;
    }
}
