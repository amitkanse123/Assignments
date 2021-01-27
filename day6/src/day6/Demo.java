package day6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Demo {
public static void main(String[] args) {
	ArrayList<emp> l=new ArrayList<emp>();
	emp e=new emp(12,"ss",344);
	emp e1=new emp(11,"ss",344);
	emp e2=new emp(101,"ss",344);
	l.add(e);
	l.add(e1);
	
       
       emprepo repo=new emprepo();
      repo.insertemp(e);
      repo.insertemp(e1);
      repo.update(e1, e2);
     System.out.println( repo.getall());
       
       
       
	/* List l1=new LinkedList();
	 l1.add(1);
     l1.add(true);
     l1.add(23.33);
     l1.add("amit");
     System.out.println(l1);
     l.addAll(l1);
     System.out.println(l);*/
			
	
}
}
