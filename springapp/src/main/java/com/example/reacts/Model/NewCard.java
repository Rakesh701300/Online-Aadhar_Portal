package com.example.reacts.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class NewCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String status = "in_progress";
    private String areaName;
    private String birthDate;
    private String profileUrl;
    private String emailId;
    private String fatherName;
    private String firstName;
    private String gender;
    private String houseNo;
    private String lastName;
    private String motherName;
    private String nationality;
    private String peAreaName;
    private String peHouseNo;
    private String peNationality;
    private String pePincode;
    private String peState;
    private String peStreetName;
    private String phoneNumber1;
    private String phoneNumber2;
    private String pincode;
    private String state;
    private String streetName;
    private String aadhaarNumber;

    // No-argument constructor
    public NewCard() {}

    // Constructor with all fields
    public NewCard(Integer id, String status, String areaName, String birthDate, String profileUrl,
                   String emailId, String fatherName, String firstName, String gender, String houseNo,
                   String lastName, String motherName, String nationality, String peAreaName, String peHouseNo,
                   String peNationality, String pePincode, String peState, String peStreetName, String phoneNumber1,
                   String phoneNumber2, String pincode, String state, String streetName, String aadhaarNumber) {
        this.id = id;
        this.status = status;
        this.areaName = areaName;
        this.birthDate = birthDate;
        this.profileUrl = profileUrl;
        this.emailId = emailId;
        this.fatherName = fatherName;
        this.firstName = firstName;
        this.gender = gender;
        this.houseNo = houseNo;
        this.lastName = lastName;
        this.motherName = motherName;
        this.nationality = nationality;
        this.peAreaName = peAreaName;
        this.peHouseNo = peHouseNo;
        this.peNationality = peNationality;
        this.pePincode = pePincode;
        this.peState = peState;
        this.peStreetName = peStreetName;
        this.phoneNumber1 = phoneNumber1;
        this.phoneNumber2 = phoneNumber2;
        this.pincode = pincode;
        this.state = state;
        this.streetName = streetName;
        this.aadhaarNumber = aadhaarNumber;
    }

    // Getter and Setter methods
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getProfileUrl() {
        return profileUrl;
    }

    public void setProfileUrl(String profileUrl) {
        this.profileUrl = profileUrl;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getPeAreaName() {
        return peAreaName;
    }

    public void setPeAreaName(String peAreaName) {
        this.peAreaName = peAreaName;
    }

    public String getPeHouseNo() {
        return peHouseNo;
    }

    public void setPeHouseNo(String peHouseNo) {
        this.peHouseNo = peHouseNo;
    }

    public String getPeNationality() {
        return peNationality;
    }

    public void setPeNationality(String peNationality) {
        this.peNationality = peNationality;
    }

    public String getPePincode() {
        return pePincode;
    }

    public void setPePincode(String pePincode) {
        this.pePincode = pePincode;
    }

    public String getPeState() {
        return peState;
    }

    public void setPeState(String peState) {
        this.peState = peState;
    }

    public String getPeStreetName() {
        return peStreetName;
    }

    public void setPeStreetName(String peStreetName) {
        this.peStreetName = peStreetName;
    }

    public String getPhoneNumber1() {
        return phoneNumber1;
    }

    public void setPhoneNumber1(String phoneNumber1) {
        this.phoneNumber1 = phoneNumber1;
    }

    public String getPhoneNumber2() {
        return phoneNumber2;
    }

    public void setPhoneNumber2(String phoneNumber2) {
        this.phoneNumber2 = phoneNumber2;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getAadhaarNumber() {
        return aadhaarNumber;
    }

    public void setAadhaarNumber(String aadhaarNumber) {
        this.aadhaarNumber = aadhaarNumber;
    }
}
