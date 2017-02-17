import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LetsReview {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        HashMap<Integer, String> store = new HashMap<Integer,String>();
        int key=0;        
        int T=scan.nextInt();
        if(1<=T && T<=10)
        {
        	for(int i=0; i<T;i++)
        	{
        		String input=scan.next();
        		store.put(key++, evenOdd(input));        		
        	}
        }
        for(Entry<Integer,String> entry: store.entrySet())
        {
        	System.out.println(entry.getValue());
        }
    }
    
    public static String evenOdd(String input)
    {
    	String s=input;
    	char[]  even;
    	if(s.length()%2==1)
    		even=new char[(s.length()/2)+1];
    	else
    		even=new char[(s.length()/2)];
    	int j=0,k=0;
    	char[] odd=new char[(s.length()/2)];
       	char[] trial=new char[s.length()+2];
    	for(int i=0; i<s.length();i++)
    	{
    		if(i%2==0)
    		{
    			even[j]=s.charAt(i);
    			j++;
    		}
    		if(i%2==1)
    		{
    			odd[k]=s.charAt(i);
    			k++;
    		}
    	}
    	for (int i=0;i<even.length;i++)
    	{
    		trial[i]=even[i];
    	}
    	for(int i=0;i<odd.length;i++)
    	{
    		trial[i+even.length+1]=odd[i];
    	}
    	return new String(new String(even)+" "+new String(odd));
    }
}