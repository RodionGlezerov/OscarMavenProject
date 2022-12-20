package com.telran.oscar.utils;

import org.testng.annotations.DataProvider;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DataProviders {
    @DataProvider
    public Iterator<Object[]> register() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(DataProviders.class.getResourceAsStream("/userDataPositive.csv")));
        List<Object[]> userData = new ArrayList<Object[]>();

        String line = reader.readLine();

        while (line != null){
            userData.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userData.iterator();
    }


    @DataProvider
    public Iterator<Object[]> userDataValidEmailAndInvalidPass() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(DataProviders.class.getResourceAsStream("/userDataValidEmailAndInvalidPass.csv")));
        List<Object[]> userDataInvalidEmail = new ArrayList<Object[]>();

        String line = reader.readLine();

        while (line != null){
            userDataInvalidEmail.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userDataInvalidEmail.iterator();
    }
    @DataProvider
    public Iterator<Object[]> BasketQuantityOfCloathing() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(DataProviders.class.getResourceAsStream("/basketDataQuantityOfCloathing")));
        List<Object[]> userDataInvalidEmail = new ArrayList<Object[]>();

        String line = reader.readLine();

        while (line != null){
            userDataInvalidEmail.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userDataInvalidEmail.iterator();
    }
    @DataProvider
    public Iterator<Object[]> addressValidData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(DataProviders.class.getResourceAsStream("/userAddressValidData.csv")));
        List<Object[]> userValidData = new ArrayList<Object[]>();

        String line = reader.readLine();

        while (line != null){
            userValidData.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userValidData.iterator();
    }
    @DataProvider
    public Iterator<Object[]> addressInvalidData() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(DataProviders.class.getResourceAsStream("/userAddressInvalidData.csv")));
        List<Object[]> userValidData = new ArrayList<Object[]>();

        String line = reader.readLine();

        while (line != null){
            userValidData.add(line.split(","));
            line = reader.readLine();
        }
        reader.close();
        return userValidData.iterator();
    }
}
