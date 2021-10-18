public class Person
{
				
	String pName;	//이름
	String pNumber; //주민번호
	int num;        //수량

	public Person(String pName, String pNumber, int num)
	{
		this.pName = pName;
		this.pNumber = pNumber;
		this.num = num;
	}

	//이름

	public void setpName(String pName)
	{
		this.pName = pName;
	}

	public String getpName()
	{
		return pName;
	}
	
	//주민번호

	public void setpNumber(String pNumber)
	{
		this.pNumber = pNumber;
	}

	public String getpNumber()
	{
		return pNumber;
	}

	//수량

	public void setNumber(int num)
	{
		this.num = num;
	}

	public int getNumber()
	{
		return num;
	}

}