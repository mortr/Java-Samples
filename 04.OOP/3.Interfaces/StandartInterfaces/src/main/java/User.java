import java.io.Serializable;
import java.util.Comparator;
import java.util.Date;

/**
 * Created by krozov on 08.12.14.
 */
public class User implements Comparable<User>, Cloneable, Serializable {
    private String name;
    private String surname;
    private Date birthDate;

    public User(String name, String surname, Date birthDate) {
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getFullName() {
        return name + " " + surname;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        User clone = (User) super.clone();
        clone.name = name;
        clone.surname = surname;
        clone.birthDate = (Date) birthDate.clone();
        return clone;
    }

    @Override
    public int compareTo(User o) {
        return getFullName().compareTo(o.getFullName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        User user = (User) o;
        return birthDate.equals(user.birthDate)
                && name.equals(user.name)
                && surname.equals(user.surname);

    }

    @Override
    public int hashCode() {
        return birthDate.hashCode();
    }

    public static class BirthDateComparator implements Comparator<User> {
        @Override
        public int compare(User user1, User user2) {
            return user1.getBirthDate().compareTo(user2.getBirthDate());
        }
    }
}
