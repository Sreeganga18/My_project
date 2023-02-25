package Examples;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String []args) {
		ArrayList<String> ob=new ArrayList();
		ob.add("sreeganga");
		ob.add("sreelekshmi");
		ob.add("lekshmi");
		ob.add("aji");
		ob.add("cijin");
		System.out.println(ob);
		ob.remove(1);
		System.out.println("after deletion"+ob);
		for(int i=0;i<ob.size();i++) {
			System.out.println(ob.get(i));
		}
		for(String a:ob) {
			System.out.println(a);
		}
		
	}

}
