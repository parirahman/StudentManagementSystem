package termproject;

import java.util.ArrayList;
import java.util.Iterator;

public class currentofferedcourse implements Iterable<course> {
	private ArrayList<course> clist= new ArrayList<course>();
	Iterator<course> iterator = clist.iterator();
	public currentofferedcourse () {
	}
	public void addcourse(course c1) {
		clist.add(c1);
	}
		
	public course getcourse(course c2) {

		while(iterator.hasNext()) {
		    course element = iterator.next();
		    if (c2==element) {
		    	return c2;
		    }
		}
		return null;
			

	}
	public ArrayList<course> getcourselist() {		
		return clist;
	}
	@Override
	public Iterator<course> iterator() {

		return clist.iterator();
	}


	

}
