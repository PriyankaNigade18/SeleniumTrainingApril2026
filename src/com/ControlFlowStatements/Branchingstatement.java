package com.ControlFlowStatements;

public class Branchingstatement {
	/*
	 * 1.break:
	 * break statement will take control outside ofswitch and loop body
	 * 
	 * 2.continue:
	 * continue statement will skip certain part of the code and continue execution 
	 * till the end
	 * 
	 * 
	 * 3.return
	 * Whenever we wanted to return any result from function we use return keyword
	 * 
	 * 
	 * 
	 */
	public static String info(String msg)
	{
		return msg;
	}
	
	
	
	public static void main(String[] args)
	{
		System.out.println("-------break---");
		
		for(int i=1;i<=10;i++)
		{
			if(i>=5)
			{
				break;//exit form loop
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("---------");
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				break;
			}else
			{
				System.out.println(i);
			}
		}

		System.out.println("---------");

		for(int i=1;i<=10;i++)
		{
			if(i>5)
			{
				break;
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("-------Continue---");
		
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}else
			{
				System.out.println(i);
			}
		}
		
		System.out.println("-------------------------");
		int i=1;
		do
		{
		//Automation
		//String url="https://www.google.com";
		String url="www.google.com";
		//if url does not conatins https then skip otherwise pass request
		if(!url.contains("https"))
		{
			System.out.println("Url is not valid so skipped!");
			continue;//skip that url
		}else
		{
			System.out.println("Url is valid pass as request to server");
		}
		
		}while(i==2);
		
		System.out.println("-------------return------------");

		
		
		String res=info("Hello All!");
		System.out.println(res);
		

		
		
		
		
		

	}

}
