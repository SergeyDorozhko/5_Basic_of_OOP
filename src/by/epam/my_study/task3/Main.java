package by.epam.my_study.task3;
/*
создать класс Календарь с внутренним классом, с помощью рбъектов которого можно хранить информацию о выходных и праздничных
днях.
 */

public class Main {
    public static void main(String[] args){

        Calendar calendar = new Calendar();
        Calendar.Holiday belarus = calendar.new Holiday();

        belarus.addHoliday(3, Month.JULY);
        belarus.addHoliday(25, Month.DECEMBER);
        belarus.addHoliday(1, Month.MAY);
        belarus.addHoliday(7, Month.JANUARY);
        belarus.addHoliday(9,Month.MAY);
        belarus.addHoliday(8, Month.MARCH);
        belarus.addHoliday(1, Month.JANUARY);


        belarus.showHolidaysOfYear(2019);
    }
}
