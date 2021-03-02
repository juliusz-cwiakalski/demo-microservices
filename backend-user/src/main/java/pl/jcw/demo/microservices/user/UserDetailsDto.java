package pl.jcw.demo.microservices.user;

public class UserDetailsDto {
  private String id;
  private String displayName;
  private String homeServer;

  public UserDetailsDto(String id, String displayName, String homeServer) {
    this.id = id;
    this.displayName = displayName;
    this.homeServer = homeServer;
  }

  public String getId() {
    return id;
  }

  public String getDisplayName() {
    return displayName;
  }


  public String getHomeServer() {
    return homeServer;
  }

  @Override
  public String toString() {
    return String.format("UserDetailsDto [id=%s, displayName=%s, homeServer=%s]", id, displayName,
        homeServer);
  }
}
