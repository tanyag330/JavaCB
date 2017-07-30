package Data_Structures;

public class StackUse {

	public static boolean checkBalanced(String expr) throws StackFullException{
		StackUsingArray s = new StackUsingArray(expr.length());
		for(int i = 0; i < expr.length(); i++){
			char currentChar = expr.charAt(i);
			if(currentChar == '(' || currentChar == '{' || currentChar == '[' ){
				s.push(currentChar);
			}
			if(currentChar == ')'){
				int top;
				try {
					top = s.pop();
					if(top != '('){
						return false;
					}

				} catch (StackEmptyException e) {
					return false;
				}
			}
			if(currentChar == '}'){
				int top;
				try {
					top = s.pop();
					if(top != '{'){
						return false;
					}

				} catch (StackEmptyException e) {
					return false;
				}
			}
			if(currentChar == ']'){
				int top;
				try {
					top = s.pop();
					if(top != '['){
						return false;
					}
				} 
				catch (StackEmptyException e) {
					return false;
				}
			}
		}
		return s.isEmpty(); 
	}

	public static void reverseStack(StackUsingArray s1, StackUsingArray s2) throws StackEmptyException, StackFullException{
		
		if(s1.size() <= 1){
			return;
		}
		
		int top = s1.pop();
		reverseStack(s1, s2);
		while(!s1.isEmpty()){
			int currentElement = s1.pop();
			s2.push(currentElement);
		}
		
		s1.push(top);
		
		while(!s2.isEmpty()){
			int currentElement = s2.pop();
			s1.push(currentElement);
		}
		
		
	}

	public static void main(String[] args) throws StackFullException, StackEmptyException {

		StackUsingArray s = new StackUsingArray(5);
		/*for(int i = 0; i < 5; i++){
			s.push(i);
		}
		s.push(5);
		for(int i = 0; i < 5; i++){
			System.out.println(s.pop());
		}
		s.top();*/
		System.out.println(checkBalanced("(){{{aaaa}}}}}"));
		
	}

}
