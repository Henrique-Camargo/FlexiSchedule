package dev.rick.FlexiSchedule.reserva.repository;

import dev.rick.FlexiSchedule.reserva.domain.ReservaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends JpaRepository<ReservaModel, Long> {
}
