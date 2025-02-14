package _2024.winter.democicdimproved.email.repository;

import _2024.winter.democicdimproved.email.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmailRepository extends JpaRepository<Email, Long> {
}
