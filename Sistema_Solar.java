package planeta;

public class Sistema_Solar {
	    public static void main(String[] args) {
	        Planeta jupiter = new Planeta(
	            "Júpiter", 79, 1.898e27, 1.431e15, 139820, 778, Tipo_Planeta.GASEOSO, true
	        );

	        Planeta marte = new Planeta(
	            "Marte", 2, 6.417e23, 1.6318e11, 6779, 228, Tipo_Planeta.TERRESTRE, true
	        );

	        System.out.println("🪐 PLANETA 1:");
	        jupiter.imprimirDatos();
	        System.out.printf("📊 Densidad: %.2f kg/km³%n", jupiter.calcularDensidad());
	        System.out.println("🌌 ¿Es planeta exterior? " + (jupiter.esExterior() ? "Sí" : "No"));

	        System.out.println("\n🪐 PLANETA 2:");
	        marte.imprimirDatos();
	        System.out.printf("📊 Densidad: %.2f kg/km³%n", marte.calcularDensidad());
	        System.out.println("🌌 ¿Es planeta exterior? " + (marte.esExterior() ? "Sí" : "No"));
	    }
	

}
