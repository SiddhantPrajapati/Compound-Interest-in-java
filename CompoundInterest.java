import java.util.*;
class CompoundInterest implements Interest 
{
	public double getInterest(double p, double r, double n) 
	{
		double d = 1 + (r/100);
		double interest = (p * Math.pow(d, n))-p;
		return interest;
	}
}
	