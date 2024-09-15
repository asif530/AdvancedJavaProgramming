package FromBook.Example1;

import lombok.*;

@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
    public enum Gender{
        MALE, FEMALE
    }
    private String name;
    private String email;
    private  int age;
    private  Gender gender;
}
