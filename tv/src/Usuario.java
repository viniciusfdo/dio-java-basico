public class Usuario {
    public static void main(String[] args) throws Exception {

        Tv Tv = new Tv();

        System.out.println("TV ligada ? " + Tv.ligada);
        Tv.ligar ();
        System.out.println("Novo Status - TV ligada ? " + Tv.ligada);

        Tv.diminuirVolume();
        Tv.diminuirVolume();
        Tv.diminuirVolume();
        Tv.aumentarVolume();

        System.out.println("Canal atual : " + Tv.canal);

        Tv.mudarCanal(13);

        System.out.println("Canal mudou para : " + Tv.canal);

        System.out.println("Volume atual : " + Tv.volume);
    }
}
