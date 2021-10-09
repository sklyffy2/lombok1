import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Employee {private int employeeId;
    private String name;
    private String email;
    private String department;
    private Employee manager;
    private String designation;
    private String address;
    private int phoneNumber;
    private int emergencyContact;
    private int yearsAtCompany;
    private int totalExperienceInYears;
}
