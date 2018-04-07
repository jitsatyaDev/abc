class ArraySum
{
	public static void main(String [] args)
{
		int [] a= {23,34,78,15,85,22,88};
		int sum=0;
		for (int i=0;i<a.length;i++){
			sum= sum+a[i];
		}
		System.out.println("The sum of all elements of the array is: " +  sum);
}
}