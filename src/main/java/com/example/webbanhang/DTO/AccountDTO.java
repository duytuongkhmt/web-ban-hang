package com.example.webbanhang.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;


@Data
@NoArgsConstructor
public class AccountDTO implements Serializable {
    private String username;
    private String fullname;
    private String email;
    private String photo;
    private String phoneNumber;
    private String createdBy;
    private Date createdDate;
    private String modifiedBy;
    private Date modifiedDate;
}
