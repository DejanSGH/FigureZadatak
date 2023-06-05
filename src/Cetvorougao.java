public class Cetvorougao extends Figura {

    private String naziv;
    private float povrsina;

    public Cetvorougao(Tacka a, Tacka b, Tacka c, Tacka d) {
        super(4, new Tacka[]{a,b,c,d});
        this.naziv = "Cetvorougao";
        racunanjePovrsine();
    }

    @Override
    void racunanjePovrsine() {

        Tacka a = temena[0];
        Tacka b = temena[1];
        Tacka c = temena[2];
        Tacka d = temena[3];

        float area = 0.5f * ((a.getX() * b.getY() + c.getX() * d.getY() + d.getX() * a.getY())
                - (b.getX() * a.getY() + c.getX() * b.getY() + d.getX() * c.getY() + a.getX() * d.getY()));

        this.povrsina = area;
    }

    @Override
    public String getNaziv() {
        return this.naziv;
    }

    @Override
    public float getPovrsina() {
        return this.povrsina;
    }
}
