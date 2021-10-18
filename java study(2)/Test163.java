/*====================================================
  �����÷��� ������ ��ũ collection Framework����
======================================================*/
/*
String[] �� List : Arrays.asList()
List ��String[] : List.toArray()

*/

import java.util.*;

public class Test163
{
	public static void main(String[] args)
	{
		List<String>mList = new ArrayList<String>();

		mList.add("1");
		mList.add("2");
		mList.add("3");

		//List �� String[]
		String[] sArrays=mList.toArray(new String[mList.size()]);
		
		for(String s : sArrays)
		{
			System.out.print(s+ " ");
		}
		System.out.println();

		//String[] �� List : Arrays.asList()
		List<String>mNewList = Arrays.asList(sArrays);
		//Arrays.asList()�� ��ȯ �ڷ����� List

		for(String s: mNewList)
		{
			System.out.print(s+ " ");
		}
		System.out.println();
	}
}