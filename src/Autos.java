public class Autos {
	
	//Atributos
	public String marca;
	public String color;
	public double precio;
	public boolean venta;
	
	//Constructor
	public Autos() {
	}
	
	public Autos(String marca, String color, double precio, boolean estado) {
		this.marca = marca;
		this.color = color;
		this.precio = precio;
		venta = estado; 
	}
    // Método para vender
    public void vender() {
        venta = true;
    }
}
