package com.exercise.jobApplication.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Applicant {

    @NotNull(message = "name is required")
    @Size(min=1,message = "name is required")
    private String name;
    @NotNull(message = "email is required")
    @Size(min=1,message = "email is required")
    private String email;
    @NotNull(message = "address is required")
    @Size(min=1,message = "address is required")
    private String address;
    @NotNull(message = "phone number is required")
    private Integer phoneNumber;

    private String jobPosition;

    private String jobLocation;
    @NotNull(message = "cover letter is required")
    @Size(min=10, message = "cover letter is required")
    private String coverLetter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(String jobPosition) {
        this.jobPosition = jobPosition;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }

    public String getCoverLetter() {
        return coverLetter;
    }

    public void setCoverLetter(String coverLetter) {
        this.coverLetter = coverLetter;
    }
}
