public class App {
    public static void main(String[] args) {

        Runnable exemploUm = new ExemploUm();
        Thread threadDoExemploUm = new Thread(exemploUm, "nome da thread");
        threadDoExemploUm.start();

        ExemploDois exemploDois = new ExemploDois();
        exemploDois.start();

    }
}
