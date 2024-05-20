public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void aumentarVolume(){
        //volume = volume + 1;
        volume++;
        System.out.println("Aumentando o volume para: " + volume);
    }

    public void diminuirVolume(){
        //volume = volume - 1;
        volume--;
        System.out.println("Diminuindo o volume para: " + volume);
    }

    public void aumentarCanal(){
        canal++;
        System.out.println("Mudar de canal para: " + canal);
    }

    public void diminuirCanal(){
        canal--;
        System.out.println("Mudar de canal para: " + canal);
    }

    public void ligar(){
        ligada = true;
    }

    public void desligar(){
        ligada = false;
    }


}
