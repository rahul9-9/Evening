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
		// at the beginning
		void beg(int data)
		{
		node y=new node();
		y.data=data;
		y.next=start;
		start=y;
			
			
			
			
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
			obj.beg(14);
			obj.display();
			
		}
	}
	
