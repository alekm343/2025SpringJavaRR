/**Задача №3
 Необходимо создать класс Manager с полями:
 имя, возраст, пол, ЗП в день и количество подчиненных.
 Класс должен иметь метод
 - getSalary(Month[] monthArray),
 метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
 К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного
 */
public class Manager {
    public String name;
    public int age;
    public char sex;
    public double dailySalary;
    public int noOfSubordinates;

    public double getSalary(Month[] months) {
        double salary = 0;
        for (Month month : months) {
            salary += getMonthlySalary(month);
        }
        return salary;
    }
    public double getMonthlySalary(Month month){
        double bonusCoeff = 1 + noOfSubordinates * 0.01;
        return month.workingDays * dailySalary * bonusCoeff;
    }

}
