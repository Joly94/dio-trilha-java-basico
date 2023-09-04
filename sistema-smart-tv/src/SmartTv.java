public class SmartTv {

    boolean ligada = false;
    int canal = 1;
    int volume = 25;
    //atributos da nossa smartv
 

    //abaixo são os métodos que manipulam a nossa tv
    public void ligar(){
        ligada=true;    
    }
    public void desligar(){
        ligada=false;    
    }
    //não retorna nada (void) e o método é "ligar"

    public void aumentarVolume() {
        volume++;
    }    
    public void diminuirVolume() {
        volume--;
    }

    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal() {
        canal++;
    }
    public void diminuirCanal() {
        canal--;
    }
}