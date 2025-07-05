class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        n=len(prices)

        # step 1 to find the profit from day 0 to i

        left_profit = [0] * n
        min_price = prices[0]
        for i in range (1,len(prices)):
            min_price= min(min_price,prices[i])
            left_profit[i] = max(left_profit[i-1],prices[i]-min_price)

        # step 2 to find profit from day i to n-1

        right_profit = [0] * n
        max_price = prices[n-1]
        for i in range (n-2,-1,-1):
            max_price = max(max_price,prices[i])
            right_profit[i] =max(right_profit[i+1], max_price-prices[i])

        # step 3 is to find total profit from two transactions 

        max_total_profit = 0
        for i in range(n):
            total_profit = left_profit[i] + (right_profit[i+1] if i+1 < n else 0)
            max_total_profit = max(max_total_profit, total_profit)
        return max_total_profit
          
        