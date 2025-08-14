package proSky.EmployeeBook.model;

import java.util.Objects;

public class Employee {
    private final String firstName;
    private final String lastName;// фамилия

    // Конструктор
    public Employee(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(firstName, employee.firstName) && Objects.equals(lastName, employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Employee{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + '}';
    }

    //        public static void showAll(Employee[] employees) {
//            for (Employee employee : employees) {
//                if (employee != null) {
//                    System.out.println(employee.toString());
//                } else {
//                    break;
//                }
//            }
//        }
//
//        public static void amountExpenses(Employee[] emp) {
//            double sumAll = 0;
//            for (int i = 0; i < emp.length; i++) {
//                if (emp[i] != null) {
//                    sumAll = sumAll + emp[i].getSalary();
//                }
//            }
//            System.out.println("Сумма затрат на зарплаты в месяц: " + sumAll);
//        }
//
//        public static void minSalary(Employee[] emp) {
//            double min = emp[0].getSalary();
//            for (int i = 0; i < emp.length; i++) {
//                if (emp[i] != null) {
//                    min = Math.min(min, emp[i].getSalary());
//                }
//            }
//            System.out.println("Сотрудник с минимальной зарплатой: " + min);
//        }
//
//        public static void maxSalary(Employee[] emp) {
//            double max = 0;
//            for (int i = 0; i < emp.length; i++) {
//                if (emp[i] != null) {
//                    max = Math.max(max, emp[i].getSalary());
//                }
//            }
//            System.out.println("Сотрудник с максимальной зарплатой: " + max);
//        }
//
//        public static void salaryAverage(Employee[] emp) {
//            double salaryAverage = 0;
//            double sumAll = 0;
//            int counter = 0;
//            for (int i = 0; i < emp.length; i++) {
//                if (emp[i] != null) {
//                    sumAll = sumAll + emp[i].getSalary();
//                    counter++;
//                }
//            }
//            salaryAverage = sumAll / counter;
//            System.out.println("Среднее значение зарплат: " + salaryAverage);
//        }
//
//        public static void printFIO(Employee[] emp) {
//            System.out.println("Печать ФИО всех сотрудников: ");
//            for (int i = 0; i < emp.length; i++) {
//                if (emp[i] != null) {
//                    System.out.println(emp[i].getSurname().toString() + " " + emp[i].getName().toString() + " " + emp[i].getLastname().toString());
//                }
//            }
//        }

}

