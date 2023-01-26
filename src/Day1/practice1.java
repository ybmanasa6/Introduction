package Day1;

public class practice1 {

	
		int sid;
		String name;
		char grade;

	
		practice1(int id,String LN,char g)
		{
			sid=id;
			name = LN;
			grade = g;
		}
	
	void getData(int id,String LN,char g)
	{
		sid=id;
		name = LN;
		grade = g;
	}
	
	void show()
	{
		System.out.println(sid+"  "+name+"   "+grade);
	}

}
