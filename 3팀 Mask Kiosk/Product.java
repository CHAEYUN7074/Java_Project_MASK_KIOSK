

public class Product
{
	int pNum;			//-- ǰ��
	String productName;	//-- ��ǰ �̸�
	int price;			//-- ����
	int stock;			//-- ���

	public Product(int a, String b, int c, int d)
	{
		pNum = a;		
		productName = b;		
		price = c;		
		stock = d;		
	}

	public void setpNum(int i)
	{
		pNum = i;		
	}

	public int getpNum()
	{
		return pNum;
	}

	public void setProductName(String s)
	{
		productName = s;		
	}

	public String getProductName()
	{
		return productName;
	}

	public void setPrice(int i)
	{
		price = i;		
	}

	public int getPrice()
	{
		return price;
	}


	public void setStock(int i)
	{
		stock = i;		
	}

	public int getStock()
	{
		return stock;
	}

}