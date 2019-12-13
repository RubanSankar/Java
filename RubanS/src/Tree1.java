import java.util.*;
import java.util.Map.Entry;
import java.util.regex.Pattern;  
class Tree1
{ 
	TreeMap<String,String> map=new TreeMap<String,String>(Collections.reverseOrder()); 

	Scanner obj= new Scanner(System.in);
	
void add()
{
	String name,num,tempname=null;
	int temp=0;
	
	System.out.println("Enter the Name of the Contact  to add: ");
	name=obj.nextLine();
	System.out.println("Enter the Number of the Contact : ");
	num= obj.nextLine();
	if((Pattern.matches("^((\\+)?91\\d{10})?$", (num) )|| Pattern.matches("[0-9]{10}",num)) && Pattern.matches("[a-zA-Z0-9]{3,15}", name))
	{
		tempname=map.get(num);
	        if (tempname==null) 
	        {
	        	name=name.toLowerCase();
	    		map.put(num,name); 
	    		System.out.println("Your Contact added Successfully\n\n");
	      
	        }
	       
	        else
	        {
	        	System.out.println("Do you want to override the existing contact Y for yes N for NO\n\n");
	        	char answer;
	        	Scanner obj2= new Scanner(System.in);
	        	answer=obj2.next().charAt(0);
	        	if(answer=='y' || answer =='Y')
	        	{
	        		name=name.toLowerCase();
		    		map.put(num,name); 
		    		System.out.println("Your Contact added Successfully\n\n");
		      
	        	}
	        	else
	        	{
	        		System.out.println("Thank you\n\n");
	        	}
	        	
	        }
		
		 
		
	}
	else
	{
		System.out.println("Please enter valid Number Or Name");
	}
	
}
void search()
{
	String nameornum,name,num;
	int temp=0;
	
	System.out.println("Enter the Name or number of the Contact want to search: \n");
	Scanner obj4= new Scanner(System.in);
	nameornum=obj4.nextLine();
	if((Pattern.matches("^((\\+)?91\\d{10})?$", (nameornum) ))|| Pattern.matches("[0-9]{10}",nameornum))
	{
		name=map.get(nameornum);
		if(name==null)
		{
				System.out.println("Its not added yet\n");
			
		}
		else
		{
		System.out.println(name +":"+nameornum); 
		temp=temp+1;
		}
	}
	else if(Pattern.matches("[a-zA-Z0-9]{3,15}", nameornum))
	{
		nameornum=nameornum.toLowerCase();
	for (Entry<String , String> entry : map.entrySet())
	{
        if (entry.getValue().equals(nameornum)) 
        {
        	num=entry.getKey();
        	if(num!=null)
        	{
        	System.out.println(nameornum);
            System.out.println(entry.getKey() + "\n");
            temp=temp+1;
        	}
        	
        }
        else
    	{
    		System.out.println("Its not added yet\n");
    	}
       
        }
	}
	
	
}
void delete()
{
	String nameornum,num=null; 
	int temp=0;
	System.out.println("Enter the Name or number of the Contact want to delete: \n");
	Scanner obj= new Scanner(System.in);
	nameornum=obj.nextLine();
	if((Pattern.matches("^((\\+)?91\\d{10})?$", (nameornum) ))|| Pattern.matches("[0-9]{10}",nameornum))
	{
		map.remove(nameornum);
	}
	
	for (Entry<String , String> entry : map.entrySet())
	{
		nameornum=nameornum.toLowerCase();
        if (entry.getValue().equals(nameornum)) 
        {
        	num=entry.getKey();
            temp=temp+1;
        }
	}
        if(temp==1)
        {
        	map.remove(num);
        	System.out.println("Contact deleted: \n");
        }
        else if(temp>1)
        {
        	for (Entry<String , String> entry1 : map.entrySet())
        	{
        		nameornum=nameornum.toLowerCase();
                if (entry1.getValue().equals(nameornum)) 
                {
                	System.out.println(nameornum);
                    System.out.println(entry1.getKey() + "\n");
                    
                }
        	}
        	System.out.println("Enter the Number of the contact to delete because there are many person with this name \n");
        	
        	num=obj.nextLine();
        	map.remove(num);
        	System.out.println("Contact deleted: \n");
        }
        else
        {
        	System.out.println("there is no such contact \n");
        }
	
}
void edit()
{
	String nameornum,name=null,num=null; 
	int temp=0;
	System.out.println("Enter the Name or num of the Contact want to Edit: \n");
	Scanner obj1= new Scanner(System.in);
	nameornum=obj1.nextLine();
	
	if((Pattern.matches("^((\\+)?91\\d{10})?$", (nameornum) ))|| Pattern.matches("[0-9]{10}",nameornum))
		{
			name=map.get(nameornum);
			if(name!=null) 
			{
		System.out.println(name + ":" +nameornum);
				System.out.println(" 1 to edit name \n 2 to edit number \n ");	
				int option;
				option = obj.nextInt();
				if(option==1)
					{
						String newname;
						System.out.println("Enter the New Name\n");
						Scanner obj4= new Scanner(System.in);
						newname=obj4.nextLine();
						map.put(num,newname);
						System.out.println("Updated contact successfully");
						
					}
				else if(option ==2)
					{
							map.remove(num);
							System.out.println("Enter the New Num\n");
							Scanner obj5= new Scanner(System.in);
							num=obj5.nextLine();
							map.put(num,name);
							System.out.println("Updated contact successfully");
							
					}
				else
					{
							System.out.println("Invalid Input");
					}
			}
			else
				{
						System.out.println("Its not added yet");
				}
		}
	else if (Pattern.matches("[a-zA-Z0-9]{3,15}", nameornum))
		{
				nameornum=nameornum.toLowerCase();
				for (Entry<String , String> entry : map.entrySet())
					{
			        	if (entry.getValue().equals(nameornum)) 
			        		{
			        			num=entry.getKey();
			        			temp=temp+1;
			        			
			        		}
					}
				if(temp==1)
				{
					System.out.println(nameornum + ":" +num);
					System.out.println(" 1 to edit name \n 2 to edit number \n ");	
					int option;
					option = obj.nextInt();
					if(option==1)
						{
							String newname;
							System.out.println("Enter the New Name\n");
							Scanner obj4= new Scanner(System.in);
							newname=obj4.nextLine();
							map.put(num,newname);
							System.out.println("Updated contact successfully");
							
						}
					else if(option ==2)
						{
							name=map.get(num);
							map.remove(num);
							System.out.println("Enter the New Num\n");
							Scanner obj5= new Scanner(System.in);
							num=obj5.nextLine();
							map.put(num,name);
							System.out.println("Updated contact successfully");
							
						}
					else
						{
							System.out.println("Invalid Input");
						}
				}
				
			    else if(temp>1)
			    {
			    	for (Entry<String , String> entry1 : map.entrySet())
			    	{
			            if (entry1.getValue().equals(nameornum)) 
			            {
			            	System.out.println(nameornum);
			                System.out.println(entry1.getKey() + "\n");
			                
			            }
			    	}
			    	System.out.println("Enter the Number of the contact to edit because there are many person with this name \n");
			    	num=obj.nextLine();
			    	System.out.println(" 1 to edit name \n 2 to edit number \n ");
					System.out.println("\n");
					
					int option1;
					option1 = obj.nextInt();
					if(option1==1)
					{
						String newname;
						System.out.println("Enter the New Name\n");
						Scanner obj4= new Scanner(System.in);
						newname=obj4.nextLine();
						map.put(num,newname);
						System.out.println("Updated contact successfully");
						
					}
					else if(option1 ==2)
					{
						name=map.get(num);
						map.remove(num);
						System.out.println("Enter the New Num\n");
						Scanner obj5= new Scanner(System.in);
						num=obj5.nextLine();
						map.put(num,name);
						System.out.println("Updated contact successfully");
						
					}
					else
					{
						System.out.println("Invalid Input");
					}
			    	
    }
			    else
			    {
			    	System.out.println("there is no such contact \n");
			    }
		}

    
	
	
}
void selectall()
{
	int temp=0;
	for (Entry<String , String> entry : map.entrySet())
	{
		temp=temp+1;
		System.out.println(entry.getValue()  + ":" + entry.getKey() + "\n");
	     
	}
	if(temp==0)
	{
	
	     
	     System.out.println("There is no contacts are added yet\n");
	     
	}
	
	
}

public static void main(String args[])
	{
	Tree1 clsobj=new Tree1();
	int temp;
	temp=0;
	while(temp!=1)
	{
	System.out.println(" 1 to add\n 2 to delete \n 3 to edit \n 4 to search \n 5 to select all \n 0 to exit");
	System.out.println("\n");
	Scanner obj= new Scanner(System.in);
	String option;
	option = obj.nextLine();
	if(Pattern.matches("[0-9]{1}",option)){
	switch(option)
	{
	case "1": 
		clsobj.add();  
    		break; 
	case "2": 
		clsobj.delete();  
    		break;  
	case "3":
		clsobj.edit();
		break;
	case "4":
		clsobj.search();
		break;
	case "5":
		clsobj.selectall();
		break;
	case "0":
		temp=1;
		break;
	default:
		System.out.println("Invalid Input");
	}    
	}
	else {
		System.out.println("Give valid input");
	}
	}
 }  
}  