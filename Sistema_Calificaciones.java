package calificaciones;

public class Sistema_Calificaciones {
	    public static void main(String[] args) {
	        Estudiante estudiante = new Estudiante("Daniel Rodríguez");

	        estudiante.agregarCalificacion(4.5);
	        estudiante.agregarCalificacion(3.8);
	        estudiante.agregarCalificacion(2.9);
	        estudiante.agregarCalificacion(5.0);
	        estudiante.agregarCalificacion(3.2);

	        estudiante.agregarCalificacion(6.0); 

	        estudiante.agregarCalificacion(4.0); 

	        estudiante.mostrarDatos();
	    }
	

}
