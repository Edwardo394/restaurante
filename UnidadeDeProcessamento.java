public class UnidadeDeProcessamento {
    Pedido P;
    public UnidadeDeProcessamento(Pedido P){
        this.P = P;
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
