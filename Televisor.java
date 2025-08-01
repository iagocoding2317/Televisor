public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado = true;

    public Televisor(int canal, int volume) {
        this.canal = canal;
        this.volume = volume;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public void aumentarVolume(int valor) {
        if (ligado = true) {
            volume = volume + valor;
        }
    }

    public void diminuirVolume(int valor) {
        if (ligado = true) {
            volume = volume - valor;
        }
    }

    public void trocarCanal(int novoCanal) {
        if (ligado = true) {
            canal = novoCanal;
        }
    }

    public String toString() {
        return "Televisor{" +
                "canal=" + canal +
                ", volume=" + volume +
                ", ligado=" + ligado +
                '}';
    }
}
