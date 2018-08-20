package test.mapstruct;

public class EmployeeRecord
{

    private String employeeId;
    private String firstName;
    private String familyName;
    private String phone;

    private String reference;

    public String getReference()
    {
        return reference;
    }

    public void setReference(String reference)
    {
        this.reference = reference;
    }

    public String getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(String employeeId)
    {
        this.employeeId = employeeId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getFamilyName()
    {
        return familyName;
    }

    public void setFamilyName(String familyName)
    {
        this.familyName = familyName;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return "EmployeeRecord [employeeId=" + employeeId + ", firstName=" + firstName + ", familyName="
            + familyName + ", phone=" + phone + ", reference=" + reference + "]";
    }

}
