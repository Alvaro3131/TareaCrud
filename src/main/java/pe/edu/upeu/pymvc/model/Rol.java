package pe.edu.upeu.pymvc.model;

public class Rol {
private int idproducto;
private String nombre;
private double precio;
private int cantidad;
public Rol() {
}
public Rol(String nombre, double precio, int cantidad) {
	this.nombre = nombre;
	this.precio = precio;
	this.cantidad = cantidad;
}
public int getIdproducto() {
	return idproducto;
}
public void setIdproducto(int idproducto) {
	this.idproducto = idproducto;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public double getPrecio() {
	return precio;
}
public void setPrecio(double precio) {
	this.precio = precio;
}
public int getCantidad() {
	return cantidad;
}
public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}



}
