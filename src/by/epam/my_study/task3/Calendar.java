package by.epam.my_study.task3;

import java.util.ArrayList;
import java.util.Collections;

/*
создать класс Календарь с внутренним классом, с помощью рбъектов которого можно хранить информацию о выходных и праздничных
днях.
 */
public  class Calendar {
    private static int startDay = 1;
    private static int startMonth = 1;
    private static int startYear = 2000;
    private static DayOfWeek weekDay = DayOfWeek.SATURDAY;

    Calendar(){}

    public static String showDayOfWeek(int day, int month, int year){

        Month [] arrayMonth = Month.values();

        boolean isRightDate = (day > 0 && day <= arrayMonth[month - 1].getMaxValue() && year >= 2000) || (day == 29 && month == 2 && year % 4 == 0);

        if(isRightDate) {
            int countIntercalaryYear = 0;
            for (int i = startYear; month <= 2 ? i < year : i <= year; i++) { // считаем сколько раз попадается февраль высокосного года, тернарный оператор отвечает за месяц заданного года, если до марта то не провераем год на высокосный, если после то проверяем.
                if (i % 4 == 0) {
                    countIntercalaryYear++;
                }
            }



            int years = year - startYear;

            int months = 0;
            for(int i = 0; i < month - 1; i++){
                months += arrayMonth[i].getMaxValue();
            }


            int days = day - startDay + months + years * 365 + countIntercalaryYear; //сколько дней прошло с 01.01.2000

            days = days % 7;
            DayOfWeek whatDay;
            for (DayOfWeek weekDay : DayOfWeek.values()) {
                if (weekDay.ordinal() == days) {
                    return weekDay.getShortName();
                }

            }
        }


        return "Incorrect value. Starting date is " + startDay + "." + Month.JANUARY.toString().toLowerCase() + "." + startYear + "; \nIn month " + arrayMonth[month - 1].name() + ": " + arrayMonth[month - 1].getMaxValue() + " days.\nYou input : " + day + "." + arrayMonth[month - 1].name() + "." + year + ".";
    }



     class Holiday{
        private ArrayList<String> holidays = new ArrayList<String>();

        public void addHoliday(int day, Month month){
            boolean isRightDate = day > 0 && day <= month.getMaxValue();
            if(isRightDate){
                holidays.add(addToPosition(day,month.ordinal()),(day + "." + month.ordinal()));
            }else{
                System.out.println("Incorrect date. Must be dd.mm, your input: " + day + "." + month.name());
            }



        }


        public void showHolidaysOfYear(int year){


            if(year >= 2000 && holidays.size() > 0){
                Month [] months = Month.values();

                for(int i = 0; i < holidays.size(); i++){
                    String [] dayAndMonth = holidays.get(i).split("\\.");
                    System.out.println(Calendar.showDayOfWeek(Integer.parseInt(dayAndMonth[0]), Integer.parseInt(dayAndMonth[1]) + 1, year) + " " + dayAndMonth[0] + "." + months[Integer.parseInt(dayAndMonth[1])] + "." + year);
                }
            }else{
                System.out.println("There are no holidays");
            }


        }


        private int addToPosition(int day, int month){
            int index = 0;
            for(int i = 0; i < holidays.size(); i++){
                String [] dayMonth = holidays.get(i).split("\\.");

                if(month < Integer.parseInt(dayMonth[1])){
                    index = i;
                    break;
                }else if(month == Integer.parseInt(dayMonth[1]) && day < Integer.parseInt(dayMonth[0])){
                    index = i;
                    break;
                }else{
                    if(i < holidays.size() - 1){
                        continue;
                    }else{
                        index = holidays.size();
                    }
                }
            }
            return index;
        }
    }



}
