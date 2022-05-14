package model;

public enum EventType {
  USER_CREATED("A new user was added to the system."),
  USER_LOGGED_IN("A user has logged into the system"),
  USER_UPDATED("A user was updated."),
  USER_PASSWORD_CHANGE("A user changed their password."),
  USER_DELETED("A user was deleted from the system."),
  USER_DISABLED("A user was disabled in the system."),
  USER_ENABLED("A user was enabled in the system."),
  USER_RESET_PASSWORD("A user reset their password."),
  ROLE_APPENDED("A role was appended to a user."),
  ROLE_REMOVED("A role was removed from a user."),
  ROLES_REMOVED("All roles were removed from a user."),
  WELCOME_EMAIL_DISPATCHED("The welcome email was dispatched to a user."),
  FORGOTTEN_PASSWORD_EMAIL_DISPATCHED("The forgotten password email was dispatched to a user."),
  WEBHOOK_CREATED("A webhook was recently registered to the system"),
  WEBHOOK_UPDATED("A webhook was recently updated on the system"),
  WEBHOOK_DELETED("A webhook was recently deleted from the system."),
  WEBHOOK_DISABLED("A webhook was disabled"),
  WEBHOOK_ENABLED("A webhook was enabled");

  private final String message;

  EventType(String message) {
    this.message = message;
  }

  public String getMessage() {
    return message;
  }
}