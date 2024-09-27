import java.net.SocketTimeoutException;
import java.util.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        //criando pilha, precisa importar extensão
        Stack<String> pilha_pratos = new Stack<>();

        //adicionando pratos
        pilha_pratos.push("Prato Laranja");
        pilha_pratos.push("Prato Azul");
        pilha_pratos.push("Prato Verde");
        pilha_pratos.push("Prato Vermelho");

        //tamanho da pilha
       int tam = pilha_pratos.size();
       System.out.println("O Tamanho da Pilha é: "+tam);

       //verificar o topo da pilha
       String topo = pilha_pratos.peek();
       System.out.println("O elemento que esta no topo: "+topo);

       //removendo o elemento que esta no topo
       String rem = pilha_pratos.pop();
       System.out.println("O elemento removido foi: "+rem);

       System.out.println("Utilizando Conceito LIFO (Ultimo a Entrar, Primeiro a Sair)");

       for (int i=pilha_pratos.size()-1; i >=0;i--){
            System.out.println(pilha_pratos.get(i));
       }
    }
}
