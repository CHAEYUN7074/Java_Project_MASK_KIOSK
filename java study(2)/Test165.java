/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
/*
Set �� HashSet, TreeSet
������ �ǹ̰� ����
�ߺ��� ������� �ʴ� ����(�⺻)

��TreeSet<E> Ŭ����
java.util.TreeSet<E> Ŭ������
Set �������̽��� ����� SortedSet(�ڽ�) �������̽��� ������ Ŭ������
�����͸� �߰��ϸ� �����͵��� �ڵ����� �������� ������ ����ȴ�.
(���ſ��� �����Ͱ� ������ ��� �� ����..)

*/

import java.util.*;

public class Test165
{
	public static void main(String[] args)
	{
		//TreeSet �ڷᱸ�� �ν��Ͻ� ����
		TreeSet<String>set = new TreeSet<String>();

		//TreeSet�ڷᱸ�� set�� ��� �߰� �� add();
		set.add("�Ͽ��ǿ����̴¼�");
		set.add("�����");
		set.add("�Ѹ�");
		set.add("�͸���Į��");
		set.add("�ܿ�ձ�");
		set.add("¯��");
		set.add("�λ��̵�ƿ�");
		set.add("�ڳ�");
		set.add("���ɰ���");
		
		//Iterator�� Ȱ���� set ��� ��ü ���
		Iterator<String> it =set.iterator();
		while(it.hasNext())
		{
			System.out.print(it.next() + " ");
		}
		System.out.println();
		//�ܿ�ձ� �͸���Į�� �Ѹ� ���ɰ��� �λ��̵�ƿ� ¯�� �ڳ� ����� �Ͽ��ǿ����̴¼�
		//����� ������ �ƴϳ�..

		//TreeSet�ڷᱸ�� �ν��Ͻ� ����
		//TreeSet<GradeVO> set2 = new TreeSet<GradeVO>();
		TreeSet<GradeVO> set2 = new TreeSet<GradeVO>(new MyCOMPARATOR<GradeVO>());


		//GradeVO OB = new GradeVO();
		set2.add(new GradeVO("20211523", "��", 90, 80, 70));
		set2.add(new GradeVO("20211524", "��", 91, 81, 71));
		set2.add(new GradeVO("20211525", "��", 98, 78, 88));
		set2.add(new GradeVO("20211529", "��", 72, 49, 99));
		set2.add(new GradeVO("20211472", "��", 56, 31, 90));
		
		//Iterator�� Ȱ���� set ��� ��ü ���
		
		/*
		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			System.out.print(it2.next() + " ");
		}
		System.out.println(); //�����߻�
		*/

		Iterator<GradeVO> it2 = set2.iterator();
		while(it2.hasNext())
		{
			GradeVO vo = it2.next();
			System.out.printf("%7s %7s %4d %4d %6d\n "
							, vo.getHak(), vo.getName()
							, vo.getKor(), vo.getEng() , vo.getMat()
							, vo.getTot());

		}
	}

}
//��������
//VO �� Value Object(=��ü�� ����ִ�)
//DTO�� Data Transfer Object(VO�� DTO�� ���� ���� ����)
//���� �������� �ִٸ� ����Ͻ� ������ ����ִ� VO, ������� ���� DTO
//DAO�� Data Access Object
class GradeVO
{
	//�ֿ� �Ӽ� ����
	private String hak; 
	private String name;
	private int kor,eng,mat;

	//������(����� ���� ������ -> 5���� �Ű������� ���� ������
	GradeVO(String hak, String name, int kor, int eng, int mat)
	{
		this.hak = hak;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;

	//������(����� ���� ������ -> �Ű����� ���� ������)
	//�Ű����� �����ϴ� �����ڸ� ����� ���� �����ڷ� �����Ͽ��� ������
	//default �����ڰ� �ڵ����� ���Ե��� ���� ���� ����Ͽ�
	//�߰��� ������ ������
	GradeVO()
	{

	}
	// getter / setter ���� 
	String getHak()
		{ 
		return hak; 
		} 
	void setHak(String hak)
		{ 
		this.hak = hak; 
		} 
	String getName()
		{ 
		return name; 
		} 
	void setName(String name)
		{ 
		this.name = name; 
		} 
	int getKor()
		{ 
		return kor; 
		}
	void setKor(int kor)
		{ 
		this.kor = kor; 
		} 
	int getEng()
		{
		return eng; 
		} 
	void setEng(int eng)
		{
		this.eng = eng; 
		} 
	int getMat()
		{ 
		return mat; 
		}
	void setmat()
		{
		this.mat = mat;
		} 
	int getTot() 
		{ 
		return kor + eng + mat; 
		} 

	}

class MyComparator<T> implements Comparator<T>
{
	//compare��� �޼ҵ尡 comparator �ȿ� �ִ�
	@Override
	public int compare(T o1, T o2) //������ Ÿ���� T ---���׸����� �̰� �����Ѱ�
	{
		//GradeVO Ÿ������ ĳ����
		GradeVO s1 = (GradeVO)o1; 
		GradeVO s2 = (GradeVO)o2; 
		
		// �й� ����(��������) --���������̸� s1,s2 ���� �ٲٸ� �ȴ�.
		return Integer.parseInt(s1.getHak()) - s2.getHak());

		//���� ����(����)
		return s1.getTot() - s2.getTot();

		//�̸� ����(��������)
		return s1.getName().compareTo(s2.getName());
		//�̸� ����(��������)

	}
}