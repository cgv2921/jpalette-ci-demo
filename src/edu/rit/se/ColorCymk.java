package edu.rit.se;

public class ColorCymk implements Color
{
	public final double c, y, m, k;

	/**
	 * <p>
	 * Each of the parameters c, y, m, and k is a fractional number between
	 * 0 and 1.
	 * </p>
	 */
	public ColorCymk(double c, double y, double m, double k)
	{
		this.c = c;
		this.y = y;
		this.m = m;
		this.k = k;
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
		String result;
		result = String.format("(c:%.3f,y:%.3f,m:%.3f,k:%.3f)", c, y,
			m, k);

		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 * 
	 * Since floating-point numbers are involved, equality must be
	 * determined within some acceptable error.
	 */
	@Override
	public boolean equals(Object o)
	{
		final double epsilon = .01;

		if (o instanceof ColorCymk) {
			ColorCymk that = (ColorCymk) o;

			boolean result = true;
			result &= Math.abs(this.c - that.c) < epsilon;
			result &= Math.abs(this.y - that.y) < epsilon;
			result &= Math.abs(this.m - that.m) < epsilon;
			result &= Math.abs(this.k - that.k) < epsilon;

			return result;
		} else {
			return false;
		}
	}
}
