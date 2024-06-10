package se.jpalombok.jpalombokworkshop.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class AppUser {
    @Id
    @Setter(AccessLevel.PROTECTED)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private String userName;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private LocalDate regDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="details_id")
    private Details userDetails;

    public AppUser(String username, String password,Details userDetails) {
        this.userName = username;
        this.password = password;
        this.regDate = LocalDate.now();
        this.userDetails = userDetails;
    }

    public AppUser(String username, String password) {
        this.userName = username;
        this.password = password;
        this.regDate = LocalDate.now();
        this.userDetails = null;
    }
}
