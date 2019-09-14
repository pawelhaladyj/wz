package wz;

import java.util.Set;

public class Address {
    private Long id;
    private String country;
    private String city;
    private String zipcode;
    private String street;
    private String initialNumber;
    private String apartmentNumber;

    private Set<Company> clients;
}
