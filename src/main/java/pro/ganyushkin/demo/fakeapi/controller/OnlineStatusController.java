package pro.ganyushkin.demo.fakeapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pro.ganyushkin.demo.fakeapi.domain.OnlineStatus;
import pro.ganyushkin.demo.fakeapi.service.OnlineStatusService;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(path="/status")
public class OnlineStatusController {
    private final OnlineStatusService onlineStatusService;

//    @CrossOrigin
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public OnlineStatus getAccountOnlineStatus(@RequestParam String accountId) {
        return this.onlineStatusService.generateOnlineStatus(accountId);
    }
}
