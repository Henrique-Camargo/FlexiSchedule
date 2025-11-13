package dev.rick.FlexiSchedule.agenda.domain;

import dev.rick.FlexiSchedule.agenda.enums.AgendaStatus;
import dev.rick.FlexiSchedule.reserva.domain.ReservaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "tb_agenda")
@NoArgsConstructor
@AllArgsConstructor
public class AgendaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private AgendaStatus agendaStatus;
    private LocalDate dia;
    private LocalTime inicio;
    private LocalTime fim;
    private Integer duracao;

    @OneToMany(mappedBy = "agendaId")
    private List<ReservaModel> reservas;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AgendaStatus getAgendaStatus() {
        return agendaStatus;
    }

    public void setAgendaStatus(AgendaStatus agendaStatus) {
        this.agendaStatus = agendaStatus;
    }

    public LocalDate getDia() {
        return dia;
    }

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public LocalTime getFim() {
        return fim;
    }

    public void setFim(LocalTime fim) {
        this.fim = fim;
    }

    public LocalTime getInicio() {
        return inicio;
    }

    public void setInicio(LocalTime inicio) {
        this.inicio = inicio;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}
