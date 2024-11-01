import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class App {
    public static void main(String[] args) throws Exception {
           // lista_simples();
           // lista_encadeada();

        ListaCircular playlist = new ListaCircular();
        playlist.adicionar("Dani Callifornia - Red Hot Chili Peppers");
        playlist.adicionar("Can't Stop - Red Hot Chili Peppers");
        playlist.adicionar("By the way - Red Hot Chili Peppers");
        playlist.adicionar("Callifornication - Red Hot Chili Peppers");
        playlist.adicionar("Thriller - Michael Jackson");
        playlist.adicionar("Hello - Adele");
        playlist.adicionar("Que Xou da Xuxa é esse? - Xuxa");

        playlist.percorrer(1);
    }
        public static void lista_encadeada(){
            //criando uma lista encadeada
            LinkedList<String> carros = new LinkedList<>();

            //adicionando itens na lista
            carros.add("Corsa");
            carros.add("Gol");
            carros.add("HB20");
            carros.add("Onix");
            System.out.println("Lista de carros: ");
            System.out.println(carros.toString());

            //adicionando na inicio da lista
            carros.addFirst("Kwid");
            System.out.println("Lista de carros: ");
            System.out.println(carros.toString());

            //adicionando no fim da lista
            carros.addLast("Argo");
            System.out.println("Lista de carros: ");
            System.out.println(carros.toString());

            //removendo elementos
            carros.remove(1);
            System.out.println("Lista de carros removido: ");
            System.out.println(carros.toString());

            //removendo no inicio da lista
            carros.removeFirst();
            System.out.println("Lista de carros removido:");
            System.out.println(carros.toString());

            //removendo no fim da lista
            carros.removeLast();
            System.out.println("Lista de carros removidos: ");
            System.out.println(carros.toString());

            //consultar um elemento especifico
            System.out.println("Acesso direto: "+carros.get(0));
            System.out.println("Acessando o 1º item da lista: "+carros.getFirst());
            System.out.println("Acessando o último item da lista: "+carros.getLast());

            //percorrendo uma lista
            System.out.println("Percorrendo uma lista do inicio ao fim");
            ListIterator<String> it = carros.listIterator();
            while(it.hasNext()){
                System.out.println(it.next());
            }
            System.out.println("Percorrendo uma lista do fim ao inicio");
            while(it.hasPrevious()){
                System.out.println(it.previous());
            }
        }
      
        public static void lista_simples(){
         //criando uma lista
            ArrayList<String> frutas = new ArrayList<>();
            ArrayList<String> feira = new ArrayList<>();

        //adicionando elementos na lista: ADD
            frutas.add("Banana");
            frutas.add("Laranja");
            frutas.add("Melancia");
            frutas.add("Uva");

        //remover elementos: REMOVE (index)
            frutas.remove(1);

        //consultando elementos de acesso direto: GET(index)
            System.out.println(frutas.get(0));

        //consultar o tamanho da lista: SIZE()
            System.out.println("O tamanho da lista é: "+ frutas.size());
            System.out.println("O tamanho da lista é: "+ feira.size());

        //verificar se a lista esta vazia: ISEMPTY()
            System.out.println("A lista esta vazia: "+frutas.isEmpty());
            System.out.println("A lista esta vazia: "+feira.isEmpty());


        //percorrendo uma lista
            System.out.println("Lista de frutas: ");
            for(String item: frutas){
                System.out.println(item);
            }
        }
    }