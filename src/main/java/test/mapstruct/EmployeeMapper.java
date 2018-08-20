package test.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface EmployeeMapper
{

    public EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    @Mapping(source = "employeeId", target = "id")
    @Mapping(source = "reference", target = "referenceNumber")
    EmployeeDTO from(EmployeeRecord employeeRecord);

    @Mapping(source = "id", target = "employeeId")
    @Mapping(source = "referenceNumber", target = "reference")
    EmployeeRecord from(EmployeeDTO employeeDTO);

    @Mapping(target = "employeeId", source = "reference.id")
    @Mapping(target = "reference", source = "reference.reference")
    EmployeeRecord from(EmployeeDTO employeeDTO, Reference reference);

    @Mapping(target = "employeeId", source = "referenceHolder.reference1.id")
    @Mapping(target = "reference", source = "referenceHolder.reference2.reference")
    EmployeeRecord fromupdate(EmployeeDTO employeeDTO, ReferenceHolder referenceHolder);

    @Mapping(target = "familyName", ignore = true)
    @Mapping(target = "firstName", ignore = true)
    @Mapping(target = "phone", ignore = true)
    @Mapping(target = "referenceNumber", source = "reference")
    void update(@MappingTarget EmployeeDTO dto, Reference reference);

}
