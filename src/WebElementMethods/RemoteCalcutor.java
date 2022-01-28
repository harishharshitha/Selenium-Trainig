package WebElementMethods;

public abstract class RemoteCalcutor implements Calcutor
{
	@Override
	public int add(int...arr)
	{
		int sum=0;
		for(int a:arr)
		{
			sum=sum+a;
		}
		return sum;
	}

}
