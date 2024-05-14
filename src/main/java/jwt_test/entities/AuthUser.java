package jwt_test.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Document("user")
public class AuthUser {
	@Id
	private String id;
	@Indexed
	private String username;
	private String password;
	private boolean active;
	public AuthUser() {
		super();
	}
	public AuthUser(String id, String username, String password, boolean active) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.active = active;
	}

}
