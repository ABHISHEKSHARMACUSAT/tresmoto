package com.tresmoto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*

"ID",
"CHANNEL_CODE","PI_INSTANCE_NAME","PAYMENT_GATEWAY_CODE","PAYMENT_INSTRUMENT","PERCENTAGE_ROUTING","DISPLAY_PRIORITY","TENANT_CODE"

    @Column(name = "ID", nullable = false)
    @Column(name = "ROUTING_PERCENTAGE", nullable = false)


    @Column(name = "TENANT_CODE", nullable = false)
    @Column(name = "DISPLAY_PRIORITY", nullable = false)
 */

@SpringBootApplication
public class Application {
    public static void main(String[] args) {


//        String csvFile = "/Users/abhishek22.kumar/Desktop/TreshMoto/tresmoto/src/main/resources/csv/Routing_Mapping.csv";
//        String line = "";
//        String cvsSplitBy = ",";
//
//
//        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
//
//            while ((line = br.readLine()) != null) {
//                String str = "INSERT INTO tresmoto.PAYMENT_ROUTING_CONFIG " +
//                        "(ID, CHANNEL_TYPE, BANK_NAME,PAYMENT_GATEWAY_CODE, PAYMENT_MODE,ROUTING_PERCENTAGE,DISPLAY_PRIORITY,TENANT_CODE)" +
//                        "VALUES (";
//                String[] country = line.split(cvsSplitBy);
//                int count = 1;
//                for (String c : country) {
//                    if (c.isEmpty()) {
//                        count++;
//                    } else if (count < country.length) {
//                        if (count == country.length - 1) {
//                            str += "" + c + ""+ ",";
//                        } else {
//                            str += "'" + c + "'" + ",";
//                        }
//                        count++;
//                    } else if (count == country.length) {
//                        str += "'" + "TRESMOTO" + "'";
//                    }
//                }
//                str += ");";
//                System.out.println(str);
//            }
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }


         SpringApplication.run(Application.class, args);
    }
}
