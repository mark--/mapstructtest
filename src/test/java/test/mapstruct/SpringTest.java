package test.mapstruct;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringTest
{

    @Autowired
    private EmployeeMapper employeeMapper;

    @Test
    public void simple()
    {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setFamilyName("Schaefer");
        employeeDTO.setFirstName("Mark");
        employeeDTO.setId("1");
        employeeDTO.setPhone("+49 5435 5454");
        employeeDTO.setReferenceNumber(4324);

        EmployeeRecord employeeRecord = employeeMapper.from(employeeDTO);

        System.out.println(employeeRecord);

    }

    @Test
    public void simple2()
    {

        EmployeeRecord employeeRecord = new EmployeeRecord();
        employeeRecord.setEmployeeId("fd");
        employeeRecord.setFamilyName("Meier");
        employeeRecord.setFirstName("Karsten");
        employeeRecord.setPhone("phone");
        employeeRecord.setReference("563453");

        EmployeeDTO employee = employeeMapper.from(employeeRecord);

        System.out.println(employee);

    }

}
