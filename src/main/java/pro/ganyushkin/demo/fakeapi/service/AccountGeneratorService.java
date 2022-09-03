package pro.ganyushkin.demo.fakeapi.service;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import pro.ganyushkin.demo.fakeapi.domain.Account;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

@Service
public class AccountGeneratorService {
    public List<Account> generateAccounts(int numberOfAccount) {
        var faker = new Faker();
        return IntStream.range(0, numberOfAccount)
                .mapToObj(i -> Account.builder()
                        .id(UUID.randomUUID().toString())
                        .fullName(faker.name().fullName())
                        .email(faker.name().username() + "@email.com")
                        .active(faker.bool().bool())
                        .build())
                .toList();
    }
}
