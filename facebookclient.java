import java.util.*;
public class facebookclient 
{
 
    public static void main(String[] args) 
    { 
    ArrayList<String> friendlist = new ArrayList<String>();
	   ArrayList<String> likelist = new ArrayList<String>();
	    ArrayList<String> logfrnd = new ArrayList<String>();
	    ArrayList<String> logunfrnd = new ArrayList<String>();
	     ArrayList<String> loglike = new  ArrayList<String>();
	    ArrayList<String> logunlike = new  ArrayList<String>();
       Scanner sn=new Scanner(System.in);
       Date date = new Date();
      
       facebook fs = new facebook();
       	  String[] a=new String[10];
       	  Stack<String> stack;
	   a[0] = "Vivek";a[1]="hello";
       a[2] = "Abhishek";a[3]="good";
       a[4] = "Rakesh";a[5]="go ahead";
      System.out.println(" 1--> To Become friend\n 2--> To unfriend\n 3--> Like\n 4--> Unlike\n 5-->see log list\n 6-->exit");
      
      System.out.println("what you want to do?");
       int s = sn.nextInt();
      while(s<6)
      {

		  //System.out.println("With whom you want to be friend??");
		
	int flag=0;
	int flag1=0;
		  /* int flag=0;
		   for(int i=0;i<a.length;i=i+2)
		  {
			if(a[i]==name)
			{
				String frnd1=a[i];
				flag=1;
			}
		  }
		  if (flag==0)
		  {
			System.out.println("The person is not in Facebook");
		  }*/
		  System.out.println(" 1--> To Become friend \n 2--> To unfriend\n 3--> Like\n 4--> Unlike\n 5-->see log\n 6-->exit");
      
      System.out.println("what you want to do?");
	
		  if(s==1)
		  {
		  	System.out.println("With whom you want to be friend??");
		  	  String name = sn.next();
		  	  friendlist.add(name);
		  	 String time=date.toString();
		  	  logfrnd.add(time);
		    frndreq frndr = new frndreq(fs);
		    Invoker inv = new Invoker(frndr);
		    inv.execute();
		   }
		   else if(s==2)
		   {
	  		System.out.println("Whom do you want to Unfriend??");
	  		  String name = sn.next();
	  		  String time=date.toString();
					logunfrnd.add(time);
	  		  for (int i = 0; i < friendlist.size(); i++) 
	  		  {
	  		  	if (friendlist.get(i).equals(name))
			//friendlist.remove(name);
				flag=1;
				break;
			  }
				if(flag==1)
				{ friendlist.remove(name);
						    unfrnd unfrndr = new unfrnd(fs);
		    Invoker inv = new Invoker(unfrndr);
		    inv.execute();
				 }
				else
				{
				System.out.println(" You are not Friend with him");
				}
	  		 
		    //unfrnd unfrndr = new unfrnd(fs);
		    //Invoker inv = new Invoker(unfrndr);
		    //inv.execute();
		    }
		    else if(s==3)
		   {
	  		System.out.println("Whose status you want to like??");
	  		  String name = sn.next();
	  		  likelist.add(name);
	  		   String time=date.toString();
	  		  loglike.add(time);
		    like lik = new like(fs);
		    Invoker inv = new Invoker(lik);
		    inv.execute();
		    }
		   else if(s==4)
		   {
	  	 	System.out.println("Whose status you want to Unlike??");
	  	 	  String name = sn.next();
	  	 	  String time=date.toString();
				logunlike.add(time);
	  	 	   for (int i = 0; i < likelist.size(); i++) 
	  		  {
	  		  	if (likelist.get(i).equals(name))
			//friendlist.remove(name);
				flag1=1;
				break;
			  }
	  	 	 // likelist.remove(name);
	  	 	 if(flag1==1)
				{ friendlist.remove(name);
						    unlike ulik = new unlike(fs);
		    Invoker inv = new Invoker(ulik);
		    inv.execute();
				 }
				else
				{
				System.out.println(" You have not liked him");
				}
		    //unlike ulik = new unlike(fs);
		    //Invoker inv = new Invoker(ulik);
		    //inv.execute();
		    }
		    else if(s==5)
		    {
				        for (int m = 0; m < logfrnd.size(); m++) {
	    String value = logfrnd.get(m);
	    System.out.println("Sent frnd Request:" +value);}
	    for (int x = 0; x < logunfrnd.size(); x++) {
	    String value1 = logunfrnd.get(x);
	    System.out.println("unfrnd at:" +value1);}
	    for (int b = 0; b < loglike.size(); b++) {
	    String value3 = loglike.get(b);
	    System.out.println("like at:" +value3);}
	     for (int c = 0; c < logunlike.size(); c++) {
	    String value4 = logunlike.get(c);
	    System.out.println("unlike at:" +value4);}
	    }
		   /*else if(s==5)
		   {
		    isUndoAvailable undo = new isUndoAvailable(fs);
		    Invoker inv = new Invoker(undo);
		    inv.execute();
		    }*/System.out.println("what you want to do?");
		    s = sn.nextInt();
        } 
       /* for (int m = 0; m < logfrnd.size(); m++) {
	    String value = logfrnd.get(m);
	    System.out.println("Sent frnd Request:" +value);}
	    for (int x = 0; x < logunfrnd.size(); x++) {
	    String value1 = logunfrnd.get(x);
	    System.out.println("unfrnd at:" +value1);}
	    for (int b = 0; b < loglike.size(); b++) {
	    String value3 = loglike.get(b);
	    System.out.println("like at:" +value3);}
	     for (int c = 0; c < logunlike.size(); c++) {
	    String value4 = logunlike.get(c);
	    System.out.println("unlike at:" +value4);}*/
	}
    
 
}
