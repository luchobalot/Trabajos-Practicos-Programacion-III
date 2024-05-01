package EjercicioEntregable9;

public class Principal {
	public static void main(String[] args) {
		// Se crea un Vendedor.
		Empleado vendedor1 = new Vendedores("Luciano", 43795841, "Garay 4829",2022, 24);
		vendedor1.imprimirRecibo();
		
		// Se crea un Administrativo.
		Empleado administrativo1 = new Administrativos("Pedro", 35689412, "Alem 123", 2017, true);
		administrativo1.imprimirRecibo();
		
		Empleado repartidor1 = new Repartidores("Juancito", 123456789, "11 de Abril 870", 1998, 56);
		repartidor1.imprimirRecibo();
	}

}
