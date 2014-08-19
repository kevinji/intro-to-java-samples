package helloworld;

/**
 * An enum representing each day of the week.
 * @author Kevin Ji
 */
public enum DayOfWeek {
    SUNDAY(0), MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6);
    
    private final int day;
    
    DayOfWeek(int day) {
        this.day = day;
    }
    
    public int getDay() {
        return this.day;
    }
}
