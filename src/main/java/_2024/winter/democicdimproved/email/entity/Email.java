package _2024.winter.democicdimproved.email.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Emails")
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "email_id")
    private Long id;

    @Column(name = "address")
    private String address;

    @Column(name = "content")
    private String content;


    @Builder
    public Email(String address, String content) {
        this.address = address;
        this.content = content;
    }
}
