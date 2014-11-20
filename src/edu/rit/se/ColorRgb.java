package edu.rit.se;

public class ColorRgb implements Color
{
	private final int r, g, b;

	public ColorRgb(int r, int g, int b)
	{
		this.r = r;
		this.g = g;
		this.b = b;
	}

	@Override
	public ColorCymk toCymk()
	{
		double R = (double) r/255;
		double G = (double) g/255;
		double B = (double) b/255;
		double K = 1 - Util.varMax(R, G, B);
		double C = (1 - R - K) / (1 - K);
		double Y = (1 - B - K) / (1 - K);
		double M = (1 - G - K) / (1 - K);

		/*
		 * Hint: when dividing two integers, you need to cast the
		 * divisor and dividend to floating-point numbers (doubles)
		 */

		/*
		 * Hint: use Util.varMax() where max() is used in the formula
		 */

		return new ColorCymk(C, Y, M, K);
	}

	@Override
	public ColorHex toHex() throws ColorException
	{
		String result = Integer.toHexString(r) + 
				Integer.toHexString(g) +
				Integer.toHexString(b);

		/*
		 * Hint: Integer.toHexString()
		 */

		return new ColorHex(result);
	}

	@Override
	public ColorRgb toRgb()
	{
		/* Implement this */

		return new ColorRgb(r, g, b);
	}

	@Override
	public String toString()
	{
		String result;
		result = String.format("(r:%d,g:%d,b:%d)", r, g, b);

		return result;
	}

	@Override
	public boolean equals(Object o)
	{
		if (o instanceof ColorRgb) {
			ColorRgb that = (ColorRgb) o;

			return (this.r == that.r) && (this.g == that.g)
				&& (this.b == that.b);
		} else {
			return false;
		}
	}
}
