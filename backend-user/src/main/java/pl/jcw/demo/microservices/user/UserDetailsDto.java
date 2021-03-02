package pl.jcw.demo.microservices.user;

public class UserDetailsDto {
	private String id;
	private String displayName;
	
	public UserDetailsDto(String id, String displayName) {
		this.id = id;
		this.displayName = displayName;
	}
	public String getId() {
		return id;
	}
	public String getDisplayName() {
		return displayName;
	}
}
