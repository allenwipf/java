package com.allenwipf;

/**
 * Created by Wipf on 5/9/17.
 */
public class VipCustomer {
    private String name;
    private double limit;
    private String email;

    // Empty Constructor
    public VipCustomer() {
        this("John Doe", 50_000, "example@example.com");
    }

    // Partial Constructor
    public VipCustomer(String name, double limit) {
        this(name, limit, "example@example.com");
    }
    // Full Constructor
    public VipCustomer(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
