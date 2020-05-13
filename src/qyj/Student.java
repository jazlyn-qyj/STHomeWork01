package qyj;
public class Student 
{
	private int ID;
	private String name;//姓名
	private String birthday;//出生日期
	private String gender;//性别
	private int  grade;//年级
	
	public Student()
	{
	}
	
	public Student(int ID,String name,String birthday,String gender,int garde)
	{
		super();
		this.ID=ID;
		this.name=name;
		this.birthday=birthday;
		this.gender=gender;
		this.grade=garde;
	}
	
	public int getID() 
	{
		return ID;
	}
	public void setID(int iD) 
	{
		ID = iD;
	}
	public String getName() 
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name = name;
	}
	public String getBirthday() 
	{
		return birthday;
	}
	public void setBirthday(String birthday) 
	{
		this.birthday = birthday;
	}
	public String getGender() 
	{
		return gender;
	}
	public void setGender(String gender) 
	{
		this.gender = gender;
	}
	public int getGrade() 
	{
		return grade;
	}
	public void setGrade(int grade) 
	{
		this.grade = grade;
	}
	public String fileString() 
	{
		return  ID + " " +name + " " + birthday+" " 
		+ gender + " " + grade;
	}
}
