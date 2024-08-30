import java.nio.channels.NonWritableChannelException;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
       
        // Declaração de um vetor de inteiros com tamanho 5 
        int [] meu_array = new int [5];

        // Inicialização do vetor da array por acesso rapido
        meu_array [0] = 10;
        meu_array [1] = 20;
        meu_array [2] = 30;
        meu_array [3] = 40;
        meu_array [4] = 50;

         // recuperar os elementos da array por acesso rapido
        int element0 = meu_array [0];
        int element1 = meu_array [1];

        System.out.println(element0);
        System.out.println(element1);

        for (int i=0; i < meu_array.length; i++){
            System.out.println("Elemento" + i + ":" + meu_array[i]);
        }

        //Array (ou vetor) do tipo Texto/String
        //A quantidade de elementos é amarrada no inicio, por meio de um numero inteiro
        //Permitindo que a mesma seja ampliada/diminuida no decorrer do processo
        String [] lista_aluno = new String [5];

        lista_aluno [0] = "João";
        lista_aluno [1] = "Vanessa";
        lista_aluno [2] = "Davi";
        lista_aluno [3] = "Lucas";
        lista_aluno [4] = "Igor";

        //Acesso direto (rapido)
        System.out.println(lista_aluno[2]);

        //Array (ou vetor) do tipo String/texto
        //A quantidade de elementos é amarrada no ato da criação
        //Portanto, não é possível modificar a quantidade, somente adicionando e removendo
       String [] lista_cidades = {"Poá", "Itaim Paulista","Suzano","Itu"};
       //Acesso direto (rapido)
        System.out.println(lista_cidades[2]);

        //Acesso posicional - sequencial (percorrer um array)
        for (int i=0; i<lista_aluno.length; i++){
            System.out.println("Elemento " +i+ ": "+lista_aluno[i]);
        }

         //Acesso posicional - sequencial (percorrer um array)
         for (int i=0; i<lista_cidades.length; i++){
            System.out.println("Elemento " +i+ ": "+lista_cidades[i]);
        }

        //Exibindo uma array dentro de um SysOut
        int [] array = {10, 20, 30, 40, 50};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(lista_cidades));

        //Verificando o tamanho da Array (quantidade de elementos)
        System.out.println("O tamanho é: "+array.length);
        System.out.println("O tamanho é: "+lista_cidades.length);
        System.out.println("O tamanho é: "+lista_aluno.length);

        //copiando uma array
        int[]copia = array.clone();
        String[]copia_cidade = lista_cidades;

        System.out.println("Copia: " +Arrays.toString(copia));
        System.out.println("Copia: " +Arrays.toString(copia_cidade));

        //copiando uma parte do array
        String[] copia_sel = Arrays.copyOf(lista_cidades,2 );
        System.out.println("Copia: " +Arrays.toString(copia_sel));

        //organizando elementos
        int[] nova_array = {5,6,4,2,3,1,0};
        Arrays.sort(nova_array);

        System.out.println("Ordem em: "+ Arrays.toString(nova_array));

        //inserindo um valor igual em todas as posições e array vazia(0)
        int[] array_vazia = new int[5];
        System.out.println(": "+ Arrays.toString(array_vazia));

        Arrays.fill(array_vazia, 10);
        System.out.println(": "+ Arrays.toString(array_vazia));

        //verificando se as arrays são iguais no tamanho e conteúdo (identicas)
        boolean resp = Arrays.equals(lista_cidades, copia_cidade);
        System.out.println("São iguais: "+resp);

        if(Arrays.equals(lista_cidades,copia_cidade)){
            System.out.println("Elas são iguais");
        }else{
            System.out.println("Elas são diferentes");
        }
        
        //buscando elementos
        int posicao = Arrays.binarySearch(array,30);
        System.out.println("Foi localizado na posição: "+posicao);
    }
}
