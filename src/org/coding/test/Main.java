package org.coding.test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

class Demo {
    public void show()
    {
    	
        List<String> list = new ArrayList<>();
        		// new CopyOnWriteArrayList<>(); issue resolved by 
        list.add("banana");
        list.add("apple");
        Iterator itr = list.iterator();

        Collections.sort(list);
        while (itr.hasNext()) { // error is given
            System.out.print(itr.next() + " ");
        }
    }
}

public class Main {
    public static void main(String[] args)
    {
    	List<String> list = new ArrayList<>();
    	list.add("5");
    	List<Map<Integer, Pattern>> demoList =  (List) list; //
    	demoList.add(new HashMap<>());
    	demoList.get(0); //
    	demoList.get(1); //
    	System.out.println(demoList);
    	
    	
    	
		/*
		 * Demo demo = new Demo(); demo.show(); //apple banana
		 */    }
}