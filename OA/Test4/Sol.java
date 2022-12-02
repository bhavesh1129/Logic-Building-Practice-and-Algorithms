package OA.Test4;

public class Sol {
    public static abstract class Employee {
        public abstract void setSalary(int salary);

        public abstract int getSalary();

        public abstract void setGrade(String grade);

        public abstract String getGrade();

        void label() {
            System.out.println("Employee's data:");
        }
    }

    static class Engineer extends Employee {
        private int salary;
        private String grade;

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return grade;
        }
    }

    public static class Manager extends Employee {

        private int salary;
        private String grade;

        public void setSalary(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }

        public void setGrade(String grade) {
            this.grade = grade;
        }

        public String getGrade() {
            return grade;
        }
    }

    public static void main(String args[]) {
        Engineer e1 = new Engineer();
        e1.label();
        e1.setSalary(1000);
        e1.setGrade("A");
        System.out.println("GRADE:" + e1.getGrade());
        System.out.println("SALARY:" + e1.getSalary());
        Manager m1 = new Manager();
        m1.label();
    }
}