package dev.rick.FlexiSchedule.reserva.services;

import dev.rick.FlexiSchedule.reserva.domain.ReservaModel;
import dev.rick.FlexiSchedule.reserva.repository.ReservaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservaService {

    private final ReservaRepository repository;

    public ReservaService(ReservaRepository repository) {
        this.repository = repository;
    }

    public ReservaModel salvar(ReservaModel model){
        return repository.save(model);
    }

    public List<ReservaModel> buscarTodos(){
        return repository.findAll();
    }

}
