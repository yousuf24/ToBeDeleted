package com.tcs.test;

public class Q4 {

	public static void main(String[] args) {
		//You are given an array A and u need to create subsequence of array A call it B. It is valid if it satisfied both conditions
		//B[i] < B[i+1] --> needs sorting  i belongs to [1,|B|]
		//bit_count( B[1] ^ B[2 ]........B[i-1] ^ B[i]) <= bit_count(B[i+1]) where i belongs to [1,|B|]
		
		//Let X be the bitWise XOR of all the element in valid array B. U need to find no of different X th can be formed
		//NOte bit_count(t) is no of set bits of t 
		
		//USE case 1 takes [1,3,2] and returns 4 (i.e. [] , [3] , [2] , [1] ,[1,2]-> 1^2=3 & [1,3] -> 1^3=2
		//takes [1,100] and returns 4 (i.e. [], [1], [100] ,[1,100]-> 1^100=101 ) 

	}

}
