package by.htp.krozov.sample.reflection;

/**
 * Created by krozov on 23.12.14.
 */
public class User {
    public final String name;
    private boolean activated;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isActivated() {
        return activated;
    }

    @Deprecated
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", activated=" + activated +
                '}';
    }
}
