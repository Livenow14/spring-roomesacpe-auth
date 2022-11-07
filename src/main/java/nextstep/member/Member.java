package nextstep.member;

public class Member {

  private Long id;
  private final String username;
  private final String password;
  private final String name;
  private final String phone;
  private final RoleType role;

  public Member(Long id, String username, String password, String name, String phone, RoleType role) {
    this.id = id;
    this.username = username;
    this.password = password;
    this.name = name;
    this.phone = phone;
    this.role = role;
  }

  public Member(String username, String password, String name, String phone, RoleType role) {
    this.username = username;
    this.password = password;
    this.name = name;
    this.phone = phone;
    this.role = role;
  }

  public Long getId() {
    return id;
  }

  public String getUsername() {
    return username;
  }

  public String getPassword() {
    return password;
  }

  public String getName() {
    return name;
  }

  public String getPhone() {
    return phone;
  }

  public RoleType getRole() {
    return role;
  }

  public boolean checkWrongPassword(String password) {
    return !this.password.equals(password);
  }
}
