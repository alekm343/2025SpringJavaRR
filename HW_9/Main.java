
public class Main {
    public static void main(String[] args) {

        Employee archer = new Employee("Name Lastname", 1000);
         archer.setAge(30);
         archer.setSex('M');

//        archer.name = "Name Lastname";
//        archer.age = 30;
//        archer.sex = 'M';
//        archer.dailySalary = 1000.0;

        System.out.println(archer.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(archer.getSalary(MonthUtils.Q2));

        Manager mallory = new Manager("Mallory Lastname", 30, 'F', 1000.0,10);


        System.out.println(mallory.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(mallory.getSalary(MonthUtils.Q2));

        Manager archerManager = archer.convertToManager(2);
        System.out.println(archerManager.getSalary(MonthUtils.FULL_YEAR));


    }
}
