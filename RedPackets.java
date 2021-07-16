package test1;

import java.util.ArrayList;
import java.util.List;

public class RedPackets {
	
	public static List<Integer> splitRedPackets(int money, int count) {
	
		List<Integer> List=new ArrayList<Integer>();
		if(money>20000||money<1)
			return null;
		int a=money/count;
		if(a<1)
			return null;
		for(int i=count;i>0;i--) {
			int max=(money / i) * 2;
			int min=1;
			int b=random(money, min, max, count);
			while((money-b)<(i-1)) {
				max=b;
				b=random(money, min, max, count);
			}
			money=money-b;
			List.add(b);
		}
		return List;
		
        
    }
	
	private static int random(int money, int minS, int maxS, int count) {
		int a=0;
		if(count!=1) {
			a=((int)Math.rint(Math.random() * (maxS-minS) + minS)) % maxS + 1;
		}
		else
			a=money;
		return a;

	    }

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		RedPackets q=new RedPackets();
		List<Integer> List=new ArrayList<Integer>();
		List=splitRedPackets(6, 7);
        if(List==null) {
        	System.out.println("红包金额不合法");
        }
        else
        	System.out.println(List);
	}

}
