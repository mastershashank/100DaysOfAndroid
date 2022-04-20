package com.example.firebasetesting;

public class UserHelperClass {

    String name, branch, collegeRoll, registration,email, nativePlace, contactNo;

    public UserHelperClass() {

    }

    public UserHelperClass(String name, String branch, String collegeRoll, String registration, String email, String nativePlace, String contactNo) {
        this.name = name;
        this.branch = branch;
        this.collegeRoll = collegeRoll;
        this.registration = registration;
        this.email = email;
        this.nativePlace = nativePlace;
        this.contactNo = contactNo;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getCollegeRoll() {
        return collegeRoll;
    }

    public void setCollegeRoll(String collegeRoll) {
        this.collegeRoll = collegeRoll;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
        this.registration = registration;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNativePlace() {
        return nativePlace;
    }

    public void setNativePlace(String nativePlace) {
        this.nativePlace = nativePlace;
    }

    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }
}

