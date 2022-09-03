package pro.ganyushkin.demo.fakeapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import pro.ganyushkin.demo.fakeapi.domain.Account;
import pro.ganyushkin.demo.fakeapi.service.AccountGeneratorService;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/account")
public class AccountController {
    private final AccountGeneratorService accountGeneratorService;

//    @CrossOrigin
    @GetMapping(produces = APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public List<Account> generateAccounts(@RequestParam int size) {
        return accountGeneratorService.generateAccounts(size);
    }
}
