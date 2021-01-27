package model;

public class Utilities {
	/*
	 * Input parameters:
	 * 	- `status` is the filing status (which should be 1 for Single Filing or 2 for Married Filing)
	 *  - `income` is the tax payer's income (an integer value)
	 *  
	 * Assumptions:
	 * 	- `income` passed by user is always positive (> 0)
	 */
	public static String getTaxReport(int status, int income) {
		String result = "";
		double total = 0;
		double part1 = 0;
		double part2 = 0;
		double part3 = 0;

		// When user is not married
		if (status == 1) {
			if (income <= 8350) {
				part1 = income * 0.1;
				total = part1;
				result = String.format("Single Filing: $%.2f (Part I: $%.2f)", total, part1);
			}
			else if (income > 8350) {
				part1 = 8350 * 0.1;
			
				if (income <= 33950) {
					part2 = (income - 8350) * 0.15;
					total = part1 + part2;
					result = String.format("Single Filing: $%.2f (Part I: $%.2f, Part II: $%.2f)", total, part1, part2);
				}
				else if (income > 33950) {
					part2 = (33950 - 8350) * 0.15;
					part3 = (income - 33950) * 0.25;
					total = part1 + part2 + part3;
					result = String.format("Single Filing: $%.2f (Part I: $%.2f, Part II: $%.2f, Part III: $%.2f)", total, part1, part2, part3);
				}
			}

		}
		// When user is married
		else if (status == 2) {
			if (income <= 16700) {
				part1 = income * 0.1;
				total = part1;
				result = String.format("Married Filing: $%.2f (Part I: $%.2f)", total, part1);
			}
			else if (income > 16700) {
				part1 = 16700 * 0.1;
			
				if (income <= 67900) {
					part2 = (income - 16700) * 0.15;
					total = part1 + part2;
					result = String.format("Married Filing: $%.2f (Part I: $%.2f, Part II: $%.2f)", total, part1, part2);
				}
				else if (income > 67900) {
					part2 = (67900 - 16700) * 0.15;
					part3 = (income - 67900) * 0.25;
					total = part1 + part2 + part3;
					result = String.format("Married Filing: $%.2f (Part I: $%.2f, Part II: $%.2f, Part III: $%.2f)", total, part1, part2, part3);
				}
			}
			
		}
		// If user does not input 1 or 2 for status
		else {
			result = "Illegal Status: " + status;
		}
		
		return result;
	}
	
	/*
	 * Input parameters:
	 * 	- `p1` is the name of player 1
	 *  - `p2` is the name of player 2
	 *  - `p1r1` is what player 1 plays in round 1 ('R', 'P', or 'S')
	 *  - `p2r1` is what player 2 plays in round 1 ('R', 'P', or 'S')
	 *  - `p1r2` is what player 1 plays in round 2 ('R', 'P', or 'S')
	 *  - `p2r2` is what player 2 plays in round 2 ('R', 'P', or 'S')
	 *  
	 * Assumptions:
	 * 	- `p1r1`, `p2r1`, `p1r2`, or `p2r2` is one of the following characters:
	 *     'R' for rock, 'P' for paper, and 'S' scissors (case-sensitive)
	 */
	public static String getRPSGameReport(String p1, String p2, char p1r1, char p2r1, char p1r2, char p2r2) {
		String result = "";
		String statementFinal = "Tie!";
		String resultr1 = "Tie";
		String resultr2 = "Tie";
		
		// Round 1 of Rock Paper Scissors
		char winnerR1 = ' ';
		char loserR1 = ' ';

		if (p1r1 == 'R'){
			winnerR1 = 'R';
			loserR1 = 'R';
			if (p2r1 == 'P') {
				resultr1 = p2;
				winnerR1 = p2r1;
				loserR1 = p1r1;
			}
			if (p2r1 == 'S') {
				resultr1 = p1;
				winnerR1 = p1r1;
				loserR1 = p2r1;
			}
		}
		else if (p1r1 == 'P'){
			winnerR1 = 'P';
			loserR1 = 'P';
			if (p2r1 == 'S') {
				resultr1 = p2;
				winnerR1 = p2r1;
				loserR1 = p1r1;
			}
			if (p2r1 == 'R') {
				resultr1 = p1;
				winnerR1 = p1r1;
				loserR1 = p2r1;
			}
		}
		else if (p1r1 == 'S'){
			winnerR1 = 'S';
			loserR1 = 'S';
			if (p2r1 == 'R') {
				resultr1 = p2;
				winnerR1 = p2r1;
				loserR1 = p1r1;
			}
			if (p2r1 == 'P') {
				resultr1 = p1;
				winnerR1 = p1r1;
				loserR1 = p2r1;
			}
		}
		
		// Round 2 of Rock Paper Scissors
		char winnerR2 = ' ';
		char loserR2 = ' ';

		if (p1r2 == 'R'){
			winnerR2 = 'R';
			loserR2 = 'R';
			if (p2r2 == 'P') {
				resultr2 = p2;
				winnerR2 = p2r2;
				loserR2 = p1r2;
			}
			if (p2r2 == 'S') {
				resultr2 = p1;
				winnerR2 = p1r2;
				loserR2 = p2r2;
			}
		}
		else if (p1r2 == 'P'){
			winnerR2 = 'P';
			loserR2 = 'P';
			if (p2r2 == 'S') {
				resultr2 = p2;
				winnerR2 = p2r2;
				loserR2 = p1r2;
			}
			if (p2r2 == 'R') {
				resultr2 = p1;
				winnerR2 = p1r2;
				loserR2 = p2r2;
			}
		}
		else if (p1r2 == 'S'){
			winnerR2 = 'S';
			loserR2 = 'S';
			if (p2r2 == 'R') {
				resultr2 = p2;
				winnerR2 = p2r2;
				loserR2 = p1r2;
			}
			if (p2r2 == 'P') {
				resultr2 = p1;
				winnerR2 = p1r2;
				loserR2 = p2r2;
			}
		}
			
		// Decide who is the winner 
		if (resultr1 == p1) {
			if (resultr2 == p1) {
				statementFinal = p1 + " wins!";
			}
			if (resultr2 == "Tie") {
				statementFinal = p1 + " wins!";
			}
		}
		else if (resultr1 == p2) {
			if (resultr2 == p2) {
				statementFinal = p2 + " wins!";
			}
			if (resultr2 == "Tie") {
				statementFinal = p2 + " wins!";
			}
		}
		else if (resultr1 == "Tie") {
			if (resultr2 == p1) {
				statementFinal = p1 + " wins!";
			}
			if (resultr2 == p2) {
				statementFinal = p2 + " wins!";
			}
		}
		
		// add proper string to result, depending on what the value was in the games
		if (resultr1 != "Tie") {
			resultr1 = resultr1 + " wins";
		}
		if (resultr2 != "Tie") {
			resultr2 = resultr2 + " wins";
		}
		
		// setup of final string result
		result = String.format("Game over: %s [Round 1: %s (%c vs. %c) ; Round 2: %s (%c vs. %c)]", statementFinal , resultr1, winnerR1, loserR1, resultr2, winnerR2, loserR2);

		return result;
	}
}
