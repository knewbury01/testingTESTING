package testDep;

import javax.crypto.Cipher;
import java.security.GeneralSecurityException;


public class MainClassForDep {

    public static void containsMisuse() throws GeneralSecurityException{
	 Cipher c = Cipher.getInstance("DES");
    }

}
