package models;

import static com.google.common.base.MoreObjects.toStringHelper;

import java.util.HashMap;
import java.util.Map;

import com.google.common.base.Objects;

public class User {
	
	  public String firstName;
	  public String lastName;
	  public String email;
	  public String password;
	  static Long counter = 0l;
	  public Long id;
	  public Map<Long, Activity> activities = new HashMap<>();
	  

	  @Override  
	  public int hashCode()  
	  {  
	     return Objects.hashCode(this.firstName,this.lastName,this.email,this.password);  
	  }
	  
	  public User(String firstName, String lastName, String email, String password)
	  {
	    this.firstName = firstName;
	    this.lastName = lastName;
	    this.email = email;
	    this.password = password;
	    this.id        = counter++;
	  }
	  
	  @Override
	  public String toString()
	  {
		  return toStringHelper(this).addValue(firstName)
				  .addValue(id)
                  .addValue(lastName)
                  .addValue(password)
                  .addValue(email)                               
                  .toString();
	  }
	  
	  @Override
	  public boolean equals(final Object obj)
	  {
	    if (obj instanceof User)
	    {
	      final User other = (User) obj;
	      return Objects.equal(firstName, other.firstName) 
	          && Objects.equal(lastName,  other.lastName)
	          && Objects.equal(email,     other.email)
	          && Objects.equal(password,  other.password);
	    }
	    else
	    {
	      return false;
	    }
	  }
	

}
