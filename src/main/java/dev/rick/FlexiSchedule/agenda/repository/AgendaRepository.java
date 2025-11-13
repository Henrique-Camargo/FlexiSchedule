package dev.rick.FlexiSchedule.agenda.repository;

import dev.rick.FlexiSchedule.agenda.domain.AgendaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AgendaRepository extends JpaRepository<AgendaModel, Long> {

}
