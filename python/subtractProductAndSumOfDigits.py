class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        sum = 0
        product = 1
        for i in list(str(n)):
            sum += int(i)
            product = product * int(i)
        return product - sum

