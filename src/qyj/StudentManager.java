package qyj;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


//主页面，体现先增删改查等功能。
/**
 * 所有=两边都未留空格
 * 警告错误，错误标号26
 */
public class StudentManager extends JFrame 
{
	//错误标号26
	private static final long serialVersionUID = 1L;
	Function fun = new Function();
	public StudentManager()
	{
		/**
		 * JLabel lb;
		 * JButton insert,delete,update,search,showall,exit;
		 * 错误标号10、11、12
		 */
		setSize(450,450);

        JLabel lb = new JLabel("学生信息管理系统");
        lb.setFont(new Font("Dialog",1,20));
        JButton insert = new JButton("insert");
        JButton delete = new JButton("delete");
        JButton update = new JButton("update"); 
        JButton search = new JButton("search");
        JButton showall = new JButton("showall");
        JButton exit = new JButton("exit");
        setVisible(true);//使窗体可视化
        
        Container c = getContentPane();//获取一个容器
        c.add(lb);
        c.add(insert);
        c.add(delete);
        c.add(update);
        c.add(search);
        c.add(showall);
        c.add(exit);
        setBounds(470,200,450,450);
        
        c.setLayout(null);
        lb.setBounds(130, 20, 400, 80);
        insert.setBounds(165,100 , 100, 20);
        delete.setBounds(165, 130,100 , 20);
        update.setBounds(165, 160, 100, 20);
        search.setBounds(165, 190, 100, 20);
        showall.setBounds(165, 220, 100, 20);
        exit.setBounds(165, 250, 100, 20);
        
        insert.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				setVisible(false);
				new Insert();
			}
        }); 
        delete.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				setVisible(false);
				new Delete();
			}
        });
        update.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				setVisible(false);
				new Update();
			}        	
        });
        search.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				setVisible(false);
				new Findone();
			}       	
        });
        showall.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				fun.showall();
				setVisible(false);
				new StudentManager();
			}       	
        });
        exit.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				setVisible(false);
				dispose();
				System.exit(0);
			}       	
        });        
	}
}
//插入学生信息界面
class Insert extends JFrame
{
	private static final long serialVersionUID = 1L;
	Function fun = new Function();
	Student s = new Student();
	public Insert()
	{
		setSize(450,450);
		
		JLabel lb = new JLabel("信息录入");
    	lb.setFont(new Font("Dialog",1,25));
    	JLabel a = new JLabel("ID:");
    	a.setFont(new Font("Dialog",1,15));
    	JLabel b = new JLabel("Name:");
    	b.setFont(new Font("Dialog",1,15));
    	JLabel c = new JLabel("Birth:");
    	c.setFont(new Font("Dialog",1,15));
    	JLabel d = new JLabel("Sex:");
    	d.setFont(new Font("Dialog",1,15));
    	JLabel e = new JLabel("Grade:");
    	e.setFont(new Font("Dialog",1,15));
    	/**
    	 * JTextField ID = new JTextField(5);
         * JTextField name = new JTextField(5);
    	 * JTextField birth = new JTextField(6);
    	 * JComboBox sex = new JComboBox();
         * JComboBox grade = new JComboBox();
         *错误标号27
    	 */
    	final JTextField ID = new JTextField(5);
    	final JTextField name = new JTextField(5);
    	final JTextField birth = new JTextField(6);
    	final JComboBox sex = new JComboBox();
    	sex.addItem("male");
    	sex.addItem("female");
    	final JComboBox grade = new JComboBox();
    	grade.addItem("2016");
    	grade.addItem("2017");
    	grade.addItem("2018");   	
    	JButton b1 = new JButton("save");
    	JButton b2 = new JButton("exit");
    	b1.setFont(new Font("Dialog",1,10));
    	b2.setFont(new Font("Dialog",1,10));   	
        setVisible(true);//使窗体可视化
        
        Container c1 = getContentPane();//获取一个容器
        c1.add(lb);
        c1.add(a);
        c1.add(ID);
        c1.add(b);
        c1.add(name);
        c1.add(c);
        c1.add(birth);
        c1.add(d);
        c1.add(sex);
        c1.add(e);
        c1.add(grade);
        c1.add(b1);
        c1.add(b2);
        setBounds(470,200,450,450);
        
        c1.setLayout(null);
        lb.setBounds(180, 20, 120, 80);
        a.setBounds(150, 100, 40, 20);
        ID.setBounds(210,100 , 100, 20);
        b.setBounds(150, 130, 60, 20);
        name.setBounds(210, 130, 100, 20);
        c.setBounds(150, 160, 60, 20);
        birth.setBounds(210, 160, 100, 20);
        d.setBounds(150, 190, 60, 20);
        sex.setBounds(210, 190, 100, 20);
        e.setBounds(150, 220, 60, 20);
        grade.setBounds(210,220,100, 20);
        b1.setBounds(150, 300, 60, 30);
        b2.setBounds(250, 300, 60, 30);
        
	    b1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				String sname = name.getText();
		     	if(fun.find(sname) != -1)
		     	{
		     		JOptionPane.showMessageDialog(null, "该学生已经存在！");
		     		return;
		     	}      		 
		     	String sid = ID.getText();
		     	int a = Integer.parseInt(sid);
		       	String sbirth = birth.getText();     		 
		       	String sgrade = (String)grade.getSelectedItem();
		       	int b = Integer.parseInt(sgrade);
		       	String ssex = (String)sex.getSelectedItem();
	
		       	s.setID(a);
		       	s.setName(sname);
		       	s.setBirthday(sbirth);
		       	s.setGender(ssex);
		       	s.setGrade(b);	
	
		       	fun.add(s);
		       	fun.writefile();
		       	JOptionPane.showMessageDialog(null, "录入成功！！！");		       		 
		       	setVisible(false); 
		       	new StudentManager();
			}
		});
	    b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				setVisible(false);
				new StudentManager();
			}
	    });
    }
}
//删除学生信息界面
class Delete extends JFrame
{
	private static final long serialVersionUID = 1L;
	Function fun = new Function();
	public Delete()
	{
		setSize(450,300);
		
		JLabel lb = new JLabel("删除信息");
		lb.setFont(new Font("Dialog",1,25));
		JLabel n = new JLabel("Name:");
		lb.setFont(new Font("Dialog",1,15));
		final JTextField name = new JTextField(5);
		JButton b1 = new JButton("delete");		
		setVisible(true);//使窗体可视化
		
        Container c2 = getContentPane();//获取一个容器
        c2.add(lb);
        c2.add(n);
        c2.add(name);
        c2.add(b1);
        setBounds(470,200,450,300);
        
        c2.setLayout(null);
        lb.setBounds(180, 20, 120, 80);
        n.setBounds(140, 120, 60, 20);
        name.setBounds(200, 120, 100, 20);
        b1.setBounds(190, 200, 70, 30);
        
        b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				String sname = name.getText();
				/**
				 * if(fun.find(sname) ==  -1)
				 * {
		     	 *	 JOptionPane.showMessageDialog(null, "该学生不存在！");
		     	 *	 return;
		     	 * }
		     	 * 错误标号34
				 */	     	
				if(-1 == fun.find(sname))
		     	{
		     		JOptionPane.showMessageDialog(null, "该学生不存在！");
		     		return;
		     	}
		     	fun.delete(sname);
		     	JOptionPane.showMessageDialog(null, "删除成功！");
		     	setVisible(false);
		     	new StudentManager();
			}        	
        });
	}
}
//修改信息界面
class Update extends JFrame
{
	private static final long serialVersionUID = 1L;
	Function fun = new Function();
	Student s = new Student();
	public Update()
	{
		setSize(450,450);
		
		JLabel lb = new JLabel("修改信息");
    	lb.setFont(new Font("Dialog",1,25));
    	JLabel a = new JLabel("ID:");
    	a.setFont(new Font("Dialog",1,15));
    	JLabel b = new JLabel("Name:");
    	b.setFont(new Font("Dialog",1,15));
    	JLabel c = new JLabel("Birth:");
    	c.setFont(new Font("Dialog",1,15));
    	JLabel d = new JLabel("Sex:");
    	d.setFont(new Font("Dialog",1,15));
    	JLabel e = new JLabel("Grade:");
    	e.setFont(new Font("Dialog",1,15));    	
    	final JTextField ID = new JTextField(5);
    	final JTextField name = new JTextField(5);
    	final JTextField birth = new JTextField(6);
    	final JComboBox sex = new JComboBox();
    	sex.addItem("male");
    	sex.addItem("female");
    	final JComboBox grade = new JComboBox();
    	grade.addItem("2016");
    	grade.addItem("2017");
    	grade.addItem("2018");    	
    	JButton b1 = new JButton("save");
    	JButton b2 = new JButton("exit");
    	b1.setFont(new Font("Dialog",1,10));
    	b2.setFont(new Font("Dialog",1,10)); 
        setVisible(true);//使窗体可视化
        
        Container c3 = getContentPane();//获取一个容器
        c3.add(lb);
        c3.add(a);
        c3.add(ID);
        c3.add(b);
        c3.add(name);
        c3.add(c);
        c3.add(birth);
        c3.add(d);
        c3.add(sex);
        c3.add(e);
        c3.add(grade);
        c3.add(b1);
        c3.add(b2);
        setBounds(470,200,450,450);
        
        c3.setLayout(null);
        lb.setBounds(180, 20, 120, 80);
        a.setBounds(150, 100, 40, 20);
        ID.setBounds(210,100 , 100, 20);
        b.setBounds(150, 130, 60, 20);
        name.setBounds(210, 130, 100, 20);
        c.setBounds(150, 160, 60, 20);
        birth.setBounds(210, 160, 100, 20);
        d.setBounds(150, 190, 60, 20);
        sex.setBounds(210, 190, 100, 20);
        e.setBounds(150, 220, 60, 20);
        grade.setBounds(210,220,100, 20);
        b1.setBounds(150, 300, 60, 30);
        b2.setBounds(250, 300, 60, 30);
        
        b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				String sname = name.getText();
		     	if(-1 == fun.find(sname))
		     	{
		     		JOptionPane.showMessageDialog(null, "该学生不存在！");
		     		return;
		     	}		     	
		     	String sid = ID.getText();
		     	int a = Integer.parseInt(sid);
		       	String sbirth = birth.getText();     		 
		       	String sgrade = (String)grade.getSelectedItem();
		       	int b = Integer.parseInt(sgrade);
		       	String ssex = (String)sex.getSelectedItem();
		       	
		       	s.setID(a);
		       	s.setName(sname);
		       	s.setBirthday(sbirth);
		       	s.setGender(ssex);
		       	s.setGrade(b);
		       	
		       	fun.update(s);
		       	fun.writefile();		       	
		       	JOptionPane.showMessageDialog(null, "修改成功！！！");		       		 
		       	setVisible(false); 
		       	new Update();
			}        	
        });
        b2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				setVisible(false);
				new StudentManager();
			}        	
        });
	}
}
//按姓名查找个人信息界面
class Findone extends JFrame
{
	private static final long serialVersionUID = 1L;
	Function fun = new Function();
	public Findone()
	{
		setSize(450,300);
		
		JLabel lb = new JLabel("查找信息");
		lb.setFont(new Font("Dialog",1,25));
		JLabel n = new JLabel("Name:");
		lb.setFont(new Font("Dialog",1,15));
		final JTextField name = new JTextField(5);
		JButton b1 = new JButton("find");		
		setVisible(true);//使窗体可视化
		
        Container c2 = getContentPane();//获取一个容器
        c2.add(lb);
        c2.add(n);
        c2.add(name);
        c2.add(b1);
        setBounds(470,200,450,300);
        
        c2.setLayout(null);
        lb.setBounds(180, 20, 120, 80);
        n.setBounds(140, 120, 60, 20);
        name.setBounds(200, 120, 100, 20);
        b1.setBounds(190, 200, 70, 30);
        
        b1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) 
			{
				// TODO Auto-generated method stub
				String sname = name.getText();
		     	if(-1 == fun.find(sname))
		     	{
		     		JOptionPane.showMessageDialog(null, "该学生不存在！");
		     		return;
		     	}
		     	fun.findone(sname);
		     	setVisible(false); 
		     	new StudentManager();
			}
        });
	}
}
/**
 *错误标号：8
 */
