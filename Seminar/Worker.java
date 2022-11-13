public class Worker {
    int id;
    int salary;
    String firstName;
    String lastName;

    @Override
    public String toString() {
        return String.format("id: %d, %s %s, %d", id, firstName, lastName, salary);
        
    }
    @Override
    public int hashCode() {
        
        return id;
    }

    @Override
    public boolean equals(Object o) {
        Worker t = (Worker) o;
        return id == t.id && firstName == t.firstName;
    }
}
