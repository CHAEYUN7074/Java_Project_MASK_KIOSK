/*===================
�ڹ��� �⺻ �����(I/O)
====================
*/
import java.util.*;

public class Test172(2)
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
			while((data = rd.read() != -1))
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