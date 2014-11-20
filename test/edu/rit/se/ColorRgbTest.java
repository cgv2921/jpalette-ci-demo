package edu.rit.se;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColorRgbTest
{
	@Test
	public void testToRgbReflexive()
	{
		ColorRgb rgb = new ColorRgb(255, 255, 255);
		assertEquals(rgb, rgb.toRgb());

		ColorRgb rgb1 = new ColorRgb(100, 100, 100);
		assertEquals(rgb1, rgb1.toRgb());
	}

	@Test
	public void testToHex()
	{
		ColorRgb rgb = new ColorRgb(255, 255, 255);
		ColorHex hex;
		try {
			hex = new ColorHex("FFFFFF");
			assertEquals(hex.toString(), rgb.toHex().toString());
		} catch (ColorException e) {
			fail(e.getMessage());
		}

		ColorRgb rgb1 = new ColorRgb(206, 206, 206);
		ColorHex hex1;
		try {
			hex1 = new ColorHex("CECECE");
			assertEquals(hex1.toString(), rgb1.toHex().toString());
		} catch (ColorException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void testToCymk()
	{
		ColorRgb rgb = new ColorRgb(255, 255, 255);
		ColorCymk cymk = new ColorCymk(0.0, 0.0, 0.0, 0.0);

		assertEquals(cymk, rgb.toCymk());

		/* Don't worry about this case */
		
		ColorRgb rgb1 = new ColorRgb(206, 206, 206);
		ColorCymk cymk1 = new ColorCymk(0.0, 0.0, 0.0, 0.192);

		assertEquals(cymk1, rgb1.toCymk());
	}

}
