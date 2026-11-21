class Solution:
    def decodeString(self, s: str) -> str:
        countStack = []
        stringStack = []

        currentNum = 0
        currentString = ""

        for ch in s:
            if ch.isdigit():
                currentNum = currentNum * 10 + int(ch)

            elif ch == '[':
                countStack.append(currentNum)
                stringStack.append(currentString)

                currentNum = 0
                currentString = ""

            elif ch == ']':
                repeat = countStack.pop()
                previousString = stringStack.pop()

                currentString = previousString + currentString * repeat

            else:
                currentString += ch 
        return currentString