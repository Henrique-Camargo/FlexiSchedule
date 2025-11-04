package dev.rick.FlexiSchedule.agenda.services;

import dev.rick.FlexiSchedule.agenda.domain.AgendaModel;
import dev.rick.FlexiSchedule.agenda.repository.AgendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AgendaService {

    private final AgendaRepository repository;

    public AgendaService(AgendaRepository repository) {
        this.repository = repository;
    }

    public AgendaModel salvar(AgendaModel model){
        return repository.save(model);
    }

    public List<AgendaModel> buscarTodos(){
        return repository.findAll();
    }

}
