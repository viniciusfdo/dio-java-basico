public class Usuario {
    public static void main(String[] args) throws Exception {

        Tv Tv = new Tv();

Tv.diminuirVolume();
Tv.diminuirVolume();
Tv.diminuirVolume();
Tv.aumentarVolume();


        System.out.println("TV ligada ? " + Tv.ligada);
        System.out.println("Canal atual : " + Tv.canal);
        System.out.println("Volume atual : " + Tv.volume);

        Tv.ligar ();
            System.out.println("Novo Status - TV ligada ? " + Tv.ligada);

    }
}
