package test;

import java.util.Arrays;
//测试使用
public class tss {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int x = 0;
//		String s ="abccdefgabcdecfgabcdefg";
//		for(int i = 0;i<s.length();i++)
//		{
//			int c = s.indexOf("c");
//			if(c != -1)
//			{
//				x++;
//				s=s.substring(c+1);
//			}
//		}
//		String result = Integer.toString(x);
//		System.out.println("½á¹û"+result);
//		int x=3,y;
//		y=(x++)+(x++)+(++x);
//		System.out.println(y);
//		String[][] strings = {{"1","2","3"},{"4","5","6"},{"7","8","9"}};
//		String[] strings = {"1","2","3","4","5","6"};
//		String s = Arrays.toString(strings);
//		System.out.println(s);
//		System.out.println(strings);
//		if(null == null)
//		{
//			System.out.println("success");
//		}
//		String s = "abc";
//		String a = "cba";
//		String sa = s+"|"+a;
//		String[] sb = sa.split("\\|");
//		System.out.println(sa);
//		System.out.println(sb[0]);
//		System.out.println(sb[1]);
		String s = "abc_KJN1245v";
		if(s.matches("^[A-Za-z0-9_]*$"))
		{
			System.out.println(s);
		}
	}

}
