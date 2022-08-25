import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
      entradas();
    }

    public static void criaArray(int n){
        final int[] listaDePedidos = new int[n];
        int cont = 0;
        criaPedidos(listaDePedidos, cont, n);
    }

    public static void criaPedidos(int[] listaDePedidos, int cont,int n) {
        int j = 0;
        while (j <= n) {
            for (int i = 0; i <= listaDePedidos.length - 1; i++) {
                if (Pedido.verificaSeTemPedido()) {
                    new Pedido(cont, 1, 1, 1);
                    System.out.println("ListaDePedidos[i] => " + listaDePedidos[i]);
                    listaDePedidos[i] = cont++;
                    j++;
                } else {
                    System.out.println("Sem novos pedidos");
                    j++;
                }
            }
        }
    }

    public static void entradas(){
        System.out.println("Digite o numero maximo de pedidos a serem feitos\n");
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        criaArray(n);
    }

}
