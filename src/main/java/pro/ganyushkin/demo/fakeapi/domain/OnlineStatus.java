package pro.ganyushkin.demo.fakeapi.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@AllArgsConstructor
@Getter
@Builder
public class OnlineStatus {
    private String accountId;
    private OnlineStatusEnum status;

    public enum OnlineStatusEnum {
        ONLINE,
        OFFLINE
    }
}
