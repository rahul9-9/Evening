import java.util.Scanner;

	 class node
	{
		int data;
		node next;
	}
	class linklist
	{
		node start;
		public void insert(int data)
		{
			node x=new node();
			x.data=data;
			x.next=null;
			if(start==null)
			{
				start=x;
			}
			else
			{
				node n=start;
			
			while(n.next!=null)
			{
				n=n.next;
			}
			n.next=x;
		}
		}
		
		void beg(int n)
		{
			node y=start;
			int i=0;
			while(i<n-1)
			{
				y=y.next.next;
			}
			
			
		}
		void display()
		{
			node n=start;
			while(n!=null)
			{
				System.out.print(n.data+" ");
				n=n.next;
			}
		}
	}
	class main
	{
		public static void main(String[] args)
		{
			linklist obj=new linklist();
			obj.insert(1);
			obj.insert(2);
			obj.insert(3);
			obj.insert(14);
			obj.beg(1);
			obj.display();
			
		}
	}
	
