/**
 * 
 */
package com.jgr.herencia.test.modelo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jgr.herencia.auxiliar.TipoMovimiento;
import com.jgr.herencia.modelo.CuentaMovimiento;
import com.jgr.herencia.modelo.Movimiento;

/**
 * @author JORGE
 *
 */
class CuentaMovimientoTest {
	
	private static CuentaMovimiento c1;
	
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		
		c1 = new CuentaMovimiento(200);
		
	
	}

	
	@Test
	void testCuentaMovimiento() {
		
		assertNotNull(c1,()->"Cuenta creada en setUp es nula");
		CuentaMovimiento c2 = new CuentaMovimiento();
		assertNotNull(c2,()->"Cuenta creada en testCuentaMovimiento es nula");
		
	}

	
	@Test
	void testCuentaMovimientoDouble() {
		CuentaMovimiento c2 = new CuentaMovimiento(200);
		assertNotNull(c2,()->"Cuenta creada en testCuentaMovimientoDouble es nula");
	}

	
	@Test
	void testGetMovimientosCuenta() {
		
		CuentaMovimiento cm2= new CuentaMovimiento(200,100);		
		cm2.extraer(200);
		cm2.ingresar(200);		
		assertEquals(2,cm2.getMovimientosCuenta().size(),()->"No se han cargado todos los movimientos");		
			
			
		
	}

	
	@Test
	void testExtraer() {
		
		CuentaMovimiento c2 = new CuentaMovimiento(200,200);
		c2.extraer(200);
		assertEquals(0,c2.getSaldo(),()->"no coincide el saldo");
				
		
	}

	
	@Test
	void testIngresar() {
				
		CuentaMovimiento c2 = new CuentaMovimiento(200,200);
		c2.ingresar(1.0);
		assertEquals(201.0,c2.getSaldo(),()->"No coincide el saldo despues de ingresar");
		assertEquals(1,c2.getMovimientosCuenta().size(),()->"No se ha guardado el movimiento");
		assertEquals(1,c2.buscaMovimientoCuentaPorTipo(TipoMovimiento.HABER).size(),()->"No se ha guardado el movimiento");
		
	}

	
	@Test
	void testBuscaMovimientoCuenta() {
		
		CuentaMovimiento c2 = new CuentaMovimiento(200,200);
		c2.ingresar(1.0);
		Movimiento m1 = c2.getMovimientosCuenta().get(0);		
		assertEquals(m1,
				c2.getMovimientosCuenta().get(0),()->"No es igual el movimiento recuperado que el guardado");
		

	}
	@Test
	void testbuscaMovimientoCuentaPorTipo() {
		
		CuentaMovimiento c2 = new CuentaMovimiento(200,200);
		c2.ingresar(1.0);		
		assertEquals(1,c2.buscaMovimientoCuentaPorTipo(TipoMovimiento.HABER).size(),()->"No se ha encontrado el movimiento al haber");
		Movimiento mov  = c2.getMovimientosCuenta().get(0);
		assertTrue(mov.equals(c2.buscaMovimientoCuentaPorTipo(TipoMovimiento.HABER).get(0)),()->"No son iguales los movimientos");
		
	}

	
	@Test
	void testBorraMovimientoCuenta() {
		
		CuentaMovimiento c2 = new CuentaMovimiento(200);
		Movimiento mov = new Movimiento(25,TipoMovimiento.DEBE);
		c2.addMovimientoCuenta(mov);		
		assertEquals(1,c2.getMovimientosCuenta().size(),()->"Movimiento no guardado");
		c2.borraMovimientoCuenta(mov);
		assertNull(c2.buscaMovimientoCuenta(mov),()->"El movimiento no se ha borrado");
		
		
		
	}
	@Test
	void testaddMovimientoCuenta() {
		CuentaMovimiento c2 = new CuentaMovimiento(200);
		double saldoAnt = c2.getSaldo();
		Movimiento mov = new Movimiento(25,TipoMovimiento.DEBE);
		c2.addMovimientoCuenta(mov);		
		assertEquals(1,c2.getMovimientosCuenta().size(),()->"Movimiento no guardado");
		assertTrue(saldoAnt==(c2.getSaldo()+mov.getImporte()),()->"No coincide el saldo");
		c2.borraMovimientoCuenta(mov);
		assertNull(c2.buscaMovimientoCuenta(mov),()->"El movimiento no se ha borrado");
		
		
		
	}

}
