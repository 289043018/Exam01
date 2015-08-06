package com.hand.Exam01;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * 
 * 判断101-200之间有多少个素数，并输出所有素数
 *
**/


public class App 
{
    public static void main( String[] args )
    {
    	int num=0,i,j;
    	List<Integer> lists = new ArrayList<Integer>();
    	
    	for(i=101;i<200;i++){
    	for(j=2;j<i;j++){
    		if(i%j==0)
    				break;
    	}
    	if(j>=i){
    		num++;
    		lists.add(i);
    		
    	}
    	}

    	System.out.println("101-200之间有"+num+"个素数:");
    	 Iterator<Integer> iter = lists.iterator();
    	 while (iter.hasNext()) {
			System.out.print(iter.next()+",");
			
		}
    	
    }
    	
}
