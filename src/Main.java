public class Main {

    public static void main(String[] args) throws InterruptedException {

        //criar array threads
        Thread[] threads = new Thread[10];

        //criar 10 theads e armazenar no array
        for (int i = 0; i < 10; i++) {
            threads[i] = new Thread(new ThreadInsert("Thread " +i));
        }

        // 10 segundos
        //Thread.sleep(10000);
        // precorrer array e inicializar as threads
        for (int i = 0; i < 10; i++) {
            threads[i].start();
        }

        Thread.sleep(10000);
        System.out.println("Inicia exibição da lista");

        String[] list = Common.store.exibirLista();;
        for(int i = 0; i<1000; i++) {
            System.out.println("Lista atualizada "+list[i]);
        }


    }
}
