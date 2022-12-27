package ej3;

import com.google.gson.Gson;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LeerJsonEj3 {

    public static void main(String[] args) {

        // Creo una instancia de GSON
        Gson gson = new Gson();

        // Creo una persona
        Persona persona = new Persona("F", "U", 20);

        // Obtengo el JSON de la persona
        String json = gson.toJson(persona);

        // Muestro el resultado
        System.out.println(json);

        // Escribo el fichero
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("datos_persona.json"))) {
            bw.write(json);
            System.out.println("Fichero creado");
        } catch (IOException ex) {
            Logger.getLogger(LeerJsonEj3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
