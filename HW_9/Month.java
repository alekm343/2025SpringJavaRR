/** Задача №1
 Создать класс Month с полями:
 имя месяца,
 количеством дней и
 количеством рабочих дней.

 Задача №1_9
 Создать неизменяемый (immutable) класс Month с полями:
 имя месяца,
 количеством дней и количеством рабочих дней.
 Поля должны быть спрятаны, для каждого поля создать getter.
 Создать класс MonthUtils который бы хранил подготовленные месяцы
 или их массивы для использования (объекты класса Month).
 */
public class Month {
    private final String name;
    private final int days;
    private final int workingDays;

    public Month(String name, int days, int workingDays) {
        this.name = name;
        this.days = days;
        this.workingDays = workingDays;
    }
    public String getName() {
                return name;
    }

    public int getDays() {
                return days;
    }

    public int getWorkingDays() {
               return workingDays;
    }
}
