package edu.rit.se;

public class ColorHex implements Color
{
	private final String hex;

	public ColorHex(String hex) throws ColorException
	{
		// We only support 6 character strings (two each for R,G,B)
		if (hex.length() != 6) { throw new ColorException(hex); }

		/* Implement this */

		/*
		 * Hint: String.substring(), Integer.parseInt()
		 * 
		 * Integer.parseInt() throws a NumberFormatException, which you
		 * can catch and then re-throw as a ColorException.
		 */

		this.hex = hex;
	}

	@Override
	public ColorCymk toCymk()
	{
		/* Implement this */

		return new ColorCymk(0, 0, 0, 0);
	}

	@Override
	public ColorHex toHex() throws ColorException
	{
		/* Implement this */

		return new ColorHex("000000");
	}

	@Override
	public ColorRgb toRgb()
	{
		/* Implement this */

		return new ColorRgb(0, 0, 0);
	}

	@Override
	public String toString()
	{
		return "0x" + hex.toUpperCase();
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof ColorHex) {
			ColorHex that = (ColorHex) o;

			return this.hex.equals(that.hex);
		} else {
			return false;
		}
	}
}
