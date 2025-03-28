/**Задача №2
 Необходимо создать класс Employee с полями:
 имя, возраст, пол и ЗП в день.
 Класс должен иметь метод - getSalary(Month[] monthArray),
 метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

 Задача №2
 Необходимо создать класс Employee с полями:
 имя, возраст, пол и ЗП в день.
 Имя и ЗП должны быть обязательными, остальные поля — нет.
 Создать необходимые конструкторы и / или setter-ы (по собственному разумению),
 чтобы было удобно создавать эти объекты.
 Класс должен иметь метод - getSalary(Month[] monthArray),
 метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.

 */
public class Employee {

    private final String name;
    private int age;
    private char sex;
    private final double dailySalary;

    public Employee(String name, int age, char sex, double dailySalary) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dailySalary = dailySalary;
    }

    public Employee(String name, double dailySalary) {
        this.name = name;
        this.dailySalary = dailySalary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getSex() {
        return sex;
    }

    public double getDailySalary() {
        return dailySalary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public double getSalary(Month[] months) {
        double salary = 0;
        for (Month month : months) {
            salary += getMonthlySalary(month);
        }
        return salary;
    }
    public double getMonthlySalary(Month month){
        return month.getWorkingDays() * dailySalary;
    }

    public Manager convertToManager(int numberOfSubordinates){
       return new Manager(name,age,sex,dailySalary,numberOfSubordinates);
    }
}
