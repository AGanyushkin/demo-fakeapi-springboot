package pro.ganyushkin.demo.fakeapi.service;

import net.datafaker.Faker;
import org.springframework.stereotype.Service;
import pro.ganyushkin.demo.fakeapi.domain.Message;

import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;

@Service
public class MessageGeneratorService {

    public List<Message> generateMessages(String ownerId, int numberOfMessages) {
        var faker = new Faker();
        return IntStream.range(0, numberOfMessages)
                .mapToObj(i -> Message.builder()
                        .id(UUID.randomUUID().toString())
                        .ownerId(ownerId)
                        .text(faker.yoda().quote())
                        .build())
                .toList();
    }
}
