class Solution {
	public String interpret(String command) {
		String res = "";
		for (int i = 0; i < command.length(); i++) {
			if (command.charAt(i) == 'G' || command.charAt(i) == 'a' || command.charAt(i) == 'l') {
				res += Character.toString(command.charAt(i));
			} else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
				res += "o";
				i += 1;
			} else if (command.charAt(i) == '(' && (command.charAt(i + 1) == 'a' && command.charAt(i + 2) == 'l')) {
				res += Character.toString(command.charAt(i + 1));
                res += Character.toString(command.charAt(i + 2));    
				i += 2;
			}

		}
		return res;
	}
}
