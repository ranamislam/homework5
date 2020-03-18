public class ComputerStore
{
    public static void main(String[] args)
    {
        Customer customer = new Customer();
        customer.setCustomerName("Orrko");
        customer.setCustomerAddress("123 1st Ave, Brooklyn, NY 12345");
        customer.setCustomerPhoneNumber("123-456-7890");
        customer.setCostumerEmail("orrko@orrko.com");

        System.out.println("Customer's information:\n------------------------------------------" +
                           "\nName: " + customer.getCustomerName() +
                           "\nPhone: " + customer.getCustomerPhoneNumber() +
                           "\nAddress: " + customer.getCustomerAddress() +
                           "\nEmail: " + customer.getCostumerEmail() + "\n\n");

        Dell dellComputer = new Dell();
        Computer computer = new Dell();
        Keyboard keyboard = new Dell();


        System.out.println("Computer information:\n------------------------------------------");
        System.out.print("Model: ");
        dellComputer.computerModel();

        System.out.print("Processor: ");
        computer.processor();

        System.out.print("Motherboard: ");
        Computer.motherboard();

        System.out.print("Keyboard type - 1: ");
        keyboard.keyboardWireless();

        System.out.print("Keyboard type - 2: ");
        keyboard.keyboardWire();
    }
}
