package com.Binde.hive.dto.request;

import com.Binde.hive.entity.Address;
import com.Binde.hive.enums.Role;
import com.Binde.hive.entity.Task;
import jakarta.validation.constraints.Email;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String fullName;
    @Email
    private String email;
    private String phoneNumber;
    private String validId;
    private Address address;
    private String password;
    private Boolean isVerified;
    private Role role;
    private List<Task> tasks;
}
