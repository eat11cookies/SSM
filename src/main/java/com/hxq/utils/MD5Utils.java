package com.hxq.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Utils {
    public static String md5(String password){
        byte[] bytes=null;
        try {
            bytes= MessageDigest.getInstance("md5").digest(password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        String md5code = new BigInteger(1, bytes).toString(16);
        for (int i = 0; i < 32-md5code.length(); i++) {
            md5code='0'+md5code;
        }
        return md5code;
    }
}
