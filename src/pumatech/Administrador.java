/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pumatech;
import java.util.List;
/**
 *
 * @author ivanos
 */
import java.util.HashMap;
import java.util.Map;

public class Administrador {
    private static final Map<String, String> usuarios = new HashMap<>();

    static {
        usuarios.put("admin", "1234"); // Usuario y contraseña de ejemplo
    }

    public static boolean login(String usuario, String contrasena) {
        return usuarios.containsKey(usuario) && usuarios.get(usuario).equals(contrasena);
    }
}

