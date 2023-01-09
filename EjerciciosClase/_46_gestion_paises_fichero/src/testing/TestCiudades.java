package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import Service.CiudadesService;

class TestCiudades {
	static CiudadesService service= new CiudadesService();  // Creo un objeto de la clase que quiero probar 
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service.nuevaCiudad("Murcia", 8000, "españa");
		service.nuevaCiudad("Madrid", 3000, "españa");
		service.nuevaCiudad("Paris", 450000, "francia");
		service.nuevaCiudad("Venecia", 1680, "italia");
	}

	@Test
	void testMasPoblada() {
		assertEquals("Paris", service.masPoblada().getNombre());  // compara el texto "paris" con el texto que devuelve el método
	
	}

	@Test
	void testCiudadesPais() {
		assertEquals(2, service.ciudadesPais("españa").size());
		assertEquals(0, service.ciudadesPais("portugal").size());
		assertEquals(1, service.ciudadesPais("italia").size());
	}

}
