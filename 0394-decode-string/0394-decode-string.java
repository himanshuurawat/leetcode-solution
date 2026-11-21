class Solution {
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int currentNum = 0;
        StringBuilder currentString = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(currentNum);
                stringStack.push(currentString.toString());

                currentNum = 0;
                currentString = new StringBuilder();
            }
            else if (ch == ']') {
                int repeat = countStack.pop();
                String previousString = stringStack.pop();

                StringBuilder decoded = new StringBuilder();

                for (int i = 0; i < repeat; i++) {
                    decoded.append(currentString);
                }

                currentString = new StringBuilder(previousString);
                currentString.append(decoded);
            }
            else {
                currentString.append(ch);
            }
        }

        return currentString.toString(); 
    }
}