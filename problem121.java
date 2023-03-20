public class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        
        return maxProfit;
    }
}

/*
create an instance of the Solution class and call its maxProfit method with various input arrays. Assert that the output is equal to the expected value. 
These tests cover the cases of an array with multiple values, an empty array, an array with no profit to be made, and an array with only one value.
**/

import org.junit.Test;
import static org.junit.Assert.*;

public class SolutionTest {
    
    @Test
    public void testMaxProfitWithMultipleValues() {
        int[] prices = {7, 1, 5, 3, 6, 4};
        Solution solution = new Solution();
        int expected = 5;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMaxProfitWithEmptyArray() {
        int[] prices = {};
        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMaxProfitWithNoProfit() {
        int[] prices = {7, 6, 4, 3, 1};
        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }
    
    @Test
    public void testMaxProfitWithOneValue() {
        int[] prices = {1};
        Solution solution = new Solution();
        int expected = 0;
        int actual = solution.maxProfit(prices);
        assertEquals(expected, actual);
    }
}
