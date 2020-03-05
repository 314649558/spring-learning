package com.hailong.spring.config;

import com.hailong.spring.utils.RsaUtils;
import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.annotation.PostConstruct;
import java.security.PrivateKey;
import java.security.PublicKey;

/**
 * Created by Administrator on 2020/3/2.
 */
@ConfigurationProperties("rsa.key")
public class RsaKeyProperties {
    private String pubKeyFile;

    private PublicKey publicKey;


    //构造器完成后执行此方法
    @PostConstruct
    public void createRsaKey() throws Exception {
        publicKey=RsaUtils.getPublicKey(pubKeyFile);
    }




    public PublicKey getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(PublicKey publicKey) {
        this.publicKey = publicKey;
    }



    public String getPubKeyFile() {
        return pubKeyFile;
    }

    public void setPubKeyFile(String pubKeyFile) {
        this.pubKeyFile = pubKeyFile;
    }


}
