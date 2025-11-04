package dev.rick.FlexiSchedule.agenda.controller;

import dev.rick.FlexiSchedule.agenda.domain.AgendaModel;
import dev.rick.FlexiSchedule.agenda.services.AgendaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/agenda")
public class AgendaController {

    private final AgendaService service;

    public AgendaController(AgendaService service) {
        this.service = service;
    }

    @PostMapping("/salvar")
    public ResponseEntity<AgendaModel> salvar(@RequestBody AgendaModel agenda){
        return ResponseEntity.
                status(HttpStatus.CREATED)
                    .body(service
                            .salvar(agenda));
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<AgendaModel>> buscarTodos(){
        List<AgendaModel> lista = service.buscarTodos().stream().toList();
        return ResponseEntity.ok(lista);
    }
}
