import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        calcular();
        }

    public static void calcular(){
            float ent1;
            float ent2;
        Scanner sc = new Scanner (System.in);

        System.out.print("Digite o 1º número: ");
        ent1 = sc.nextFloat();
        System.out.print("Digite o 2º número: ");
        ent2 = sc.nextFloat();

        System.out.println("A soma é" + (ent1+ent2));
        System.out.println("A subtração é" + (ent1-ent2));
        System.out.println("A multiplicação é" + (ent1*ent2));
        System.out.println("A divisão é" + (ent1/ent2));        
    }    
    
}
