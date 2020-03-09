import java.util.Scanner;

class myError extends Exception
{

}



class student{
String name,usn;
void info(){
Scanner key = new Scanner(System.in);
while(true)
{
try{
System.out.println("Enter the student name\n");
name = key.nextLine();
System.out.println("Enter the usn:");
usn = key.nextLine();
usn = usn.toLowerCase();
if(usn.startsWith("4ni"))
{
System.out.println("valid Record");
break;
}
else
{
throw new myError();
}
}
catch(myError e){
System.out.println("Usn format is not correct kindly re-enter the usn");
}
}
}

}
public class rd {
	public static void main(String args[])
	{
		try
		{
		student s1[] = new student[5];
	    System.out.println("Enter the 1st student info");
		s1[1] = new student();
		s1[1].info();
		System.out.println("Enter the 2nd student info");
		s1[2] = new student();
		s1[2].info();
		System.out.println("Enter the 3rd student info");
		s1[3] = new student();
		s1[3].info();
		System.out.println("Enter the 4th student info");
		s1[4] = new student();
		s1[4].info();
		System.out.println("Enter the 5th student info");
		s1[5] = new student();
		s1[5].info();
		}
		//while(true)
		//{
			//try{
			//s1[i].info();
			//i++;
			//if(i>5)
			//{
				//throw new ArrayIndexOutOfBoundsException();
			//}
			//}
			catch(ArrayIndexOutOfBoundsException e)
			{
					System.out.println("Cannot enter new record");
			
		    }
		}
				
	}





