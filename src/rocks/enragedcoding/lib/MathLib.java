package rocks.enragedcoding.lib;

/**
 * Created by chris on 12/10/2014.
 */
public class MathLib {
    private double wage;
    private double[] hoursPerDay;
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
     * @param day
     * @param income
     */
    public void addIncome(int day, double income) {
        hoursPerDay[(day - 1)] = income; // the -1 is to make human logic == to cpu logic
    }

    /**
     * setWage methods
     * Sets the local wage variable
     *
     * @param wage
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
        for (int i = 0; i < hoursPerDay.length; i++) {
            totalPay += hoursPerDay[i];
        }
        totalPay = totalPay * wage;
        return totalPay;
    }
}
