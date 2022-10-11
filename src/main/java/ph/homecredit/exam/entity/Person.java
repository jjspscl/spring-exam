package ph.homecredit.exam.entity;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Positive;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    @Pattern(regexp = "^[A-Za-z]*$", message = "Alphabet only")
    @NotNull
    private String firstName;

    @Column(nullable = true)
    @Pattern(regexp = "^[A-Za-z]*$", message = "Alphabet only")
    private String middleName;
    
    @Column(nullable = false)
    @Pattern(regexp = "^[A-Za-z]*$", message = "Alphabet only")
    @NotNull
    private String lastName;
    
    @Column(nullable = false)
    @NotNull
    @Positive
    private Integer age;

    @Column(nullable = false)
    @NotNull
    @Email
    private String email;

    @Column(name = "created_date")
    @CreationTimestamp
    private Date createdDate;
    
    @UpdateTimestamp
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;
}
