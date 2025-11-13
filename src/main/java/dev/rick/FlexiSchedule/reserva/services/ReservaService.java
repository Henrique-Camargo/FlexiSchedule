package dev.rick.FlexiSchedule.reserva.services;

import dev.rick.FlexiSchedule.agenda.domain.AgendaModel;
import dev.rick.FlexiSchedule.agenda.repository.AgendaRepository;
import dev.rick.FlexiSchedule.reserva.domain.ReservaModel;
import dev.rick.FlexiSchedule.reserva.repository.ReservaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ReservaService {

    private final ReservaRepository ReservaRepository;

    private final AgendaRepository agendaRepository;

    public ReservaService(ReservaRepository reservaRepository, AgendaRepository agendaRepository) {
        ReservaRepository = reservaRepository;
        this.agendaRepository = agendaRepository;
    }

    @Transactional
    public ReservaModel salvar(ReservaModel model){

        return ReservaRepository.save(model);
    }

    public List<ReservaModel> buscarTodos(){
        return ReservaRepository.findAll();
    }

}
