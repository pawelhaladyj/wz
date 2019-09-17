package wz;

import java.util.Set;

public class Company {
    private Long id;
    private String name;
    private String shortName;
    private String nip;
    private String regon;
    private String phoneNumber;
    private Address registryAddress;

    private Set<Address> deliveryAddresses;
    private Long paleteBalance;
}
