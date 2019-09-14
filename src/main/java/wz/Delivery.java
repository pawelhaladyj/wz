package wz;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Delivery {
    private Long id;
    private BigDecimal quantity;
    private Dictionary registrationPlaneNumber;
    private LocalDate loadTime;
    private LocalDate arrivalTime;
    private LocalDate unloadTimeStart;
    private LocalDate unloadTimeFinish;
    private LocalDate demurrageTime;
    private BigDecimal temperature;
}
