package com.javarush.test.level23.lesson06.task02;

/* Рефакторинг
Отрефакторите класс Solution: вынесите все константы в public вложенный(nested) класс Constants.
Запретите наследоваться от Constants.
*/
public class Solution {

    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super(Constants.SERVER_NOT_ACCESSIBLE);
        }

        public ServerNotAccessibleException(Throwable cause) {
            super(Constants.SERVER_NOT_ACCESSIBLE, cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super(Constants.USER_NOT_AUTH);
        }

        public UnauthorizedUserException(Throwable cause) {
            super(Constants.USER_NOT_AUTH, cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super(Constants.USER_BANNED);
        }

        public BannedUserException(Throwable cause) {
            super(Constants.USER_BANNED, cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super(Constants.ACCESS_DENIED);
        }

        public RestrictionException(Throwable cause) {
            super(Constants.ACCESS_DENIED, cause);
        }
    }
    public final static class Constants {
        public static final String SERVER_NOT_ACCESSIBLE = "Server is not accessible for now.";
        public static final String USER_NOT_AUTH = "User is not authorized.";
        public static final String USER_BANNED = "User is banned.";
        public static final String ACCESS_DENIED = "Access is denied.";
    }

}
