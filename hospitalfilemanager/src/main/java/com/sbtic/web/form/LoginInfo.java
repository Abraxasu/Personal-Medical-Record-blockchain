package com.sbtic.web.form;

public class LoginInfo
{
    private String loginType;
    private String publicKey;

    public LoginInfo()
    {
        this.loginType = "patient";//default radio button selection
    }

    public String getLoginType()
    {
        return loginType;
    }

    public void setLoginType(String loginType)
    {
        this.loginType = loginType;
    }

    public String getPublicKey()
    {
        return publicKey;
    }

    public void setPublicKey(String publicKey)
    {
        this.publicKey = publicKey;
    }

    @Override
    public String toString()
    {
        return "LoginInfo{" +
                "loginType='" + loginType + '\'' +
                ", publicKey='" + publicKey + '\'' +
                '}';
    }
}
