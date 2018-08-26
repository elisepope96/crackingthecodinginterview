public static void main (String[] args) throws java.lang.Exception
	{
		LinkedList<Integer> tester = new LinkedList<Integer>(Arrays.asList(1, 2, 3, 4, 4, 5, 6, 7, 8));
		removeDups(tester.get(0));           
		System.out.println(tester);
	}
	
	public static void removeDups(Node n){
	    HashSet<Integer> set = new HashSet<Integer>();
	    Node previous = null;
	    
	    while (n != null){
	        if (set.contains(n)){
	            previous.next = n.next;
	        }
	        else{
	            set.add(n.data);
	            previous = n.next;
	        }
	        n = n.next;
	    }
	   
	}
