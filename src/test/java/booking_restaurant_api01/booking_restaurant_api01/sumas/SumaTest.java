package booking_restaurant_api01.booking_restaurant_api01.sumas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import booking_restaurant_api01.booking_restaurant_api01.suma.Suma;

public class SumaTest {
	
	Suma suma=new Suma();
	
	@Before
	public void before() {
		System.out.println("before...");
	}
	
	@After
	public void after() {
		System.out.println("After...");
	}
	
	
	@Test
	public void sumaTest() {
		System.out.println("test suma..");
		int resultadoEsperado=3;
		int resultado= this.suma.suma(1,2);
		assertEquals(resultadoEsperado, resultado);
	}

}
