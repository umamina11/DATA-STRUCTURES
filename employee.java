public class employee {
    private String FirstName;
    private String LastName;

    private int id;

    // constructor
    public employee(String FirstName, String LastName, int id) {
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.id = id;

    }
    // getter and setter methods

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;

    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;

    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        employee employee = (employee) o;
        if (id != employee.id)
            return false;
        if (!FirstName.equals(employee.FirstName))
            return false;

        return LastName.equals(employee.LastName);
    }

    // to string methods
    @Override
    public String toString() {
        return "employee{" +
                "FirstName='" + FirstName + '\'' +
                ",LastName='" + LastName + '\'' +
                ",id=" + id +
                '}';
    }
}
