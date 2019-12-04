import java.util.ArrayList;
import java.util.List;

public class Store {

    //public static Store store = new Store();


    //lista de elementos opção 1
    private String[] lista = new String[1000];
    //lista de elementos opção 2
    public List<String> lista2 = new ArrayList<>();
    // contador
    private int count = 0;

    //metodo para adicionar elementos na lista
    public void inserirElementos(String elemento){
        //adicionar elementos na lista
        lista[count] = elemento;

        //incrementar o count
        count ++;
    }

    public String[] exibirLista(){

        return lista;
    }
}
