/*========================================
  ���� Ŭ���� ��� ����
  -���(Inheritance)
========================================*/
//�����ڿ� Ŭ���� ��Ӱ��� ����
//���� Ŭ������ ���� Ŭ���� ����� ��ӹ�����
//�����ڴ� ��� ��󿡼� ���ܵȴ�
//�׸��� ���� Ŭ������ �����ڰ� ȣ��� ��
//�ڵ����� ���� Ŭ������ �����ڰ� ȣ��ȴ�
//�̶� ȣ��Ǵ� ���� Ŭ������ �����ڴ� 
//�μ��� ���� ������(default ������)�� �ȴ�

//����Ŭ���� �� ���� Ŭ������ �����ϴ� ��������
//����Ŭ������ �����ڸ� �������� �ʰų�
//�μ��� ���� �����ڸ��� ������ ���
//��������� ���� Ŭ�������� ���� Ŭ������ �����ڸ� ȣ������ �ʾƵ�
//�ƹ��� ������ �߻����� ������
//���� Ŭ������ ���ڰ� �ִ� �����ڸ� �����ϴ� ��쿡�� �����ؾ��Ѵ�

//���� ��� ��������...
/*
	class A_class
	{
		A_class(int n)
		{
		}
	}
	class B_class Extends A_class
	{
		B_class( )
		{
			super(10);
			...
			...
		}
	}
*/


//Rect108Ŭ������ circle108Ŭ������ �θ� Ŭ����
class SuperTest108
{
	protected double area;//default�� ������Ƽ�� ���̴� ��ӿ����� ���̰� �־ protected�� ���Դ�?? �� ����̴�! �����ص��ȴ�.
	private String title; //��ӹ��� Ŭ���������� ���� ���� ���� �� �� ����. (�θ���� ���� �ݰ� �װ� ��� �ȵ���)---�⺻�� �����ϰ� ��������� ��������
	
	//�θ� Ŭ������ ���ھ��� ����� ���� ������
	public SuperTest108()
	{
		System.out.println("SuperTest108...���� ���� ������");
	}
	//�θ� Ŭ������ ���ڿ��� ���ڷ� �޴� ����� ���� ������
	public SuperTest108(String title)
	{
		this.title=title;
		System.out.println("SuperTest108...���ڿ��� ���ڷ� �޴� ������");
	}
	public void write()
	{
		System.out.println();
	}
}
//supertest108 Ŭ������ ��ӹ޴� �ڽ� Ŭ����
class Rect108 extends SuperTest108
{	
	/*�����ڴ� ��ӹ��� ���ؼ� �� ��������
	protected double area;
	public void write()
	{
		System.out.println(title+"-"+area);
	}
	*/
	private int w,h;
	public Rect108()
	{
		//�ڵ����� ����
		//super(); �� superTest108();
	}
	public void calc(int w, int h)
	{
		this.w=w;
		this.h=h;
		area=(double)this.w*this.h;
		//super.area=(double)this.w*this.h;
		//this.area=(double)this.w*this.h;

		write();
	}
	public void wirte()
	{
		System.out.println("w:"+w);(",h:"+h);
		System.out.println("tkrkrgud-"+area);
	}
	//�ظ޼ҵ� �������̵�
	//���� Ŭ������ ��ӹ��� ���� Ŭ��������
	//���� Ŭ������ ���ǵ� �޼ҵ带 �ٽ� �����ϴ� ������(������)
	//��ü ���� ���α׷����� Ư¡�� �������� ��Ÿ����
	//������(�����ε�)�� �ݵ�� ��� ���迡 �־���ϸ�
	//�޼ҵ��� �̸�, ����Ÿ��, �Ű������� ������ Ÿ���� ������ ��ġ�ؾ��Ѵ�.
}
//supertest108 Ŭ������ ��ӹ޴� �ڽ� Ŭ����
class Circle108 extends SuperTest108
{
	/*�����ڴ� ��ӹ��� ���ؼ� �� ��������
	protected double area;
	public void write()
	{
		System.out.println(title+"-"+area);
	}
	*/
	//default ������ �� �Ʒ��� ����� ���� �����ڰ� �ֱ� ������ �ڵ����� ���Ե��� �ʴ´�.
	public Circle108()
	//�ڽ� Ŭ������ ���ڿ��� ���ڷ� �޴� ����� ���� ������
	public Circle108(String title)
	{
		
	}
	public void calc(int r)
	{
		area=r*r*3.141592;
		write();
	}
}
//main() �޼ҵ带 �����ϰ� �ִ� �ܺ��� �ٸ� Ŭ���� 
public class Test108
{
	public static void main(strgint [] args)
	{
		Rect108 ob1=new Rect108();
		//-->SuperTest108..���� ���� ������(�θ�Ŭ������ ȣ��Ȱ�...)
		
		//Circle108 ob2 =new Circle108();
		//���� Circle108 Ŭ�������� �Ű������� �ʿ���ϴ� ����� ���� �����ڰ� ������� ������
		//�̷����� default �����ڰ� �ڵ����� ���Ե��� �ʴ� ��Ȳ(������ ����)

	    Circle108 ob2=new Circle108("��");
	}
}