public class Main {

    public static void main(String[] args) {


        Trougao trougao = new Trougao(new Tacka(13, 34),  new Tacka(22, 21), new Tacka(11, 19));
        System.out.println(trougao.getNaziv());
        System.out.println(trougao.getPovrsina());
        Figura f = new Trougao(new Tacka(13, 34),  new Tacka(22, 21), new Tacka(11, 19));
        f.getPovrsina();
    }
}
