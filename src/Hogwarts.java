import java.util.Objects;

public class Hogwarts {
    private final String fullName;
    private Integer thePowerOfMagic;
    private Integer transgression;

    public Hogwarts(String fullName, Integer thePowerOfMagic, Integer transgression) {
        this.fullName = fullName;
        this.thePowerOfMagic = thePowerOfMagic;
        this.transgression = transgression;
    }

    public String getFullName() {
        return fullName;
    }

    public Integer getThePowerOfMagic() {
        return thePowerOfMagic;
    }

    public Integer getTransgression() {
        return transgression;
    }
    public void bestStudentInHogwarts(Hogwarts hogwarts) {
        int thisStudent = this.getThePowerOfMagic() + this.getTransgression();
        int student = hogwarts.getThePowerOfMagic() + hogwarts.getTransgression();
        System.out.println((thisStudent > student) ?
                this.getFullName() + " обладает бОльшей мощностью магии, чем " + hogwarts.getFullName() :
                hogwarts.getFullName() + " обладает бОльшей мощностью магии, чем " + this.getFullName());
    }

    //    public void thePowerOfMagicHogwarts(Hogwarts hogwarts) {
//        if (thePowerOfMagicHarryPotter(hogwarts) > thePowerOfMagicDracoMalfoy()) {
//            System.out.println("Draco Malfoy лучше чем Graham Montague");
//        } else {
//            System.out.println("Graham Montague лучше чем Draco Malfoy");
//        }
//    }



//    public void setEmployee(String fullName, int salary) {
//        for (int i = 0; i < employees.length; i++) {
//            if (employees[i] != null) {
//                if (employees[i].getFullName().equals(fullName)) {
//                    employees[i].setSalary(salary);
//                    System.out.println("сотрудник изменен - " + employees[i]);
//                }
//            }
//        }
//    }
}

