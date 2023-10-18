package ex07;

public class Employee {
    private String firstName;
    private String lastName;
    private float monthWage;

    public Employee(String firstName, String lastName, float monthWage) {
        this.firstName = firstName;
        this.lastName = lastName;
        if(monthWage < 0) {
            this.monthWage = 0;
        } else {
            this.monthWage = monthWage;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public float getMonthWage() {
        return monthWage;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthWage(float raise) {
        this.monthWage = (monthWage * (raise / 100)) + monthWage;
    }
}
