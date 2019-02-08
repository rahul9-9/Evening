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
		
		void beg()
		{
			
			node t=start;
          start=t.next;			
			
			
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
			Scanner s=new Scanner(System.in);
			
			linklist obj=new linklist();
			obj.insert(1);
			obj.insert(2);
			obj.insert(3);
			obj.insert(4);
			obj.insert(5);
			
			obj.beg();
			obj.display();
			
		}
	}
	
