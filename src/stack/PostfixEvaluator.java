package stack;

public class PostfixEvaluator {
	private final String addition = "+";
	private final String subtraction = "-";
	private final String multiplication = "*";
	private final String division = "/";
	//private Stack<Integer> stack;
	private LinkedStack<Integer> stack;
	private String expression;

	public PostfixEvaluator(String expr) {
		stack = new LinkedStack<>();
		expression = expr;
	}

	// Evaluate expression and return result to main
	public int evaluate() throws Exception  {
		String[] parts = expression.trim().split(" ");
		int count = 0;
		while (count < parts.length) {
			if (parts[count].equals(addition)) {
				int var1 = stack.pop();
				int var2 = stack.pop();
				int sum = var2 + var1;
				stack.push(sum);
			}else if(parts[count].equals(subtraction)){
				int var1 = stack.pop();
				int var2 = stack.pop();
				int subtr = var2 - var1;
				stack.push(subtr);
			}else if(parts[count].equals(multiplication)) {
				int var1 = stack.pop();
				int var2 = stack.pop();
				int multi = var2*var1;
				stack.push(multi);
			}else if(parts[count].equals(division)) {
				int var1 = stack.pop();
				int var2 = stack.pop();
				int divis = var2/var1;
				stack.push(divis);
			}else {
				int var = Integer.parseInt(parts[count]);
				stack.push(var);
			}
			count++;
		}
		return stack.peek();
	}

}
