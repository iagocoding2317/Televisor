public class Televisor {
    private String canal;
    private int volume;
    private boolean ligado;

    public Televisor() {
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }
     
    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean getLigado(){
        return ligado;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void ligar(){
        ligado = true;       
    }

    public void desligar(){
        ligado = false;       
    }

    public void aumentarVolume(int aumento){
        if(ligado = true)
            volume = volume + aumento;
    }

    public void diminuirVolume(int diminuicao){
        if(ligado = true)
            volume = volume - diminuicao;
    }

    public void trocarCanal(String outroCanal){
        if(ligado = true)
            canal = outroCanal;
    }

    public String toString(){
        return String.format("O Canal:" + canal +
        "\nCom volume: " + volume +
        "\nEstá ligado: " + ligado +
        "\n");
    }
}
