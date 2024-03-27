package ua.shuba.myprogress.adapter.persistence.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="progress")
@Getter
@Setter
public class ProgressEntity {
    @Id
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    private UserEntity user;
}
