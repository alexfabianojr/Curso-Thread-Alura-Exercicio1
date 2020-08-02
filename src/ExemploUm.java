public class ExemploUm implements Runnable {

    @Override
    public void run() {
        System.out.println("\nEssa é a minha primeira thread " +
                "\n Dentro do método run devo por " +
                "o bloco de código a ser executado na thread\n");
    }
}
