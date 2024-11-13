package rsa.restapi.generator.services;

import org.springframework.stereotype.Service;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

@Service
public class RSAKeyGeneratorService {

    public RSAKeyPair generateRSAKeyPair() throws NoSuchAlgorithmException {
        // KeyPairGenerator instance for RSA with a 2048-bit key size
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA");
        keyPairGenerator.initialize(2048);
        KeyPair keyPair = keyPairGenerator.generateKeyPair();

        // Encode keys in Base64 for ease of use
        String publicKey = Base64.getEncoder().encodeToString(keyPair.getPublic().getEncoded());
        String privateKey = Base64.getEncoder().encodeToString(keyPair.getPrivate().getEncoded());

        return new RSAKeyPair(publicKey, privateKey);
    }

    // Inner class to hold the public and private keys
    public static class RSAKeyPair {
        private final String publicKey;
        private final String privateKey;

        public RSAKeyPair(String publicKey, String privateKey) {
            this.publicKey = publicKey;
            this.privateKey = privateKey;
        }

        public String getPublicKey() {
            return publicKey;
        }

        public String getPrivateKey() {
            return privateKey;
        }
    }
}
