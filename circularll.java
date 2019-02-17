class Node
{
Node next;
int data;
Node pre;

 Node(int data)
   { 
	this.data=data;
   }

}
class CircularList
{
	Node head;
	Node tail;

public void traverseClock()
{
   if(head==null)
   {
   	System.out.println("List Is Empty");
   }
   else
   {
      Node current=head;
      System.out.println("Elements are:");
      while(current.next!=head)
      {   
      	System.out.println(current.data);
         current=current.next;
      }
      System.out.println(current.data);
    }
}


public void traverseClockByTail()
{
   if(tail==null)
   {
   	System.out.println("List Is Empty");
   }
   else
   {
      Node current=tail;
      System.out.println("Elements are:");
      while(current.next!=tail)
      {   
      	System.out.println(current.data);
         current=current.next;
      }
      System.out.println(current.data);
    }
}

public void traverseAntiClockByHead()
{
   if(head==null)
   {
   	System.out.println("List Is Empty");
   }
   else
   {
      Node current=head;
      System.out.println("Elements are:");
      while(current.pre!=head)
      {   
      	System.out.println(current.data);
         current=current.pre;
      }
      System.out.println(current.data);
    }
}

public void traverseAntiClock()
{
  if(tail==null)
  {
  	System.out.println("List is Empty");
  }
  else
  {
  	Node current=tail;
  	System.out.println("Elemets Are:");
  	while(current.pre!=tail)
    { 
     System.out.println(current.data);
     current=current.pre;   
    }
    System.out.println(current.data);
  }
  
 }  

 public void InsertEnd(int data)
  {
    Node node=new Node(data);
    if(head==null)
    {
    	node.next=node;
    	node.pre=node;
    	head=node;
    	tail=node;
    }
    else
    {
    	tail.next=node;
    	node.pre=tail;
    	node.next=head;
    	head.pre=node;
    	tail=node;
    }

  }

  public void InsertBeg(int data)
  {
    Node node=new Node(data);
    if(head==null)
    {
    	node.next=node;
    	node.pre=node;
    	head=node;
    	tail=node;
    }
    else
    {  
       node.next=head;
       node.pre=tail;
       head.pre=node;
       head=node;
       tail.next=node;
    }
  }
  public void deleteBeg()
  {
  	if(head==null)
  	{
  		System.out.println("List is Empty");
  	}
  	else if(head==tail)//for a singlr node
  	{
  		head=null;
  		tail=null;
  	}
  	else
  	{
  		head=head.next;
  		head.pre=tail;
  		tail.next=head;
  	}
  }

  public void deleteEnd()
  {
  	if(head==null)
  	{
  		System.out.println("List is Empty");
  	}
  	else if(head==tail)//for a singlr node
  	{
  		head=null;
  		tail=null;
  	}
  	else
  	{
  		tail=tail.pre;
  		tail.next=head;
  		head.pre=tail;
  	}
  }

  void deleteAtPos(int pos)
  {
    boolean f=false;
    int c=1;
    if(head==null)
    {
      System.out.println("List is empty");
    }
    else
    {
      if(pos==1)
      {
        deleteAtBeg();
        f=true;
      }
      else
      {
        node t=head.next;
        c++;
        while(t.next!=head)
        {
          if(pos==c)
          {
            t.prev.next=t.next;
            t.next.prev=t.prev;
            f=true;
          }
          t=t.next;
          c++;
        }
        if(pos==c && f==false)
        {
            deleteAtEnd();
        }
      }
    }
  }

  void insertAtPos(int pos,int data)
  {
    node new1=new node(data);
    boolean f=false;
    int c=1;
    if(head==null)
    {
      System.out.println("List is empty");
    }
    else{
      if(pos==1)
      {
        new1.next=head;
        head.prev=new1;
        new1.prev=tail;
        head=new1;
        tail.next=head;
        f=true;
      }
      else{
        c++;
        node t=head;
        t=t.next;
        while(t.next!=head)
        {
          if(pos==c)
          {
            t.prev.next=new1;
            new1.next=t;
            f=true;
          }
          t=t.next;
          c++;
        }
        if(pos==c && f==false)
        {
            t.prev.next=new1;
            new1.next=t;
            f=true;
            c++;
        }
      }
    }
  }

}

public class circularll
{
	public static void main(String[] args) 
	{
	  CircularList list=new CircularList();

	  list.InsertEnd(10);
	  list.InsertEnd(20);	
	  list.InsertEnd(30);	
	  list.InsertEnd(40);	
	  list.InsertEnd(50);	
	 //list.InsertBeg(5); 
	  list.traverseClock();
	 //list.traverseAntiClock();	
	  //list.traverseClockByTail();//check camera on 13.02.2019
	  //list.traverseAntiClockByHead();//check camera on 13.02.2019
	  list.deleteBeg();
	  list.traverseClock();
	  list.deleteEnd();
	  list.traverseClock();
	}
}