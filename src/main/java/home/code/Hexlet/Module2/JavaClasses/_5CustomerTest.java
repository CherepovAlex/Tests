package home.code.Hexlet.Module2.JavaClasses;

class CustomerDTO {
    final String firstName;
    final String lastName;
    final String email;

    public CustomerDTO(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
}

public class _5CustomerTest {
    public static void main(String[] args) {
        new CustomerDTO("Anna", "Smith", "anna@gmail.com");
    }
}
