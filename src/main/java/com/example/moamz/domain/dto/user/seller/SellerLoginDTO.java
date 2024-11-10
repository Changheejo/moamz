package com.example.moamz.domain.dto.user.seller;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class SellerLoginDTO {
    private Long fgUserCode;
    private String fgUserId;
    private String fgUserPassword;
}