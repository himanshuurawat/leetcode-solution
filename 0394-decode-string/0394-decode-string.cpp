class Solution {
public:
    string decodeString(string s) {
          stack<int> countStack;
        stack<string> stringStack;

        int currentNum = 0;
        string currentString = "";

        for (char ch : s) {
            if (isdigit(ch)) {
                currentNum = currentNum * 10 + (ch - '0');
            }
            else if (ch == '[') {
                countStack.push(currentNum);
                stringStack.push(currentString);

                currentNum = 0;
                currentString = "";
            }
            else if (ch == ']') {
                int repeat = countStack.top();
                countStack.pop();

                string previousString = stringStack.top();
                stringStack.pop();

                string decoded = "";

                for (int i = 0; i < repeat; i++) {
                    decoded += currentString;
                }

                currentString = previousString + decoded;
            }
            else {
                currentString += ch;
            }
        }

        return currentString;
    }
};