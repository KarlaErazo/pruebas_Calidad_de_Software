package test;


import org.junit.After;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import pruebas_calidad_de_software.BRException;
import pruebas_calidad_de_software.EmpleadorBR;
import pruebas_calidad_de_software.TipoEmpleado;


public class JUnitTestEmpleadorBR {
	 
	TipoEmpleado TE = new TipoEmpleado();

	public JUnitTestEmpleadorBR() {
	}
	
	@BeforeClass
	public static void setUpClass() {
	}
	
	@BeforeClass
	public static void tearDownClass() {
	}
	
	@Before
	public void setUp() {
	}
	
	@After
	public void tearDown() {
		
	}

	
	@Test
	public void testCalculaSalarioNeto1() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioNeto(2000.0f);
		float resultadoEsperado = 1640.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioNeto2() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioNeto(15000.0f);
		float resultadoEsperado = 1230.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioNeto3() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioNeto(1499.0f);
		float resultadoEsperado = 1259.9916f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioNeto4() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioNeto(1250.0f);
		float resultadoEsperado = 1050.9916f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioNeto5() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioNeto(1000.0f);
		float resultadoEsperado = 840.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioNeto6() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioNeto(999.99f);
		float resultadoEsperado = 999.99f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}

	@Test
	public void testCalculaSalarioNeto7() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioNeto(500.0f);
		float resultadoEsperado = 500.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioNeto8() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioNeto(0.0f);
		float resultadoEsperado = 0.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test(expected = BRException.class)
	public void testCalculaSalarioNeto() {
		EmpleadorBR.calculaSalarioNeto(-1.0f);
	}
	
	@Test
	public void testCalculaSalarioBruto1() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioBruto(TE.getVendedor(), 2000.0f, 8.8F);
		float resultadoEsperado = 1360.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	@Test
	public void testCalculaSalarioBruto2() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioBruto(
		TE.getEncargado(), 1500.0f, 3.0f);
		float resultadoEsperado = 1260.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioBruto3() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioBruto(
		TE.getEncargado(), 1499.99f, 0.0f);
		float resultadoEsperado = 1100.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioBruto4() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioBruto(
		TE.getEncargado(), 1250.0f, 8.0f);
		float resultadoEsperado = 1760.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioBruto5() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioBruto(
		TE.getEncargado(), 1000.0f, 0.0f);
		float resultadoEsperado = 1600.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioBruto6() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioBruto(
		TE.getEncargado(), 999.99f, 3.0f);
		float resultadoEsperado = 1560.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test
	public void testCalculaSalarioBruto7() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioBruto(
		TE.getEncargado(), 500.0f, 3.0f);
		float resultadoEsperado = 1500.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	@Test
	public void testCalculaSalarioBruto8() {
		float resultadoReal = (float) EmpleadorBR.calculaSalarioBruto(
		TE.getEncargado(), 0.0f, 8.0f);
		float resultadoEsperado = 1660.0f;
		assertEquals(resultadoEsperado, resultadoReal, 0.01);
		
	}
	
	@Test (expected =BRException.class)
	public void testCalculaSalarioBruto9() {
		EmpleadorBR.calculaSalarioBruto (
			TE.getVendedor() , -1.0f, 8.0f);
			
		}
	 @Test (expected =BRException.class)
	public void testCalculaSalarioBruto10() {
		EmpleadorBR.calculaSalarioBruto (
			TE.getVendedor() , 1500.0f, -1.0f); 
			
		}
	@Test (expected =BRException.class)
	public void testCalculaSalarioBruto11() {
		EmpleadorBR.calculaSalarioBruto (
			1, 1500.0f, 8.0f);
			
		}
	
	
	}

