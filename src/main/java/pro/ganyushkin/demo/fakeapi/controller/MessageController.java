package pro.ganyushkin.demo.fakeapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pro.ganyushkin.demo.fakeapi.domain.Message;
import pro.ganyushkin.demo.fakeapi.service.MessageGeneratorService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/message")
public class MessageController {
    private final MessageGeneratorService messageGeneratorService;

//    @CrossOrigin
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Message> generateAccounts(@RequestParam String ownerId, @RequestParam int size) {
        return messageGeneratorService.generateMessages(ownerId, size);
    }
}
