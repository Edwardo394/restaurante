import java.util.Random;
import java.util.Scanner;
import java.lang.Math;
public class Main {
    static int numeroDePedidos = 0; //variavel global contadora de pedidos
    static int num = 1;
    public static void main(String[] args) {
        controle();
        new FilaArray();
    }

    public static int controle() {
        int tempo = 0;
        do {
            Pedido P = null;
            UnidadeDeProcessamento Montadores = new UnidadeDeProcessamento(P);
            UnidadeDeProcessamento Fornos = null, Empacotadores = null;
            P = geraPedido(tempo);

            // Montagem do pedido
            while (Montadores.temUnidadeDeProcessamentoLivre()) {
                Montadores.RetiraPedidoDaFilaDeProcessamento();

                Montadores.AtribuiPedidoAoProcessadorLivre(P);
            }

            while (Montadores.temProcessamentoFinalizado(tempo)) {
                P = Montadores.ConcluiProcessamento();

                Fornos.ColocaNaFilaDeProcessamento(P);
            }

            // Cozimento do pedido
            while (Fornos.temUnidadeDeProcessamentoLivre()) // Montado??
            {
                Fornos.RetiraPedidoDaFilaDeProcessamento();

                Fornos.AtribuiPedidoAoProcessadorLivre(P);
            }

            while (Fornos.temProcessamentoFinalizado(tempo)) // Assado??
            {
                P = Fornos.ConcluiProcessamento();

                Empacotadores.ColocaNaFilaDeProcessamento(P);
            }

            // Empacotamento do pedido
            while (Empacotadores.temUnidadeDeProcessamentoLivre()) {
                Empacotadores.RetiraPedidoDaFilaDeProcessamento();

                Empacotadores.AtribuiPedidoAoProcessadorLivre(P);
            }

            while (Empacotadores.temProcessamentoFinalizado(tempo)) // Empacotado??
            {
                P = Empacotadores.ConcluiProcessamento();

                P.imprime(); // relatorio sobre o pedido
                // Aqui, deve coletar estatíticas sobre o pedido
            }
            tempo++;
        }
        while (tempo < 8 * 60);// 8 horas, 60 minutos
        return 0;
    }

    private static Pedido geraPedido(int tempo) {
        numeroDePedidos += num;
        int tempoGasto = Pedido.getTempoGastoEmProcessamento();
        int tempoNecessario = Pedido.getTempoNecessarioAoProcessamento();
        int qntddPizzas = Pedido.getQntdPizzas();
        int qntddPasteis = Pedido.getQntdPasteis();
        int horaDoPedido = Pedido.getHoraDoPedido();
        Pedido pedidoCriado = null;

        Random chance = new Random();
        double chanceInt = Math.round(chance.nextDouble()*100);
        System.out.println("NUMERO SORTEADO = " + chanceInt);
        if(99.0 >= chanceInt && chanceInt >= 80.0){
            System.out.println("RETORNO VERDADEIRO");
            Pedido p = new Pedido(tempoGasto, tempoNecessario, numeroDePedidos, qntddPizzas, qntddPasteis, horaDoPedido);
            pedidoCriado = p;
        }else{System.out.println("RETORNO FALSO");
            geraPedido(tempo);
        }
        return pedidoCriado;
    }
}





























































/*
    Abaixo está o projeto inicial que apresenta bug na hora da construção de um novo pedido.
    Os metodos comentados foram utilizados para uma reflexão inicial de como trabalhar o seguinte problema
    https://www.inf.pucrs.br/pinho/AlestI/Trabalhos/T1-2022-2/T1-2022-2-Restaurante.html
    Não apagados para fins de consultas futuras.



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
*/