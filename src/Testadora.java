public class Testadora {
    public static void main(String [] args){
        Luz s;

        s=Luz.AMBAR;

        Palestra situacao= new Palestra(s);
        situacao.acessa();
    }
}   