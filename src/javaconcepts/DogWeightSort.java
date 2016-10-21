package javaconcepts;

import java.util.Comparator;

public class DogWeightSort implements Comparator<Dog>{

	@Override
	public int compare(Dog o1, Dog o2) {
		
		if(o1.dogweight>o2.dogweight)
			return 1;
		else if(o1.dogweight<o2.dogweight)
			return -1;
		else
			return 0;
	
	}

}
