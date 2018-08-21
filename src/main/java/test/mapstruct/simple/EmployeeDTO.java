package test.mapstruct.simple;

public class EmployeeDTO
{

    private String id;
    private String firstName;
    private String familyName;

    private String phone;

    private int referenceNumber;

    public int getReferenceNumber()
    {
        return referenceNumber;
    }

    public void setReferenceNumber(int referenceNumber)
    {
        this.referenceNumber = referenceNumber;
    }

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
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
        return "EmployeeDTO [id=" + id + ", firstName=" + firstName + ", familyName=" + familyName
            + ", phone=" + phone + ", referenceNumber=" + referenceNumber + "]";
    }

}
