package test.mapstruct.simple;

import org.junit.Test;

import test.mapstruct.simple.EmployeeDTO;
import test.mapstruct.simple.EmployeeMapper;
import test.mapstruct.simple.EmployeeRecord;

public class MapperTest
{

    @Test
    public void simple()
    {
        EmployeeDTO employeeDTO = new EmployeeDTO();
        employeeDTO.setFamilyName("Schaefer");
        employeeDTO.setFirstName("Mark");
        employeeDTO.setId("1");
        employeeDTO.setPhone("+49 5435 5454");
        employeeDTO.setReferenceNumber(4324);

        EmployeeRecord employeeRecord = EmployeeMapper.INSTANCE.from(employeeDTO);

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

        EmployeeDTO employee = EmployeeMapper.INSTANCE.from(employeeRecord);

        System.out.println(employee);

    }

}
