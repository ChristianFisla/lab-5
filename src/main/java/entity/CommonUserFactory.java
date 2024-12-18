package entity;

/**
 * Factory for creating CommonUser objects.
 */
public class CommonUserFactory implements UserFactory {

    @Override
    public User create(String name, String password, String preference, String allergies) {
        return new CommonUser(name, password, preference, allergies);
    }
}
