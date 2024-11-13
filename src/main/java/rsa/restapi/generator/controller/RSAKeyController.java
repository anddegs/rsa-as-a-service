package rsa.restapi.generator.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import rsa.restapi.generator.services.RSAKeyGeneratorService;

import java.security.NoSuchAlgorithmException;

@RestController
@RequestMapping("/api/rsa")
public class RSAKeyController {


    private RSAKeyGeneratorService rsaKeyGeneratorService;

    public RSAKeyController(RSAKeyGeneratorService rsaKeyGeneratorService) {
        this.rsaKeyGeneratorService = rsaKeyGeneratorService;
    }

    @GetMapping("/generate")
    public RSAKeyGeneratorService.RSAKeyPair generateRSAKeys() throws NoSuchAlgorithmException {
        return rsaKeyGeneratorService.generateRSAKeyPair();
    }
}
