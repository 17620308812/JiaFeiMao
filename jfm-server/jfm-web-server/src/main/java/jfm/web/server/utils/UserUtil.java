

package jfm.web.server.utils;


import jfm.common.user.User;

public class UserUtil {

    private static ThreadLocal<User> currentLocalContext = new InheritableThreadLocal();

    public static User get() {
        return currentLocalContext.get();
    }

    public static void set(User user) {
        currentLocalContext.set(user);
    }
}
