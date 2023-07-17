package Arrays_ProGram;

import Inheritance.SalaryAccount;

public class SqlDataBaseDriver
{
public static void main(String[] args)
{
	SqlLDataBase[] db=new SqlLDataBase[5];
	
	db[0]=new SqlLDataBase("Mahesh",101,"Tcs",45000.00,"Tikshana","Nagpur");
	db[1]=new SqlLDataBase("Dasun",102,"Shanka",44000.00,"TCS","Pune");
	db[2]=new SqlLDataBase("ravindra",103,"infosys",45030.00,"Jadeja","Delhi");
	db[3]=new SqlLDataBase("DJ",104,"IBM",45300.00,"Bravo","Banglore");
	db[4]=new SqlLDataBase("Shivam",105,"TCS",35000,"Dube","Pune");
	
//	for (int i = 0; i < db.length; i++) {
//		System.out.println(db[i]);
//		
//		
//		
//	}
//	findsalary(45000.00,db,'>');
//	findEmployeeMgr("Bravo",db);
	SqlLDataBase [] sorted=sortSal(db);
	for (int i = 0; i < sorted.length; i++) {
		System.out.println(sorted[i]);
	}
	
  
}
public static void findsalary(double sal,SqlLDataBase a[],char ch)
{
	if(ch=='>')
	{
		for (int i = 0; i < a.length; i++) {
			if (a[i].sal>sal)
			{
				System.out.println(a[i]);
			}
		}
	}
	else if (ch=='<')
	{
		for (int i = 0; i < a.length; i++) {
			if (a[i].sal<sal)
			{
				System.out.println(a[i]);	
			}
		}
	} 
	else if (ch=='=')
	{
	for (int i = 0; i < a.length; i++) {
		if (a[i].sal==sal)
		{
			System.out.println(a[i]);
		}
	}
	}
	else
	{
		System.out.println("Invalid Input Entered!");
	}


}

public static void findEmployeeMgr(String mgr,SqlLDataBase a[])
{
	boolean found=false;
	for (int i = 0; i < a.length; i++)
	{   
		if(a[i].Mgr==mgr)
		{
			found=true;
			System.out.println(a[i]);
		}
	}
	if (found==false)
	{
		System.out.println("Emp not Found");
	}

}

public static SqlLDataBase [] sortSal(SqlLDataBase[] a)
{
	for (int i = 0; i < a.length; i++) {
		for (int j= 0;j < a.length;j++)
		{
			
	
		if (a[i].sal<a[j].sal)
		{
		SqlLDataBase swap=a[i];
		a[i]=a[j];
		a[j]=swap;
		
		}
	}
		
	}
	return a;
}

}