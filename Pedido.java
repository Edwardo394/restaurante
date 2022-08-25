import java.util.Random;
import java.lang.Math;


public class Pedido {
    private static boolean temPedido;
    private int tempoGastoEmProcessamento;
    private int tempoNecessarioAoProcessamento;
    int pedidoid = 0;

    public static boolean verificaSeTemPedido(){
        Random chance = new Random();


        double chanceInt = Math.round(chance.nextDouble()*100);


        System.out.println("\nChanceInt => " + chanceInt);

        if(99.0 >= chanceInt && chanceInt >= 80.0){
            return temPedido == true;
        }else{
            return temPedido == false;
        }
    }

    public void realizaPedido(boolean verificaSeTemPedido){
        /*if(verificaSeTemPedido()){
            for(int i = 0; i <= listaDePedidos.length; i++) {
                System.out.println(listaDePedidos);
            }
        } */
    }

    public Pedido(int id, int qntdPizzas, int qntdPasteis, int horaDoPedido){
        System.out.println("Pedidoid => " + pedidoid++);
    }

}
