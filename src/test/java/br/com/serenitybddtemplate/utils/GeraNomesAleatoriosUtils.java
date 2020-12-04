package br.com.serenitybddtemplate.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class GeraNomesAleatoriosUtils {

    public static String gerarNumeros(){
        Random gerador = new Random();

        String complemento = "";
        for (int i = 0; i < 5; i++) {
            complemento = complemento + gerador.nextInt(9);
        }

        return complemento;
    }

}
