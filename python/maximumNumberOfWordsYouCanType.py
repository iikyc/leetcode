class Solution:
    def canBeTypedWords(self, text: str, brokenLetters: str) -> int:
        count = 0
        text = text.split(" ")
        for i in text:
            for charc in brokenLetters:
                if charc in i:
                    break
            else:
                count += 1
        return count

