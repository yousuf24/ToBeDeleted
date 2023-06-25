package com.tcs.test;

public class Q2 {
	//Given array of arrays. Array length is no of Queries
	//SHould return an output array with probabilities

	public static void main(String[] args) {
		int l=2,r=9;
		double totalNumbersBetween=r-l+1;
		double counter=0;
		
		
		for(int j=l;j<=r;j++) {	
			while(l<r) {
					int mid=(l+r)/2;
					if(j<mid)r=mid-1;
					else if(j>mid)l=mid+1;
					else {
						System.out.println("found");counter++;break;
					}
					
				}
				l=2;r=9;
		}
		System.out.println(counter);
		
		int Q=2;
		//Q is the length of 2D array   u can use int Q=twoDArray.length;
		double multiplier=Math.pow(10, 9) + 7;
		double P=1-(counter/totalNumbersBetween);
		System.out.println(P/Q * 1000000007);
		
		
//		for(int ind=0;ind<=4;ind++) {
//			System.out.println(ind);
//			while(ind<3) {
//				System.out.println("within limit");
//				break;
//			}
//			
//		}

	}

}
