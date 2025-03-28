/**Задача №2
 Необходимо создать класс Employee с полями:
 имя, возраст, пол и ЗП в день.
 Класс должен иметь метод - getSalary(Month[] monthArray),
 метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
 */

public class Employee {

    public String name;
    public int age;
    public char sex;
    public double dailySalary;

    public double getSalary(Month[] months) {
        double salary = 0;
        for (Month month : months) {
            salary += getMonthlySalary(month);
        }
        return salary;
    }
    public double getMonthlySalary(Month month){
        return month.workingDays * dailySalary;
    }

}
