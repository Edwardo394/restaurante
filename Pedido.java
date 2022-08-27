public class Pedido {
    private int tempoGastoEmProcessamento;
    private int tempoNecessarioAoProcessamento;
    private int qntdPizzas = 0, qntdPasteis = 0, horaDoPedido = 0, pedidoId = 0;

    public Pedido(int tempoGastoEmProcessamento, int tempoNecessarioAoProcessamento,
                  int pedidoId, int qntdPizzas, int qntdPasteis, int horaDoPedido) {

        this.tempoGastoEmProcessamento = tempoGastoEmProcessamento;
        this.tempoNecessarioAoProcessamento = tempoNecessarioAoProcessamento;
        this.pedidoId = pedidoId;
        this.qntdPizzas = qntdPizzas;
        this.qntdPasteis = qntdPasteis;
        this.horaDoPedido = horaDoPedido;
    }

    public static int getTempoGastoEmProcessamento() {
        return tempoGastoEmProcessamento;
    }

    public static int getTempoNecessarioAoProcessamento() {
        return tempoNecessarioAoProcessamento;
    }

    public static int getQntdPizzas() {
        return qntdPizzas;
    }

    public static int getQntdPasteis() {
        return qntdPasteis;
    }

    public static int getHoraDoPedido() {
        return horaDoPedido;
    }

    public int getPedidoId() {
        return pedidoId;
    }

    public void setTempoGastoEmProcessamento(int tempoGastoEmProcessamento) {
        this.tempoGastoEmProcessamento = tempoGastoEmProcessamento;
    }

    public void setTempoNecessarioAoProcessamento(int tempoNecessarioAoProcessamento) {
        this.tempoNecessarioAoProcessamento = tempoNecessarioAoProcessamento;
    }

    public void setQntdPizzas(int qntdPizzas) {
        this.qntdPizzas = qntdPizzas;
    }

    public void setQntdPasteis(int qntdPasteis) {
        this.qntdPasteis = qntdPasteis;
    }

    public void setHoraDoPedido(int horaDoPedido) {
        this.horaDoPedido = horaDoPedido;
    }

    public void setPedidoId(int pedidoId) {
        this.pedidoId = pedidoId;
    }

    public String imprime() {
        return "Pedido{" +
                "tempoGastoEmProcessamento=" + tempoGastoEmProcessamento +
                ", tempoNecessarioAoProcessamento=" + tempoNecessarioAoProcessamento +
                ", qntdPizzas=" + qntdPizzas +
                ", qntdPasteis=" + qntdPasteis +
                ", horaDoPedido=" + horaDoPedido +
                ", pedidoId=" + pedidoId +
                '}';
    }
}
