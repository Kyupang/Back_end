package 컬렉션;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class 한번만등장한문자2 {

	public static void main(String[] args) {
		String answer = "";
		String s = "aaabbbcdddefe";
		
		String[] sstr = s.split("");
		Arrays.sort(sstr);
		for(int i =0 ; i< sstr.length-1; i++) {
			if(!sstr[i].equals(sstr[i+1])) {
				answer+= sstr[i];
			}
		}
		
		if(!sstr[sstr.length-1].equals(sstr[sstr.length-2])) {
			answer+= sstr[sstr.length-1];
		}
		
		System.out.println(answer);
		
		
		
	}

}
