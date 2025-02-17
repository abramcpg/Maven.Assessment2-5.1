package rocks.zipcode.assessment2.objectorientation;

import static java.lang.Long.MIN_VALUE;

/**
 * @author leon on 28/11/2018.
 * @ATTENTION_TO_STUDENTS - Ensure that you have completed the `Address` class before attempting this class
 */
public class Person {
    /**
     * @param id - id of person
     * @param name - name of person
     *@param address - address of person
     */
    private  Person person;
    private Long id = MIN_VALUE;
    private String name = "";
    private Address address = new Address();

    public Person(Long id, String name, Address address) { //constructor
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Person() {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        return (Boolean)null;
    }
}