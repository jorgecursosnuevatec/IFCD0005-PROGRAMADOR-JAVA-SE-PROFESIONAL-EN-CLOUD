/**
 * 
 */
package com.jgr.herencia.test.modelo;

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
	private static Movimiento mvto;
	private static List<Movimiento> movimientos;
	private static final int limMvtos =3;
	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		
		movimientos = new ArrayList<>();
		c1 = new CuentaMovimiento(200);
		
		for (int i=0;i<limMvtos;i++) {
			mvto = new Movimiento();
			
			if (i%2==0) {
				mvto.setTipo(TipoMovimiento.HABER);
				mvto.setImporte(i);
				c1.ingresar(i);
				
			}else {
				mvto.setTipo(TipoMovimiento.DEBE);
				mvto.setImporte(i);
				c1.extraer(i);
			}
			movimientos.add(mvto);
			c1.addMovimientoCuenta(mvto);
			
		}
	}

	/**
	 * Test method for {@link com.jgr.herencia.modelo.CuentaMovimiento#CuentaMovimiento()}.
	 */
	@Test
	void testCuentaMovimiento() {
		
		assertNotNull(c1,()->"Cuenta creada en setUp es nula");
		CuentaMovimiento c2 = new CuentaMovimiento();
		assertNotNull(c2,()->"Cuenta creada en testCuentaMovimiento es nula");
		
	}

	/**
	 * Test method for {@link com.jgr.herencia.modelo.CuentaMovimiento#CuentaMovimiento(double)}.
	 */
	@Test
	void testCuentaMovimientoDouble() {
		CuentaMovimiento c2 = new CuentaMovimiento(200);
		assertNotNull(c2,()->"Cuenta creada en testCuentaMovimientoDouble es nula");
	}

	/**
	 * Test method for {@link com.jgr.herencia.modelo.CuentaMovimiento#getMovimientosCuenta()}.
	 */
	@Test
	void testGetMovimientosCuenta() {
		
		assertEquals(limMvtos,c1.getMovimientosCuenta().size(),()->"No se han cargado todos los movimientos");
			
		
	}

	/**
	 * Test method for {@link com.jgr.herencia.modelo.CuentaMovimiento#setMovimientosCuenta(java.util.List)}.
	 */
	@Test
	void testSetMovimientosCuenta() {
		
		CuentaMovimiento c2 = new CuentaMovimiento(200);
		c2.setMovimientosCuenta(movimientos);		
		assertEquals(limMvtos,c2.getMovimientosCuenta().size(),()->"No se han cargado todos los movimientos");
	}

	/**
	 * Test method for {@link com.jgr.herencia.modelo.CuentaMovimiento#addMovimientoCuenta(com.jgr.herencia.modelo.Movimiento)}.
	 */
	@Test
	void testAddMovimientoCuenta() {
		Movimiento mvtoMetodo= new Movimiento(50,TipoMovimiento.HABER);		
		CuentaMovimiento c2 = new CuentaMovimiento(200);
		c2.addMovimientoCuenta(mvtoMetodo);
		assertEquals(mvtoMetodo,c2.buscaMovimientoCuenta(mvtoMetodo),()->"Movimiento no encontrado");
	}

	/**
	 * Test method for {@link com.jgr.herencia.modelo.CuentaMovimiento#buscaMovimientoCuenta(com.jgr.herencia.modelo.Movimiento)}.
	 */
	@Test
	void testBuscaMovimientoCuenta() {
		
		Movimiento mvtoMetodo= movimientos.get(0);		
		CuentaMovimiento c2 = c1;
		assertEquals(mvtoMetodo,c2.buscaMovimientoCuenta(mvtoMetodo),()->"Movimiento no encontrado");
		

	}

	/**
	 * Test method for {@link com.jgr.herencia.modelo.CuentaMovimiento#borraMovimientoCuenta(com.jgr.herencia.modelo.Movimiento)}.
	 */
	@Test
	void testBorraMovimientoCuenta() {
		
		CuentaMovimiento c2 = c1;
		Movimiento mvtoMetodo= movimientos.get(0);		
		assertNotNull(c2.buscaMovimientoCuenta(mvtoMetodo),()->"El movimiento a probar no existe");
		c2.borraMovimientoCuenta(mvtoMetodo);
		assertNull(c2.buscaMovimientoCuenta(mvtoMetodo),()->"El movimiento no deberia existir");
		
	}

}
