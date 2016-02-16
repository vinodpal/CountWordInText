

import java.util.*;
import java.lang.*;
import java.io.*;

class countWord
{
	public static void main (String[] args) throws java.lang.Exception
	{

		
		String text = "cpcabbarstteo";
		String [] word = {"bag","cat","pot"};
		
		List<Integer> countWord = new ArrayList<Integer>();
		Map <Character,Integer> mapStore = new HashMap<Character,Integer>();
		
		for(int i=0;i<text.length();++i){
			char c = text.charAt(i);
			if(mapStore.get(c)!=null){
				mapStore.put(c,mapStore.get(c)+1);
			}
			else mapStore.put(c,1);
		}
		
		for(int i=0;i<word.length;++i){
			Integer min = Integer.MAX_VALUE;
			for(int j=0;j<word[i].length();++j){
				Integer value = mapStore.get(word[i].charAt(j));
				if(value==null)
					min = 0;
				else if(value < min){
					min = value;
				}
			}
			countWord.add(min == Integer.MAX_VALUE ? 0 : min);
		}
		
		for(int i=0;i<countWord.size();++i){
			System.out.println("Word : "+word[i] + " is Number of Times : "+countWord.get(i));
		}
		
	}
}
