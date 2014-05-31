package TravessiaDeserto.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import TravessiaDeserto.TravessiaDeserto;


public class TravessiaDesertoTest {
	TravessiaDeserto tdd;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {

		tdd = new TravessiaDeserto();
		tdd.inicializaJogo();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInit() {

		assertEquals(tdd.getPos(), 0);

	}

	@Test
	public void testAvancar() {

		assertTrue(tdd.getFuel() > 0);
		int a = (int) tdd.getPos();
		int av = tdd.getFuel();

		tdd.avancar();
		assertEquals(a + 1, tdd.getPos());
		assertEquals(av - 1, tdd.getFuel());

		while (tdd.getFuel() > 0) {
			tdd.descarregar();
		}
		a = (int) tdd.getPos();
		av = tdd.getFuel();
		tdd.avancar();
		assertEquals(tdd.getPos(), a);
		assertEquals(tdd.getFuel(), av);

	}
	

	@Test
	public void testVoltar() {

		tdd.avancar();
		tdd.avancar();
		assertTrue(tdd.getPos() > 0);
		assertTrue(tdd.getFuel() > 0);
		int v = tdd.getPos();
		int vo = tdd.getFuel();
		tdd.voltar();
		assertEquals(v - 1, tdd.getPos());
		assertEquals(vo - 1, tdd.getFuel());

		while (tdd.getFuel() > 0) {
			tdd.descarregar();
		}
		v = tdd.getPos();
		vo = tdd.getFuel();
		tdd.voltar();
		assertEquals(tdd.getPos(), v);
		assertEquals(tdd.getFuel(), vo);

	}
	
	
	@Test
	public void testDescarregar() {
		int mapPos = tdd.getMap(tdd.getPos());
		int fuel = tdd.getFuel();

		assertTrue(tdd.getFuel() > 0);
		tdd.descarregar();
		assertEquals(tdd.getFuel(), fuel - 1);
		assertEquals(tdd.getMap(tdd.getPos()), mapPos + 1);
		tdd.avancar();
		tdd.descarregar();
		assertEquals(tdd.getFuel(), fuel - 3);
		assertEquals(tdd.getMap(tdd.getPos()), mapPos + 1);

		tdd.voltar();
		tdd.descarregar();
		assertEquals(tdd.getFuel(), fuel - 1);
		assertEquals(tdd.getMap(tdd.getPos()), mapPos + 2);

		while (tdd.getFuel() > 0) {
			tdd.descarregar();
		}

		mapPos = tdd.getMap(tdd.getPos());
		fuel = tdd.getFuel();
		tdd.descarregar();
		assertEquals(tdd.getFuel(), fuel);
		assertEquals(tdd.getMap(tdd.getPos()), mapPos);

	}
	
	
	@Test
	public void testCarregar() {
		tdd.inicializaJogo();
		int mapPos = tdd.getMap(tdd.getPos());
		int fuel = tdd.getFuel();

		assert (tdd.getMap(mapPos) > 0);
		tdd.avancar();
		tdd.descarregar();
		tdd.carregar();
		assertEquals(tdd.getFuel(), fuel - 1);
		assertEquals(tdd.getMap(tdd.getPos()), mapPos);

		while (tdd.getFuel() > 0) {
			tdd.descarregar();
		}

		mapPos = tdd.getMap(tdd.getPos());
		fuel = tdd.getFuel();
		tdd.carregar();
		assertEquals(tdd.getMap(tdd.getPos()), mapPos - 1);
		assertEquals(tdd.getFuel(), fuel + 1);

	}

	@Test
	public void testGameOver() {
		tdd.inicializaJogo();
		while (tdd.getPos() >= 0 && tdd.getFuel() > 0) {
			tdd.avancar();
		}
		assertEquals(tdd.isGameOver(), true);
	}
}
