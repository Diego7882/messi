package proyecto;
public class main {
	public static void main(String[] args) {
		EstudianteService service = new EstudianteService();
				service.Registrar("Leo", "Messi",33016244, "quinto");
				service.Registrar("Angel", "Di Maria", 30222111, "sexto");
				service.Registrar("Dibu", "Martinez", 31222333, "cuarto");
				service.Registrar("Julian", "Alvarez", 14972723, "quinto");
				service.Registrar("Lautaro", "Martinez", 38222555, "sexto");
				service.Registrar("Rodrigo", "De Paul", 36222666, "cuarto");
				service.Registrar("Nico", "Otamendi", 32222777, "quinto");
				service.Registrar("Enzo", "Fernandez", 42222888, "sexto");
				service.Registrar("Alexis", "Mac Allister", 39222999, "cuarto");
				service.Registrar("Paulo", "Dybala", 35222000, "quinto");
				System.out.println(" LISTA DE ESTUDIANTES");
				service.ListarTodo();
				System.out.println("\n ELIMINAR ID 4 ");
				service.Eliminar(4);
				System.out.println("\n ACTUALIZAR ID 6 ");
				service.Actualizar("Rodrigo", "De Paul", 36222666, "sexto");
				System.out.println("\n ACTUALIZAR ID 8 ");
				service.Actualizar("Enzo", "Fernandez", 42222888, "quinto");
				System.out.println("\n  LISTA FINAL ");
				service.ListarTodo();
				}
}

