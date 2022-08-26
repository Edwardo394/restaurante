import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
      entradas();
    }

    public static boolean verificaSeTemPedido(){
        boolean temPedido = false;

        Random chance = new Random();

        double chanceInt = Math.round(chance.nextDouble()*100);

        System.out.println("NUMERO SORTEADO = " + chanceInt);

        if(99.0 >= chanceInt && chanceInt >= 80.0){
            System.out.println("RETORNO VERDADEIRO");
            return temPedido;
        }else{System.out.println("RETORNO FALSO");
            return !temPedido;
        }
    }
    public static void criaPedidos(int[] filaDePedidos, int cont,int n) {
        int j = 0;
            while (j <= n) {
                for (int i = 0; i <= filaDePedidos.length - 1; i++) {
                    if (verificaSeTemPedido()) {
                        new Pedido(cont, 1, 1, 1);
                        filaDePedidos[i] = cont++;
                        j++;
                        System.out.println("PASSOU PELO IF == TRUE");
                    } else {
                        System.out.println("Sem novos pedidos");
                        j++;
                        System.out.println("PASSOU PELO IF == FALSE");
                    }
                }
            }
    }
    public static void criaArray(int n){
        final int[] filaDePedidos = new int[n];
        int cont = 0;
        criaPedidos(filaDePedidos, cont, n);
    }
    public static void entradas(){
        System.out.println("Digite o numero maximo de pedidos a serem feitos\n");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        criaArray(n);
    }

}
