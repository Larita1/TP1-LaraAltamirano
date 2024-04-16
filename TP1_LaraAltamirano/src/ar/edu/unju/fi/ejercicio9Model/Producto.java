package ar.edu.unju.fi.ejercicio9Model;

public class Producto {
	private String nombr;
    private int cod;
    private double prec;
    private int des;

    public Producto() {
    }

	public String getNombre() {
		return nombr;
	}

	public void setNombre(String nombre) {
		this.nombr = nombre;
	}

	public int getCodigo() {
		return cod;
	}

	public void setCodigo(int codigo) {
		this.cod = codigo;
	}

	public double getPrecio() {
		return prec;
	}

	public void setPrecio(double precio) {
		this.prec = precio;
	}

	public int getDescuento() {
		return des;
	}

	public void setDescuento(int descuento) {
		this.des = descuento;
	}
	public double calcularDescuento() {
        if (des > 0 && des <= 50) {
            return prec - (prec * des / 100.0);
        } 
        else {
            return prec; 
        }
	}
}
