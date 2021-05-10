package leetcode_practice;


public class leetcode_210510 {
	// 1716. Calculate Money in Leetcode Bank
	// Hercy wants to save money for his first car. He puts money in the Leetcode
	// bank every day.
	// He starts by putting in $1 on Monday, the first day. Every day from Tuesday
	// to Sunday, he will put in $1 more than the day before.
	// On every subsequent Monday, he will put in $1 more than the previous Monday.
	// Given n, return the total amount of money he will have in the Leetcode bank
	// at the end of the nth day.

	class Solution {
	    public int totalMoney(int n) {

			//Calculates the number of weeks given.
			int weekCount = n / 7;
			//Calculate the amount saved on Monday of the last week.
			int lastWeekMon = 1 + weekCount;
			//Calculate the number of days remaining. ->Determine the days of the week from Monday to Sunday.
			int remainingDay = n % 7;
			//sum of all the money saved in the first week.
			int weekbase = 28;
			//Total weekly increase
			int increment = 7;
			//The first sum of savings starts with a zero.
			int total = 0;
			//Counting the number of days given and adding.
			while (weekCount >= 1) {
				//One cycle reduces the weekly count.
				weekCount--;
				//Calculate the amount of increase by multiplying the base sum by the week 7 if the total price exceeds one week.
				total += weekbase + (increment * weekCount);
			}
			//Monday of the last week
			int l = lastWeekMon;
			//Calculate and add the remaining days of the last week.
			while (remainingDay >= 1) {
				//Add the last Monday's money to the sum.
				total += l;
				//Increase prices for the next day of the last week.
				l++;
				//Deduct the remaining days of the week.
				remainingDay--;
			}
			return total;
		}

	}

}
