package RaghavRawat;

public class User {
    
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    
    public User(int ID, String FirstName, String LastName, int Age)
    {
        this.id = ID;
        this.firstName = FirstName;
        this.lastName = LastName;
        this.age = Age;
    }
    
    public int getId()
    {
        return id;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastNAme()
    {
        return lastName;
    }
    
    public int getAge()
    {
        return age;
    }
}
