package dev.rick.FlexiSchedule.reserva.domain;

import dev.rick.FlexiSchedule.agenda.domain.AgendaModel;
import dev.rick.FlexiSchedule.reserva.enums.ReservaStatus;
import dev.rick.FlexiSchedule.user.domain.UserModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "tb_reserva")
@NoArgsConstructor
@AllArgsConstructor
public class ReservaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userId;

    @ManyToOne
    @JoinColumn(name = "agenda_id")
    private AgendaModel agendaId;

    private ReservaStatus reservaStatus;
    private LocalDateTime criadoEm;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserModel getUserId() {
        return userId;
    }

    public void setUserId(UserModel userId) {
        this.userId = userId;
    }

    public AgendaModel getAgendaId() {
        return agendaId;
    }

    public void setAgendaId(AgendaModel agendaId) {
        this.agendaId = agendaId;
    }

    public ReservaStatus getReservaStatus() {
        return reservaStatus;
    }

    public void setReservaStatus(ReservaStatus reservaStatus) {
        this.reservaStatus = reservaStatus;
    }

    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }

    public void setCriadoEm(LocalDateTime criadoEm) {
        this.criadoEm = criadoEm;
    }
}
