public class Tv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    // estado inicial da tv

    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
    
    public void aumentarVolume(){
        volume++;
        
    }
    public void diminuirVolume(){
        volume--;
    }
}
