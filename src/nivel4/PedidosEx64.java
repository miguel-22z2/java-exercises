package nivel4;

public class PedidosEx64 {
	public Integer numeroPedido;
	public EnumPedidos status;
	
	PedidosEx64(Integer numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	
	public void getStatus() {
		System.out.println("Pedido número: " + numeroPedido);
		System.out.println("Status: " + status);
		return;
	}
	
	public void setStatus(EnumPedidos inputStatus) {
		status = inputStatus;
		return;
	}
	
	public static void main(String[] args) {
		PedidosEx64 pedido = new PedidosEx64(1001);
		
		pedido.status = EnumPedidos.PROCESSANDO;
		
		pedido.getStatus();
		System.out.println();
		pedido.setStatus(pedido.status = EnumPedidos.NA_COZINHA);
		pedido.getStatus();
	}
}
