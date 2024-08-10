/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package vu.oop_coursework;

/**
 *
 * @author HP
 */
public class BalexCompany {
    public static void calculatePay(double basePay, int hoursWorked) {
        final double MINIMUM_WAGE = 8.00;
        final int REGULAR_HOURS = 40;
        final int MAX_HOURS = 60;
        final double OVERTIME_MULTIPLIER = 1.5;
        if (basePay < MINIMUM_WAGE) {
            System.out.println("Error: Base pay is below the minimum wage.");
            return;
        }
        if (hoursWorked > MAX_HOURS) {
            System.out.println("Error: Hours worked exceed the maximum allowed (60 hours).");
            return;
        }
        double totalPay;
        if (hoursWorked <= REGULAR_HOURS) {
            totalPay = hoursWorked * basePay;
        } else {
            int overtimeHours = hoursWorked - REGULAR_HOURS;
            totalPay = (REGULAR_HOURS * basePay) + (overtimeHours * basePay * OVERTIME_MULTIPLIER);
        }

        System.out.println("Total pay for " + hoursWorked + " hours at $" + basePay + " per hour is $" + totalPay);
    }
    public static void main(String[] args) {
        calculatePay(7.50, 35);
        calculatePay(8.20, 47);
        calculatePay(10.00, 73);
    }
}

