public class Person
{
				
	String pName;	//�̸�
	String pNumber; //�ֹι�ȣ
	int num;        //����

	public Person(String pName, String pNumber, int num)
	{
		this.pName = pName;
		this.pNumber = pNumber;
		this.num = num;
	}

	//�̸�

	public void setpName(String pName)
	{
		this.pName = pName;
	}

	public String getpName()
	{
		return pName;
	}
	
	//�ֹι�ȣ

	public void setpNumber(String pNumber)
	{
		this.pNumber = pNumber;
	}

	public String getpNumber()
	{
		return pNumber;
	}

	//����

	public void setNumber(int num)
	{
		this.num = num;
	}

	public int getNumber()
	{
		return num;
	}

}