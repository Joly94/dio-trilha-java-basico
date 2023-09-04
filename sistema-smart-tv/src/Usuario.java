public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();  

        System.out.println ("TV ligada " + smartTv.ligada);
        System.out.println ("Volume atual " + smartTv.canal);
        System.out.println ("Volume atual " + smartTv.volume);


        smartTv.ligar(); 
            System.out.println ("TV Novo status -> Ligada " + smartTv.ligada);

        smartTv.desligar();
            System.out.println ("TV Novo status -> Ligada " + smartTv.ligada);


        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
            System.out.println("O volume atual é: " + smartTv.volume); 
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
            System.out.println("O volume atual é: " + smartTv.volume); 
        
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
            System.out.println("O canal atual é: " + smartTv.canal);
        
        smartTv.diminuirCanal();
        smartTv.diminuirCanal();
            System.out.println("O canal atual é: " + smartTv.canal);
        
        smartTv.mudarCanal(6);
            System.out.println("O canal atual é: " + smartTv.canal);
        
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
            System.out.println("O canal atual é: " + smartTv.canal);
        


    }
}
