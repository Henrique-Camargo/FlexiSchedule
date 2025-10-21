package dev.rick.FlexiSchedule.user.repository;

import dev.rick.FlexiSchedule.user.domain.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Long> {
}
