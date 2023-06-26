package com.tcs.test;


import java.util.*;

public class MockInterview {
	public int solve(ArrayList<Integer> A) {
		int toReturn=0;
		Set<Integer> set=new HashSet<>(A);
		List<Integer> B=new ArrayList<>();
		for(int each:set)B.add(each);
		
		Collections.sort(B);//B contains unique elements and sorted
		int len=B.size(),n=len-1;
		return n*(n+1)/2;
	}
	public void newFeature() {
		System.out.println("Placeholder for new feature");
	}

	public List<Integer> findArr(ArrayList<Integer> A, ArrayList<Integer> B){
		Collection<Integer> c;
		
		
		return new ArrayList<>();
	}
	public static void main(String[] args) {
	
	
	}

}
