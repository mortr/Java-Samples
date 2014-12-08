import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;
import java.util.Date;

/**
 * Created by krozov on 08.12.14.
 */
@RunWith(JUnit4.class)
public class UserTest {

    @Test
    public void testEquals() throws Exception {
        User u1 = new User("Ivan", " Ivanov", new Date());
        User u2 = new User("Ivan", " Ivanov", new Date());
        Assert.assertEquals(u1, u2);
    }

    @Test
    public void testClone() throws Exception {
        User user = new User("Ivan", " Ivanov", new Date());
        Object clonedUser = user.clone();

        Assert.assertNotSame("Cloned and original object must be not same.", clonedUser, user);
        Assert.assertEquals("Cloned and original object must be equals.", clonedUser, user);
        Assert.assertEquals("Cloned object must be instance of User class.",
                            User.class, clonedUser.getClass());
        Assert.assertEquals("Cloned and original object must be instance of the same class.",
                            user.getClass(), clonedUser.getClass());
    }

    @Test
    public void testDefaultSort() throws Exception {
        User petrov = new User("Petr", " Petrov", new Date());
        User ivanov = new User("Ivan", " Ivanov", new Date());
        User sidorov = new User("Sidr", " Sidorov", new Date());

        User[] users = {petrov, ivanov, sidorov};
        Arrays.sort(users);

        User[] expectedSort = {ivanov, petrov, sidorov};
        Assert.assertArrayEquals(expectedSort, users);
    }

    @Test
    public void testBirthDateSort() throws Exception {
        User user3 = new User("Petr", " Petrov", new Date(300000));
        User user1 = new User("Ivan", " Ivanov", new Date(100000));
        User user2 = new User("Sidr", " Sidorov", new Date(200000));

        User[] users = {user3, user1, user2};

        Arrays.sort(users, new User.BirthDateComparator());
        Assert.assertArrayEquals(new User[]{user1, user2, user3}, users);
    }
}
