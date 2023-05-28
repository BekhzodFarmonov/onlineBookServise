package uz.pdp.entity.client.ui;

import uz.pdp.entity.client.util.ScannerUtil;
import uz.pdp.entity.server.record.UserDTO;

public class AuthUI {
    public static void login() {
        System.out.println("LOGIN FORM");
        String phoneNumber = ScannerUtil.getString("Phone number(+998901234455): ");
        String password = ScannerUtil.getString("Password: ");

        UserDTO userDTO = new UserDTO("Full name", phoneNumber, password, password);

        AuthService authService = new AuthService();

        Response response = authService.login(userDTO);

        System.out.println(response);

        if (response.success()) {
            UserUi.cabinet(response.message());
        }

    }
}
