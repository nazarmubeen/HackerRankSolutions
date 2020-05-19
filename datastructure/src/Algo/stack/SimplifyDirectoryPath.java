package Algo.stack;

import java.util.LinkedList;
import java.util.Stack;

public class SimplifyDirectoryPath {

	public static void main(String[] args)
	{
		String path="/./.././ykt/xhp/nka/eyo/blr/emm/xxm/fuv/bjg/./qbd/./../pir/dhu/./../../wrm/grm/ach/jsy/dic/ggz/smq/mhl/./../yte/hou/ucd/vnn/fpf/cnb/ouf/hqq/upz/akr/./pzo/../llb/./tud/olc/zns/fiv/./eeu/fex/rhi/pnm/../../kke/./eng/bow/uvz/jmz/hwb/./././ids/dwj/aqu/erf/./koz/..";
		String path2="/a/./b/../../c/";
		path=simplifyPath(path2);
		System.out.println("path "+path);
	}
	
	
	public static String simplifyPath(String a) {
		StringBuffer bf=new StringBuffer();
		
		Stack<String> ch=new Stack<>();
		
		String[] arr=a.split("/");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(" current character "+arr[i]);
			if(arr[i].equals("home"))
			{
				bf.append("/");
				bf.append("home");
			}
			else if(!arr[i].contains(".")  && !arr[i].isEmpty())
			{
			System.out.println(" "+"push");
			ch.push(arr[i]);
			}
			else if(arr[i].equals("..") && !ch.isEmpty())
			{
				System.out.println(" "+" pop");
				ch.pop();
			}
			else{
				
			}
		}
		System.out.println("ch "+ch);
		
		if(ch.isEmpty())
		{
			if(bf.length()==0)
			bf.append("/");
			return bf.toString();
		}
		
		LinkedList<String> result=new LinkedList<>();
		while(!ch.isEmpty())
		{
			
			System.out.println(ch.peek());
			result.add(ch.pop());
		}
		
		
		
		while(!result.isEmpty())
		{
			String value=result.pollLast();
			bf.append("/");
			bf.append(value);
		}
		
		System.out.println(" bf "+bf);
		
		
		return bf.toString();
	}
	
}
