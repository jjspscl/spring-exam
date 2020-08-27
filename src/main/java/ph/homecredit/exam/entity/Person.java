package ph.homecredit.exam.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    private String firstName;

    private String middleName;

    private String lastName;

    private Integer age;

    private String email;

}
