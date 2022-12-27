package ej1;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class LeerJsonEj1 {

    public static void main(String[] args) {

        // Creo una instancia de GSON
        Gson gson = new Gson();

        // Leo el fichero
        String fichero = "";

        try (BufferedReader br = new BufferedReader(new FileReader("datos.json"))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                fichero += linea;
            }

        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Creo un properties y lo asocio al JSON (solo objeto con propiedades, sin arrays)
        Properties properties = gson.fromJson(fichero, Properties.class);

        // Muestro las propiedades
        System.out.println(properties.get("nombre"));
        System.out.println(properties.get("apellidos"));
        System.out.println(properties.get("edad"));

    }

}
