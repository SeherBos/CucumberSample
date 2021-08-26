package pojos;

public class Customer {
    /*
   {
       "id": 85694,
       "firstName": "Winona",
       "lastName": "Abernathy",
       "middleInitial": "S",
       "email": "winonaabernathy@gmail.com",
       "mobilePhoneNumber": "222-230-1890",
       "phoneNumber": "271-169-8836",
       "zipCode": "09848-7861",
       "address": "1956 Hackett Mission",
       "city": "Fairfax",
       "ssn": "779-99-4600",
       "createDate": "2021-03-03T06:00:00Z",
       "zelleEnrolled": false,
       "country": {
           "id": 3,
           "name": "USA",
           "states": null
       },
       "state": "Virginia",
       "user": {
           "id": 86453,
           "login": "dino.kohler",
           "firstName": "Winona",
           "lastName": "Abernathy",
           "email": "winonaabernathy@gmail.com",
           "activated": true,
           "langKey": "en",
           "imageUrl": null,
           "resetDate": null
       },
       "accounts": null
   }
    */
    private int id;
    private String firstName;
    private String lastName;
    private String middleInitial;
    private String email;
    private String mobilePhoneNumber;
    private String phoneNumber;
    private String zipCode;
    private String address;
    private String city;
    private String ssn;
    private String createDate;
    private boolean zelleEnrolled;
    private Country country;
    private States state;
    private Users user;
    private Accounts accounts;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(String middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobilePhoneNumber() {
        return mobilePhoneNumber;
    }

    public void setMobilePhoneNumber(String mobilePhoneNumber) {
        this.mobilePhoneNumber = mobilePhoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getCreateDate() {
        return createDate;
    }

    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }

    public boolean isZelleEnrolled() {
        return zelleEnrolled;
    }

    public void setZelleEnrolled(boolean zelleEnrolled) {
        this.zelleEnrolled = zelleEnrolled;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Accounts getAccounts() {
        return accounts;
    }

    public void setAccounts(Accounts accounts) {
        this.accounts = accounts;
    }

    public Customer(int id, String firstName, String lastName, String middleInitial, String email, String mobilePhoneNumber, String phoneNumber, String zipCode, String address, String city, String ssn, String createDate, boolean zelleEnrolled, Country country, States state, Users user, Accounts accounts) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleInitial = middleInitial;
        this.email = email;
        this.mobilePhoneNumber = mobilePhoneNumber;
        this.phoneNumber = phoneNumber;
        this.zipCode = zipCode;
        this.address = address;
        this.city = city;
        this.ssn = ssn;
        this.createDate = createDate;
        this.zelleEnrolled = zelleEnrolled;
        this.country = country;
        this.state = state;
        this.user = user;
        this.accounts = accounts;
    }

    public Customer() {
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", middleInitial='" + middleInitial + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhoneNumber='" + mobilePhoneNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", zipCode='" + zipCode + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", ssn='" + ssn + '\'' +
                ", createDate='" + createDate + '\'' +
                ", zelleEnrolled=" + zelleEnrolled +
                ", country=" + country +
                ", state=" + state +
                ", user=" + user +
                ", accounts=" + accounts +
                '}';
    }
}
