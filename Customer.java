public class Customer
{
    private String customerName;
    private String customerAddress;
    private String customerPhoneNumber;
    private String customerEmail;


    public void setCustomerName(String customerName)
    {
        this.customerName = customerName;
    }

    public void setCustomerAddress(String customerAddress)
    {
        this.customerAddress = customerAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber)
    {
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public void setCostumerEmail(String costumerEmail)
    {
        this.customerEmail = costumerEmail;
    }


    public String getCustomerName()
    {
        return customerName;
    }

    public String getCustomerAddress()
    {
        return customerAddress;
    }

    public String getCustomerPhoneNumber()
    {
        return customerPhoneNumber;
    }

    public String getCustomerEmail()
    {
        return customerEmail;
    }
}
