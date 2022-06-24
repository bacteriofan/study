package patterns.strategy;

public interface Encryptor {

  String encryptFile();

  Encryptor aesEncryptor = () -> "Applying AES encryption";
  Encryptor rsaEncryptor = () -> "Applying RSB encryption";
}
