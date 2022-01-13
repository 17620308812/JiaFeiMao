

package jfm.web.server.utils;


import jfm.common.pojo.JfmUser;

public class UserUtil {

    private static ThreadLocal<JfmUser> currentLocalContext = new InheritableThreadLocal();

    public static JfmUser get() {
        return currentLocalContext.get();
    }

    public static void set(JfmUser user) {
        currentLocalContext.set(user);
    }
}
