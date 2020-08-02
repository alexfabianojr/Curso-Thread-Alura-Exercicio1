public class ExemploDois extends Thread {

    @Override
    public void run() {
        super.run();
        System.out.println("\nEssa é a minha segunda thread " +
                "\n Dentro do método run devo por " +
                "o bloco de código a ser executado na thread" +
                "\nA classe thread implementa a Runnable" +
                "\nEssa forma de criar thread é um mau exemplo\n");
    }
}
