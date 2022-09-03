package pro.ganyushkin.demo.fakeapi.service;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import pro.ganyushkin.demo.fakeapi.domain.OnlineStatus;

@Service
public class OnlineStatusService {

    public OnlineStatus generateOnlineStatus(String accountId) {
        var faker = new Faker();
        return OnlineStatus.builder()
                .accountId(accountId)
                .status( faker.bool().bool() ?
                        OnlineStatus.OnlineStatusEnum.ONLINE :
                        OnlineStatus.OnlineStatusEnum.OFFLINE )
                .build();
    }
}
