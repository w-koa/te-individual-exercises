package com.techelevator.worker;

public class HourlyWorker implements Worker {

    private double hourlyRate;
    private String firstName;
    private String lastName;

    public HourlyWorker(double hourlyRate, String firstName, String lastName) {
        this.hourlyRate = hourlyRate;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /*
    * Time and a half for overtime
    * Otherwise its hourly rate * hours worked
    */
    @Override
    public double calculateWeeklyPay(int hoursWorked) {
        double pay = hourlyRate * hoursWorked;

        if (hoursWorked > 40) {
            double overtime = hoursWorked - 40;
            pay = pay + (hourlyRate * overtime * 0.5);
        }
        return pay;
    }
}
