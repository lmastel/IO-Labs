package lab4;

public class FileRecord1 {

    String firstName;
    String lastName;
    String streetAddress;
    String city;
    String state;
    String zip;
    String email;
    String phone;

    public FileRecord1() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() == 0) {
            throw new NullPointerException();
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() == 0) {
            throw new NullPointerException();
        }
        this.lastName = lastName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        if (streetAddress == null || streetAddress.length() == 0) {
            throw new NullPointerException();
        }
        this.streetAddress = streetAddress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city == null || city.length() == 0) {
            throw new NullPointerException();
        }
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        if (state == null || state.length() == 0) {
            throw new NullPointerException();
        }
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        if (zip == null || zip.length() == 0) {
            throw new NullPointerException();
        }
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.length() == 0) {
            throw new NullPointerException();
        }
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null || phone.length() == 0) {
            throw new NullPointerException();
        }
        this.phone = phone;
    }
}
