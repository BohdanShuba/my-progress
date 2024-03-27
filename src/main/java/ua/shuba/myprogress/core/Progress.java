package ua.shuba.myprogress.core;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class Progress {
    private Long userId;
    private LocalDate date;
    private BigDecimal startNumber;
    private BigDecimal targetNumber;
}
