package com.Binde.hive.dto.response;

import com.Binde.hive.entity.Address;
import com.Binde.hive.enums.Role;
import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserRegistrationResponseDto {

    private String fullName;

    private String email;

    private String phoneNumber;

    private Address address;

    private Boolean isVerified;

    private Role role;

}
