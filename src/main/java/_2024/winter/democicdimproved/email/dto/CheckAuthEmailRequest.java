package _2024.winter.democicdimproved.email.dto;

import lombok.Data;

@Data
public class CheckAuthEmailRequest {
    public String email;
    public String authNum;
}