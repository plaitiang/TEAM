import java.util.*;

public class Account {
	String name;
	String surname;
	String username;
	String password;
	
	public Account(String name, String surname, String username, String password) {
		this.name = name;
		this.surname = surname;
		this.username = username;
		this.password = password;
	}

	public Account(String username, String password) {
		this.username = username;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getUsername() {
		return username;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", surname=" + surname + ", username="
				+ username + ", password=" + password + "]";
	}

}

class Main{
    public static void main(String[] args){
    	ArrayList<Account> a = new ArrayList<Account>();
    	Account x = new Account("Araya","12345");
    	Account y = new Account("QWERTY","2468");
    	a.add(x);
    	a.add(y);
    	System.out.println(a.toString());
        
    }
}
