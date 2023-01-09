package testing;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import service.CiudadesService;

class TestCiudades {
	static CiudadesService service=new CiudadesService();
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		service.guardarCiudad("Murcia", 100000, "España");
		service.guardarCiudad("Madrid", 3100000, "España");
		service.guardarCiudad("Paris", 6100000, "Francia");
		service.guardarCiudad("Venecia", 400000, "Italia");
	}

	@Test
	void testCiudadMasPoblada() {
		assertEquals("Paris", service.ciudadMasPoblada().getNombre());
	}

	@Test
	void testCiudadesPorPais() {
		assertEquals(2,service.ciudadesPorPais("España").size());
		assertEquals(0,service.ciudadesPorPais("Portugal").size());
		assertEquals(1,service.ciudadesPorPais("Italia").size());
	}

}
