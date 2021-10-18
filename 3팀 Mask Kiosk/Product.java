

public class Product
{
	int pNum;			//-- 품번
	String productName;	//-- 상품 이름
	int price;			//-- 가격
	int stock;			//-- 재고

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