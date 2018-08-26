public static void main (String[] args) throws java.lang.Exception
	{
		char[] tester = new char[] {'M', 'r', ' ', 'J', 'o', 'h', 'n', ' ', 'S', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' '};
		changeSpaces(tester, 13);           
		System.out.println(tester);
	}
	
	public static void changeSpaces(char[] string, int size){
	    int spaces = 0;
	    for (int i = 0; i < size; i++){
	        if (string[i] ==  ' '){
	            spaces++;
	        }
	    }
	    int newSize = size + (spaces * 2);
	    
	    for (int j = size - 1; j >= 0; j--){
	        if (string[j] == ' '){
	            string[newSize-1] = '0';
	            string[newSize-2] = '2';
	            string[newSize-3] = '%';
	            newSize -= 3;
	        }
	        else{
	            string[newSize - 1] = string[j];
	            newSize -= 1;
	        }
	    }
	}
