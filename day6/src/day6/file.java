package day6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file {
	static String s1="";
	public static void main(String[] args) {
		writefile();
		readfile();
	}

	private static void readfile() {
		
		
		try(FileInputStream fr=new FileInputStream ("abc.txt"))
		{
			int i=0;
			while((i=fr.read())!=-1)
					{
				char ar=(char)i;
				
			if(ar=='a' || ar=='e' || ar=='i' || ar=='o' || ar=='u')
			{
				   s1=s1+ Character.toUpperCase(ar);  
			
					}
			
			
		}
		}
	catch(IOException e)
	{
		e.printStackTrace();
	}
		try(FileOutputStream  fw=new FileOutputStream ("abcd.txt"))
		{
			
			fw.write(s1.getBytes());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}
	

	private static void writefile() {
		try(FileOutputStream  fw=new FileOutputStream ("abc.txt"))
		{
			String s="hello java";
			
			fw.write(s.getBytes());
			fw.write(s1.getBytes());
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	}

}
