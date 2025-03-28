public class Main {
    public static void main(String[] args) {

        Employee archer = new Employee();
        archer.name = "Name Lastname";
        archer.age = 30;
        archer.sex = 'M';
        archer.dailySalary = 1000.0;

        System.out.println(archer.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(archer.getSalary(MonthUtils.Q2));

        Manager mallory = new Manager();
        mallory.name = "Mallory Lastname";
        mallory.age = 30;
        mallory.sex = 'F';
        mallory.dailySalary = 1000.0;
        mallory.noOfSubordinates = 10;


        System.out.println(mallory.getSalary(MonthUtils.FULL_YEAR));
        System.out.println(mallory.getSalary(MonthUtils.Q2));


    }

}