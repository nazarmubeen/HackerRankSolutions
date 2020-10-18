package main.java.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GasStation {

	public static void main(String[] args)
	{
		GasStation obj=new GasStation();
		List<Integer> gas=new ArrayList<Integer>(Arrays.asList(83, 521, 491, 907, 871, 705 ));
		List<Integer> cost=new ArrayList<Integer>(Arrays.asList(96, 197, 592, 67, 77, 641));
		//System.out.println(obj.canCompleteCircuit(gas, cost));
		System.out.println(obj.method2(gas, cost));
	}
	
	//optimised
	public int method2(final List<Integer> gas, final List<Integer> cost)
	{
		 if(gas == null || cost == null || gas.size() == 0 || cost.size() == 0 ||
		           gas.size() != cost.size())
		            return -1;
		        int n = gas.size();
		        
		        int sumRemaining= 0;
		        int total = 0;
		        int start = 0;
		        
		        for(int i = 0; i < n; i++){
		        	System.out.println(" start "+start+" i "+i);
		            int remaining = gas.get(i) - cost.get(i);
		            System.out.println(" remaining "+remaining);
		            if(sumRemaining >= 0)
		            {
		                sumRemaining += remaining;
		            System.out.println("sumRemaining "+sumRemaining);
		            }else{
		            	System.out.println("sum remaining is negative");
		                sumRemaining = remaining;
		                start = i;
		                System.out.println("sumRemaining "+sumRemaining);
		            }
		            total += remaining;
		            System.out.println("total "+total);
		        }
		        
		        if(total >= 0)
		            return start;
		        else return -1;                               
		    }

	
	public int canCompleteCircuit(final List<Integer> gas, final List<Integer> cost) {
	
		if(gas == null || cost == null || gas.size() == 0 || cost.size() == 0 ||
		           gas.size() != cost.size())
		            return -1;	
		if(gas.size()==1)
		{
			if(gas.get(0)==0 && cost.get(0)==0)
			{
				return 0;
			}
			else{
				return -1;
			}
		}
	int status=-1;
	int tankInGas=0;
	int costToReachNextStation=0;
	int i=0;
	status=i;
	while(true)
	{
		System.out.println("currentt i "+i);
		
		tankInGas=tankInGas+gas.get(i);
		System.out.println("tankInGas "+tankInGas );
		costToReachNextStation=cost.get(i);
		if(tankInGas>=costToReachNextStation)
		{
			i++;
			if(i>=gas.size())
			{
				if(status==0)
				{
					return 0;
				}
				i=0;
			}
			else if(i==status)
			{
				return status;
			}
			tankInGas=tankInGas-costToReachNextStation;
			continue;
		}
		else{
			System.out.println("else");
			i=status+1;
			status=i;
			tankInGas=0;
			costToReachNextStation=0;
			System.out.println("i now "+i);
			if(i>=gas.size())
			{
				return -1;
			}
		}
		
	}
	
	}
}
