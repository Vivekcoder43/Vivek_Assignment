package problem3;

import java.util.ArrayList;


public class Queu {
	ArrayList<Integer> li=new ArrayList<Integer>();
	
	void add_e(int x) {
		li.add(x);
	}
	void pop() {
		if(li.size()>0)
		 li.remove(li.size()-1);

	}
	void peek(){
		System.out.println(li.get(0));
		
	}
	void printe() {
		for (int i: li) {
			System.out.print(i+" ");
			
		}
		System.out.println("all printed");
	}
	void delete() {
		li.clear();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queu q=new Queu();
		q.add_e(1);
		q.add_e(2);
		q.add_e(3);
		q.add_e(4);
		q.printe();
		q.pop();
		q.peek();
		q.printe();
		q.delete();
		q.printe();
            
	}

}
