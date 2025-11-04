package dev.rick.FlexiSchedule.reserva.controller;

import dev.rick.FlexiSchedule.reserva.domain.ReservaModel;
import dev.rick.FlexiSchedule.reserva.services.ReservaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservas")
public class ReservaController {

    private final ReservaService service;

    public ReservaController(ReservaService service) {
        this.service = service;
    }

    @PostMapping("/salvar")
    public ResponseEntity<ReservaModel> salvar(@RequestBody ReservaModel model){
        return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                        .body(service
                            .salvar(model));
    }

    @GetMapping("/buscar")
    public ResponseEntity<List<ReservaModel>> buscarTodos(){
        return ResponseEntity.ok(service.buscarTodos());
    }

}
