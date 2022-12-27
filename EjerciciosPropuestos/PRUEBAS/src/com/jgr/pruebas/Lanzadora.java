package com.jgr.pruebas;



import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Date;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;


public class Lanzadora {

	public static void main(String[] args) {
	Empleado emp = new Empleado();
	
	Gson gson = new Gson();
	
	emp.setDepartamento("Departamento");
	emp.setFechaIngreso(new Date());
	emp.setNombre("Nombre");
	emp.setSalario(1.0);
	
	String json = gson.toJson(emp);
	

	/** The cursos. */
	List<Empleado> empleados;	
	
	/** The fichero empleados. */
	File ficheroEmpleados;
	
	/** The nom fichero. */
	final String nomFichero="nombreFichero.json";
	
	/** The primera vez. */
	boolean primeraVez;
	
	Path ruta= Path.of(nomFichero);
	
	var archivo = new File(nomFichero);
	archivo.exists();
	System.out.println(archivo.exists());
	
	if(!archivo.exists()) {			
		
		try {
			Files.createFile(ruta);
		} catch (IOException e) {
			System.out.println("Error al crear fichero");			
			e.printStackTrace();
		}
		
	}
	System.out.println(archivo.exists());
	
	
	
	
	//escribir
	try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomFichero,true))) {
		JsonWriter writer = new JsonWriter(bw);
		writer.beginObject();
		writer.name("nombre").value(emp.getNombre());
		writer.name("fechaIngreso").value(emp.getFechaIngreso().toString());
		writer.name("salario").value(emp.getSalario());
		writer.name("departamento").value(emp.getDepartamento());
		writer.endObject();
		
	   
	} catch (IOException ex) {
	    System.out.println("error que te cagas");
	    ex.getStackTrace();
	}
	
	//leer
	/*
	 while (reader.hasNext()) {
	       String name = reader.nextName();
	       if (name.equals("id")) {
	         id = reader.nextLong();
	       } else if (name.equals("text")) {
	         text = reader.nextString();
	       } else if (name.equals("geo") && reader.peek() != JsonToken.NULL) {
	         geo = readDoublesArray(reader);
	       } else if (name.equals("user")) {
	         user = readUser(reader);
	       } else {
	         reader.skipValue();
	       }
	     }
	     reader.endObject();
	     return new Message(id, text, user, geo);
	   }
	
	*/
	try (BufferedReader bw = new BufferedReader(new FileReader(nomFichero))) {
		JsonReader reader = new JsonReader(bw);
		//https://www.javadoc.io/doc/com.google.code.gson/gson/2.8.0/com/google/gson/stream/JsonReader.html
		
		reader.beginObject();
		while (reader.hasNext()) {
			String nombre = reader.nextName();
			System.out.println("Leyendo el json->"+nombre);
			
		}
		
		
		
	   
	} catch (IOException ex) {
	    System.out.println("error que te cagas");
	    ex.getStackTrace();
	}
		
	}

}
