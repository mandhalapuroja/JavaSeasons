package oct9th;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HashSetDemo2 {

	public static void main(String[] args) {
		
		
		Set<String> hs=new HashSet<String>();
		
		//List<String> hs=new ArrayList<String>();
		
		System.out.println("Size  : "+hs.size());
		
		hs.add("Live Tech");
		
		hs.add("Java");
		
		hs.add("Selenium");
		
		hs.add("TOSCA");
		
		System.out.println("Size  : "+hs.size());
		
		//using for -each loop
		for(String temp:hs)
		{
			System.out.println(temp);
		}
		
		//using iterator concept 
		
		Iterator<String>  it=hs.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		

	}

}
