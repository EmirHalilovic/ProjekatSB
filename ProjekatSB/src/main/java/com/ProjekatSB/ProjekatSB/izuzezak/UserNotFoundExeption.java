package com.ProjekatSB.ProjekatSB.izuzezak;

public class UserNotFoundExeption extends RuntimeException{
    public UserNotFoundExeption(String poruka) {
        super(poruka);
    }
}
