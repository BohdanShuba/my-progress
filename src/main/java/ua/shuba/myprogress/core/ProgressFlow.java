package ua.shuba.myprogress.core;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ProgressFlow {
    private Long version;
    private BigDecimal shift;
    private LocalDateTime dateTime;
}
