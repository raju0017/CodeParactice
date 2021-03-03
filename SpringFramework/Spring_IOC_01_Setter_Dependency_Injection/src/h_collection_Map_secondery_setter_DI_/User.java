package h_collection_Map_secondery_setter_DI_;

public class User {
	private int id;
	private String name, email;

	public User() {
	}

	public final int getId() {
		return id;
	}

	public final void setId(int id) {
		this.id = id;
	}

	public final String getName() {
		return name;
	}

	public final void setName(String name) {
		this.name = name;
	}

	public final String getEmail() {
		return email;
	}

	public final void setEmail(String email) {
		this.email = email;
	}

	public String toString() {
		return "Id:" + id + " Name:" + name + " Email Id:" + email;
	}

}
