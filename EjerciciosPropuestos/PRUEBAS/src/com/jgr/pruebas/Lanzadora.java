package com.jgr.pruebas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.text.ParseException;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Lanzadora {

	public static void main(String[] args) throws ParseException {

		/** The cursos. */
		List<Empleado> empleados;

		/** The fichero empleados. */
		File ficheroEmpleados;

		/** The nom fichero. */
		final String nomFichero = "nombreFichero.json";

		/** The primera vez. */
		boolean primeraVez;

		Path ruta = Path.of(nomFichero);

		var archivo = new File(nomFichero);
		archivo.exists();
		System.out.println(archivo.exists());

		if (!archivo.exists()) {

			try {
				Files.createFile(ruta);
			} catch (IOException e) {
				System.out.println("Error al crear fichero");
				e.printStackTrace();
			}

		}

		Empleado emp = new Empleado();
		emp.setNombre("Nombre");
		emp.setDepartamento("Departamento");
		emp.setFechaIngreso(new Date());
		emp.setSalario(1.1);
		// Gson gson = new Gson();
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(emp);

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomFichero, false))) {
			bw.write(json);
			System.out.println("Fichero creado");
		} catch (IOException ex) {
			System.out.println("error que te cagas" + ex.toString());

		}

		String fichero = "";
		Empleado emp2 = new Empleado();
		try (BufferedReader br = new BufferedReader(new FileReader(nomFichero))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				fichero += linea;
			}
			System.out.println("Salida->" + gson.fromJson(fichero, Empleado.class));
			emp2 = gson.fromJson(fichero, Empleado.class);
			System.out.println("Empleado->" + emp.toString());
		} catch (FileNotFoundException ex) {
			System.out.println(ex.getMessage());
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
		}

	}// fin main
}
