public class ThreadInsert implements Runnable{

    // nome da thread
    private String nome;
    //Store store = new Store();

    public ThreadInsert(String nome) {
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {

            //store.inserirElementos(nome);
            //Store.store.inserirElementos(nome);
            Common.store.inserirElementos(nome + "inseriu "+i);
            for(int k=0; k<10000; k++) {
                // dando um tempo...
            }
            System.out.println(nome + "inseriu "+i);
        }
    }
}
