public class Trougao extends Figura {


    private String naziv;
    private float povrsina;
    public Trougao(Tacka a, Tacka b, Tacka c) {
        super(3, new Tacka[]{a,b,c});
        this.naziv = "Trougao";
        racunanjePovrsine();
    }

    @Override
    protected void racunanjePovrsine() {
        Tacka a = temena[0];
        Tacka b = temena[1];
        Tacka c = temena[2];
        float area = (a.getX() * (b.getY() - c.getY()) + b.getX() * (c.getY() - a.getY()) + c.getX() * (a.getY() - b.getY())) / 2.0f;
        this.povrsina = area;
    }

}
