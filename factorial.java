public long factorial(long n)
// Assumption:  n is not negative. 
{
  if (n == 0)
    return 1;				// Base case
  else
    return n * factorial(n-1);	// General case
}
