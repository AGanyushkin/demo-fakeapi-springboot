package pro.ganyushkin.demo.fakeapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Account {
    private String id;
    private String fullName;
    private String email;
    private boolean active;
}
