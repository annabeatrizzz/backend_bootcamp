public class SmartTV {
    /*
    Ela tenha as características: ligada (boolean), canal (int) e volume (int)
    Nossa TV poderá ligar e desligar e assim mudar o estado ligada => DONE method setOn()
    Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1 => DONE method changeVolume()
    Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente => DONE method setVolume()
    */

    private boolean on = false;
    private int channel = 1;
    private int volume = 0;

    public SmartTV() {}

    //GETTERS
    public boolean getOn(){
        return on;
    }

    public int getChannel(){
        return channel;
    }
    public int getVolume(){
        return volume;
    }

    //SETTERS
    public void setOn(boolean newOn){
        this.on = newOn;
    }

    public void setChannel(int newChannel){
        this.channel = newChannel;
    }

    public void setVolume (int newVolume){
        this.volume = newVolume;
    }

    public void changeVolume (int newVolume){
        volume = volume+newVolume;
    }
}