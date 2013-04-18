package lab4;

public class ContactListFileRecord {

    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String state;
    String zip;
    String email;
    String phone;

    public ContactListFileRecord() {
        
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        //data validation needed
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        //data validation needed
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        //data validation needed
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        //data validation needed 
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        //data validation needed
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        //data validation needed
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        //data validation needed
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        //data validation needed
        this.phone = phone;
    }
    
}
