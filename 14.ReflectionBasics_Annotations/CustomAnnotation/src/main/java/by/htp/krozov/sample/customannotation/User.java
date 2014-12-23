package by.htp.krozov.sample.customannotation;

/**
 * Created by krozov on 23.12.14.
 */
@VersionFrom
public class User {
    private String name;
    private String surname;

    @Deprecated
    public User(String name) {
        this.name = name;
    }

    @VersionFrom("2.0")
    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @VersionFrom
    public String getName() {
        return name;
    }

    @VersionFrom("2.0")
    public String getSurname() {
        return surname;
    }
}
