public class Clients {
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String homeAddress;
    private int cardNum;
    private String cardExperation;

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail(){
        return emailAddress;
    }
    public void setEmail(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress(){
        return homeAddress;
    }
    public void setAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }

    public int getCardNum(){
        return cardNum;
    }
    public void setCardNum(int cardNum){
        this.cardNum = cardNum;
    }

    public String getCardExp(){
        return cardExperation;
    }
    public void setCardExp(String cardExperation) {
        this.cardExperation = cardExperation;
    }
}
