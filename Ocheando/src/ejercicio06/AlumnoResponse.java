package ejercicio06;

import java.util.List;
import java.util.Objects;

public class AlumnoResponse {
 private String nombre;
 private List<Materia> materiasSuspensas;
 
 public AlumnoResponse() {
	super();
	// TODO Auto-generated constructor stub
 }
 public AlumnoResponse(String nombre, List<Materia> materiasSuspensas) {
	super();
	this.nombre = nombre;
	this.materiasSuspensas = materiasSuspensas;
 }
 private String getNombre() {
	return nombre;
 }
 private void setNombre(String nombre) {
	this.nombre = nombre;
 }
 private List<Materia> getMateriasSuspensas() {
	return materiasSuspensas;
 }
 private void setMateriasSuspensas(List<Materia> materiasSuspensas) {
	this.materiasSuspensas = materiasSuspensas;
 }
 @Override
 public int hashCode() {
	return Objects.hash(materiasSuspensas, nombre);
 }
 @Override
 public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	AlumnoResponse other = (AlumnoResponse) obj;
	return Objects.equals(materiasSuspensas, other.materiasSuspensas) && Objects.equals(nombre, other.nombre);
 }
 @Override
 public String toString() {
	return "AlumnoResponse [nombre=" + nombre + ", materiasSuspensas=" + materiasSuspensas + "]";
 }
 
}
