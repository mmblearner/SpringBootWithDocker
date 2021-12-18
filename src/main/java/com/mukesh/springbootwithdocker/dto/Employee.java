package com.mukesh.springbootwithdocker.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Mukesh Bhoge
 **/
@Data
@Builder
public class Employee {
    private final String firstName;
    private final String lastName;
    private final String phoneNumber;
    private final Integer employeeId;
    private final Integer salary;
}
