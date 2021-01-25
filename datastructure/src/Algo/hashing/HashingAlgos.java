package Algo.hashing;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashingAlgos {
    public static void main(String[] args) {


    }

    static void getMD5Hash(String algo, String message) {

        try {
            MessageDigest digest = MessageDigest.getInstance(algo);

            byte[] inputBytes = message.getBytes("UTF-8");

            byte[] hash = digest.digest(inputBytes);

            convertByteArrayToHexString(hash);

        } catch (NoSuchAlgorithmException | UnsupportedEncodingException ex) {
            System.out.println("Could not generate hash from String");
        }


    }


    private static String convertByteArrayToHexString(byte[] arrayBytes) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayBytes.length; i++) {
            stringBuffer.append(Integer.toString((arrayBytes[i] & 0xff) + 0x100, 16)
                    .substring(1));
        }
        return stringBuffer.toString();
    }
}
