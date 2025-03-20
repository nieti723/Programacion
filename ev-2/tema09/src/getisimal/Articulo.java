package getisimal;

public class Articulo {
	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	
	
	public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.precioCompra = precioCompra;
		this.precioVenta = precioVenta;
		this.stock = stock;
	}

	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public void setPrecioCompra(double precioCompra) {
		this.precioCompra = precioCompra;
	}


	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	
	public void entradaMercancia(int cantidad) {
		stock += cantidad;
	}
	
	public void salidaMercancia(int cantidad) {
		if (cantidad>stock) {
			System.out.println("La cantidad a retirar no puede ser mayor al stock");
		} else {
			cantidad -= stock;
		}
	}
	
}
