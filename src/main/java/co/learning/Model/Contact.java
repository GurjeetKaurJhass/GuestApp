package co.learning.Model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Builder
@ToString
@Setter
@Getter
public class Contact {
private String firstName;
private String lastName;
private String phoneNumber;
private ContactType  contactType;

}
