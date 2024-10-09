package tek.tdd.api.models;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor

@Setter
@Getter

public class TokenResponse {
    private String fullName;
    private String username;
    private String token;
    private Date tokenExpiration;
    private Date issueAt;
    private AccountType accountType;

}
