package ejercitacion11;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/empresa_db";
    private static final String USER = "root";
    private static final String PASSWORD = "usbw"; 

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(URL, USER, PASSWORD)) {
            System.out.println("Conexión establecida con éxito.\n");
            limpiarTabla(conn);
            insertarVendedor(conn, "Alexis", "Cuello", "3453221", "Electronica", true);
            insertarVendedor(conn, "Iker", "Muniain", "32333444", "Indumentaria", true);
            insertarVendedor(conn, "Facundo", "Farias", "35555666", "Ferreteria", false);
            insertarVendedor(conn, "Luciano", "Vietto", "38777888", "Calzado", true);
            insertarVendedor(conn, "Leo", "Messi", "23422434", "Fulbo", false);

            System.out.println("--- LISTA INICIAL (5 VENDEDORES) ---");
            listarVendedores(conn);
            borrarVendedor(conn, 4);
            modificarVendedor(conn, 2, "Leandro", "Romagnoli", "Potrero");
            System.out.println("\n--- LISTA FINAL TRAS MODIFICACIONES ---");
            listarVendedores(conn);

        } catch (SQLException e) {
            System.err.println("Error en la base de datos: " + e.getMessage());
        }
    }
    public static void insertarVendedor(Connection conn, String nombre, String apellido, String dni, String rubro, boolean actual) throws SQLException {
        String sql = "INSERT INTO vendedores (nombre, apellido, dni, rubro, actual) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nombre);
            pstmt.setString(2, apellido);
            pstmt.setString(3, dni);
            pstmt.setString(4, rubro);
            pstmt.setBoolean(5, actual);
            pstmt.executeUpdate();
        }
    }
    public static void listarVendedores(Connection conn) throws SQLException {
        String sql = "SELECT * FROM vendedores";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                System.out.printf("ID: %d | Nombre: %s %s | DNI: %s | Rubro: %s | Activo: %b%n",
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        rs.getString("dni"),
                        rs.getString("rubro"),
                        rs.getBoolean("actual"));
            }
        }
    }
    public static void modificarVendedor(Connection conn, int id, String nuevoNombre, String nuevoApellido, String nuevoRubro) throws SQLException {
        String sql = "UPDATE vendedores SET nombre = ?, apellido = ?, rubro = ? WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nuevoNombre);
            pstmt.setString(2, nuevoApellido);
            pstmt.setString(3, nuevoRubro);
            pstmt.setInt(4, id);
            int filas = pstmt.executeUpdate();
            if (filas > 0) {
                System.out.println("Vendedor con ID " + id + " actualizado correctamente.");
            }
        }
    }
    public static void borrarVendedor(Connection conn, int id) throws SQLException {
        String sql = "DELETE FROM vendedores WHERE id = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            int filas = pstmt.executeUpdate();
            if (filas > 0) {
                System.out.println("Vendedor con ID " + id + " eliminado correctamente.");
            }
        }
    }
    private static void limpiarTabla(Connection conn) throws SQLException {
        try (Statement stmt = conn.createStatement()) {
            stmt.executeUpdate("TRUNCATE TABLE vendedores");
        }
    }
}