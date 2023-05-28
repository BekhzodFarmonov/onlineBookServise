package uz.pdp.entity.server.record;

public record UserDTO(String fullName, String phoneNumber,
                      String password, String confirmPassword) {
}
