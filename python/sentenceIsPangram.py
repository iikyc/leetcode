class Solution:
    def checkIfPangram(self, sentence: str) -> bool:
        seen = []
        sentence = list(sentence)
        for i in sentence:
            if i not in seen:
                seen.append(i)
        if len(seen) == 26:
            return True
        else:
            return False

