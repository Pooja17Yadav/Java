package Linkedlist;

import java.util.LinkedList;
public class LinkedListReverse {
	
		static LinkedList<Integer>reverse(LinkedList<Integer>LL)
		{
			LinkedList<Integer>reverse = new LinkedList<Integer>();
			
			for(int i =LL.size()-1;i>=0;i--)
			{
				reverse.add(LL.get(i));
			}
			return reverse;
		}
		public static void main(String args[]){
			
			LinkedList<Integer>LL=new LinkedList<Integer>();
			LL.add(17);
			LL.add(20);
			LL.add(50);
			LL.addFirst(11);
			LL.addLast(90);
			System.out.println(LL);
			System.out.println(reverse(LL));
	}
}

