package org.example.creational.builder;

import org.example.structural.composite.ProjectComponent;

public class Engineer extends ProjectComponent {
    private String firstName;
    private String lastName;
    private String email;
    private double contractCost;

    private Engineer(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.contractCost = builder.contractCost;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public double getContractCost() {
        return contractCost;
    }

    @Override
    public double calculateCost() {
        return getContractCost();
    }

    public static Builder newBuild() {
        return new Builder();
    }


    public static class Builder {
        private String firstName;
        private String lastName;
        private String email;
        private double contractCost;

        public Builder withFirstname(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastname(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withContractCost(double contractCost) {
            this.contractCost = contractCost;
            return this;
        }

        public Engineer build() {
            return new Engineer(this);
        }
    }
}
