/**Задача №3
 Необходимо создать класс Manager с полями:
 имя, возраст, пол, ЗП в день и количество подчиненных.
 Класс должен иметь метод
 - getSalary(Month[] monthArray),
 метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
 К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного

 Задача №3
 Необходимо создать класс Manager с полями:
 имя, возраст, пол, ЗП в день и количество подчиненных.
 Поля должны быть спрятаны, для каждого поля создать getter.
 Класс должен иметь метод - getSalary(Month[] monthArray),
 метод возвращает зарплату за те месяцы которые были переданы в качестве аргумента.
 К рассчитанной ЗП должно прибавляться по 1% за каждого подчиненного.

 В классе Employee создать метод convertToManager(int numberOfSubordinates).
 Этот метод создаст и вернет объект типа Manager с теми же личными данными,
 что были у Employee, и запишет переданное в него количество подчиненных.
  */
public class Manager {
    private final String name;
    private int age;
    private char sex;
    private final double dailySalary;
    private int noOfSubordinates;

    public Manager(String name, int age, char sex, double dailySalary, int noOfSubordinates) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.dailySalary = dailySalary;
        this.noOfSubordinates = noOfSubordinates;
    }

    public Manager(String name, double dailySalary) {
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

    public int getNoOfSubordinates() {
        return noOfSubordinates;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public void setNoOfSubordinates(int noOfSubordinates) {
        this.noOfSubordinates = noOfSubordinates;
    }

    public double getSalary(Month[] months) {
        double salary = 0;
        for (Month month : months) {
            salary += getMonthlySalary(month);
        }
        return salary;
    }
    public double getMonthlySalary(Month month){
        double bonusCoeff = 1 + noOfSubordinates * 0.01;
        return month.getWorkingDays() * dailySalary * bonusCoeff;
    }

}