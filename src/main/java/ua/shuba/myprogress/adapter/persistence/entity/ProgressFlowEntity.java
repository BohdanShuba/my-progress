package ua.shuba.myprogress.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name="progress_flow")
@Getter
@Setter
public class ProgressFlowEntity {

    @Id
    private Long id;

    private Long version;

    private BigDecimal shift;

    private LocalDateTime dateTime;

    @ManyToOne(fetch = FetchType.LAZY)
    private ProgressEntity progress;
}
