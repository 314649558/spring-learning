package com.hailong.spring.utils.test;

import com.hailong.spring.utils.RsaUtils;
import org.junit.jupiter.api.Test;

/**
 * Created by Administrator on 2020/3/1.
 */

public class RsaUtilsTest {
    private String privateFilePath = "D:\\auth_key\\id_key_rsa";
    private String publicFilePath = "D:\\auth_key\\id_key_rsa.pub";


    public void generateKey() throws Exception{
        RsaUtils.generateKey(publicFilePath,privateFilePath,"hailong",2048);
    }

    public void getPublicKey() throws Exception{
        System.out.println(RsaUtils.getPublicKey(publicFilePath));
    }

    public void getPrivateKey() throws Exception{
        System.out.println(RsaUtils.getPrivateKey(privateFilePath));
    }




    public static void main(String[] args) throws Exception {
        //new RsaUtilsTest().generateKey();
        //new RsaUtilsTest().getPrivateKey();
        new RsaUtilsTest().getPublicKey();
    }




}
