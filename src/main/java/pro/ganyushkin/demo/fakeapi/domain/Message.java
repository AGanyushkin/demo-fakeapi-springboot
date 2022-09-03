package pro.ganyushkin.demo.fakeapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class Message {
    private String id;
    private String ownerId;
    private String text;
}
