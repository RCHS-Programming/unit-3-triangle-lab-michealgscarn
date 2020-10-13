//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.Scanner;
import java.lang.Math.*; 

public class Triangle
{
	private int sideA, sideB, sideC;

	public Triangle(int a, int b, int c)
	{
    sideA=a;
    sideB=b;
    sideC=c;
	}

	public int getPerimeter( )
	{
    return sideA+sideB+sideC;
	}

	public double getArea( )
	{
    double perimeter = getPerimeter( );
    double s=perimeter/2;
		return Math.sqrt(s*(s-sideA)*(s-sideB)*(s-sideC));
	}
}