class Function 
{
	ArrayList<Student> array = new ArrayList<Student>();  			
	public Function()
	{
		this.readfile();
	}
	//依据学生姓名查找学生
	public int find(String str) 
	{		
		/**
		 * 错误标号18
		 * for (int i = 0;i < array.size();i++)
	     *  	if (array.get(i).getName().equals(str))
	     *			return i;
	     *     
		 */			
		for (int i = 0;i < array.size();i++)
	    {
	    	if (array.get(i).getName().equals(str))
	    	{
	    		return i;
	    	}	
	    }	    	
		return -1;
	}	
	//读文件
	public boolean readfile() 
	{					 
		String s;
		try
		{
			FileReader fr = new FileReader("student.txt");
			BufferedReader br = new BufferedReader(fr);				
			array.clear();				
			while ((s= br.readLine()) != null)
			{
				String [] ss = s.split("\\s+");
				int a = Integer.parseInt(ss[0]);
				int b = Integer.parseInt(ss[4]);
				Student st = new Student(a,ss[1],ss[2],ss[3],b);
				array.add(st);
			}
			fr.close();
			br.close();				     
			return true;
		} 
		catch (IOException e) 
		{
			// TODO 自动生成的 catch 块
			e.printStackTrace();
			return false;
		}	
	}
	//写文件
	public boolean writefile() 
	{
		FileWriter fw = null;
		BufferedWriter out = null;
		try 
		{
			fw = new FileWriter("student.txt");    
			out = new BufferedWriter(fw);
			for(int i = 0;i < array.size();i++)
			{
				String s = array.get(i).fileString();
			    out.write(s);
			    out.newLine();
			}
			out.close();
			fw.close();
			return true;
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
			return false;
		}
   }
	/**
	 * 
	 * @param Student s
	 * @return 是否添加成功
	 */
	public boolean add(Student s)
	{		
		if (find(s.getName()) != -1)
		{
			return false;
		}					
		array.add(s); 
		return true;			
	}
	/**
	 * 				
	 * @param name
	 * @return 是否删除成功 
	 */
	public boolean delete(String s) 
	{	
		File file = new File("student.txt");
		try 
		{
			if(!file.exists()) 
		    {
				file.createNewFile();
		    }
		    FileWriter fileWriter = new FileWriter(file);
		    fileWriter.write("");
		    fileWriter.flush();
		    fileWriter.close();		            
	    	int flag = find(s);		    		
		    array.remove(flag);  		    		
		    writefile();
		    return true;	            
		} 
		catch (IOException e) 
		{
		    e.printStackTrace();
		    return false;
		}				
    }
	/**
	 * 
	 * @param Student s
	 */
	public void update(Student s) 
	{
		int flag = find(s.getName());
		array.set(flag, s);		   
	}
	/**
	 * 
	 * @param name
	 * @return 是否查找成功，成功：输出
	 */
	public boolean findone(String s)
	{
		int flag = find(s);
		if(flag != -1)
		{
			String ss = array.get(flag).fileString();
			String [] s1 = ss.split("\\s+");
			System.out.println(s1[1]+"的信息如下:");
			System.out.println(" "+"ID"+" "+" "+"Name"+" "+"Birth"+" "+"Sex"+" "+" "+" "+"Grade");
			System.out.println(ss);
			return true;
		}
		/**
		 * else
		 * {
		 *	  return false;
		 * }			
		 * 错误标号60
		 */
		return false;
	}
	/**
	 * 输出所有学生信息
	 */
	public void showall()
	{
		System.out.println("所有学生信息如下：");
		System.out.println(" "+"ID"+" "+" "+"Name"+" "+"Birth"+" "+"Sex"+" "+" "+" "+"Grade");
		for(int i = 0;i < array.size();i++)
		{
			String s = array.get(i).fileString();
		    System.out.println(s);	
		}
	}
}
