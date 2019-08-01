package by.epam.my_study.task3;

public enum DayOfWeek {

    SATURDAY("St"),
    SUNDAY("Su"),
    MONDAY("Mn"),
    TUESDAY("Tu"),
    WEDNESDAY("Wn"),
    THURSDAY("Th"),
    FRIDAY("Fr");



    private String shortName;

    DayOfWeek(String shortName){
        this.shortName = shortName;
    }

    public String getShortName() {
        return shortName;
    }
}
