/*===================
�ڹ��� �⺻ �����(I/O)
====================
*/
public class Test171{


	public static void main(String[] args) {

		// System.out : �ڹ� �⺻ ��� ��Ʈ��

		System.out.write(65);		//-- 'A'
		System.out.write(66);		//-- 'B'

		System.out.write(180);		//-- 180 + 235 = '��'
		System.out.write(235);
		
		System.out.flush();
		//-- ���� ���������� ���� �Ұ�~!!!

		// ��� ���۰� ä������ ������
		// ����� ������(�ڷ�)�� ��� ����̽�(��ġ)�� ������ �ʱ� ������
		// flush() �޼ҵ带 ���� ���� �� ä������ ����
		// ��� ������ ������ �����ġ�� �о�� ���� �� �ֵ��� ó���ؾ� �Ѵ�.
	}

}

/*
import java.util.*;

public class Test171
{
	public void process(InputStream is)
	{
		int data;
		
		System.out.println("���ڿ� �Է�(���� : Ctrl+z");

		try
		{
			//�Ű����� is ��� ����Ʈ ��� ��ü(inputStream)��
			//���� ��Ʈ������ ��ȯ�Ͽ�
			//inputstreamreader�� ����
			//reader Ÿ���� rd�ּ� ������ �� �ֵ��� ó��
			Reader rd = new InputStreamReader(is); //inputstream(����)?? = is --���ڱ�ݽ�Ʈ���� ���� ư��
			Writer wt = new OutputStreamWriter(System.out);
			
			//����Ʈ ��� ��Ʈ���� �ڹ� �⺻ ��� ��Ʈ��(System.out)dmf
			//���� ��Ʈ������ ��ȯ�Ͽ� (OutputStreamwriter �� ����)
			//Writer Ÿ���� wt���� ������ �� �ֵ��� ó��
			while((data = rd.read() !=-1))
			{
				wt.write(data);
				wt.flush();
			}
		}
		catch (IOException e)
		{
			System.out.println(e.toString());
		}
}
}
*/