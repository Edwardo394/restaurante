public class UnidadeDeProcessamento {
    private int tempoPizza;
    private int tempoPastel;
    public UnidadeDeProcessamento(int tempoPizza, int tempoPastel){
        this.tempoPastel=tempoPastel;
        this.tempoPizza = tempoPizza;
    }


    public static void ColocaNaFilaDeProcessamento(Pedido P){

    }

    public static void RetiraPedidoDaFilaDeProcessamento(){

    }

    public static boolean temUnidadeDeProcessamentoLivre(){
    return false;
    }

    public static void AtribuiPedidoAoProcessadorLivre(Pedido P){

    }

    public static boolean temProcessamentoFinalizado(int t){
    return false;
    }

    public static Pedido ConcluiProcessamento(){
        return null;
    }


}
