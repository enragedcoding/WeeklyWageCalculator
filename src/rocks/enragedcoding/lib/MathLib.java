package rocks.enragedcoding.lib;

/**
 * @Author: chris
 * @Date: December, 10 2014
 * @Time: 11:13 PM
 */
public class MathLib {
    private final double[] hoursPerDay;
    private double wage;
    private double totalPay;

    /**
     * Our constructor
     */
    public MathLib() {
        hoursPerDay = new double[7];
    }

    /**
     * addIncome method
     * sets the hour to the specified day
     *
     * @param day    hoursPerDay indexer
     * @param income the users input
     */
    public void addIncome(int day, double income) {
        hoursPerDay[(day - 1)] = income; // the -1 is to make human logic == to cpu logic
    }

    /**
     * setWage methods
     * Sets the local wage variable
     *
     * @param wage set users wage per hour
     */
    public void setWage(double wage) {
        this.wage = wage;
    }

    /**
     * getPay double
     * adds all the days hours then times by wage
     *
     * @return totalPay
     */
    public double getPay() {
        for (double aHoursPerDay : hoursPerDay) {
            totalPay += aHoursPerDay;
        }
        totalPay = totalPay * wage;
        return totalPay;
    }
}
