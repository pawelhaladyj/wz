package wz;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Cbmg {
    private Long id;
    private String wzId;
    private LocalDate issueDate;
    private Company wzIssuer;
    private Company certificateIssuer;
    private String certificateNumber;
    private Company wzReceiver;
    private String wzNumber;
    private Address deliveryAddress;
    private String purpose;
    private Dictionary receiptNumber;
    private Dictionary resistance;
    private Dictionary compoundType;
    private Dictionary constant1;
    private Dictionary constant2;
    private Dictionary constant3;
    private Dictionary constant4;
    private BigDecimal quantity;
    private Dictionary registrationPlaneNumber;
    private LocalDate loadTime;
    private LocalDate arrivalTime;
    private LocalDate unloadTimeStart;
    private LocalDate unloadTimeFinish;
    private LocalDate demurrageTime;
    private BigDecimal temperature;
    private Dictionary constant5;
    private Dictionary constant6;
}
