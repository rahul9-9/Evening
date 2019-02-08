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
		// at giving node
		void beg(int data,int n)
		{
			node x=new node();
			x.data=data;
          node temp=start;
               int i=0;		  
			while(i<n-1)
			{
				temp=temp.next;
				i++;
			}
			x.next=temp.next;
			temp.next=x;
			
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
		
			obj.insert(4);
			obj.insert(5);
			
			obj.beg(3,3);
			obj.display();
			
		}
	}
	
