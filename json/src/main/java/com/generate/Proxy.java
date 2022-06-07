package com.generate;


import java.util.Random;
import java.util.UUID;

public class Proxy {
    public static void main(String[] args) {
        String context = "\"+%s\": {\n" +
                "    \"bypassList\": [{\n" +
                "      \"conditionType\": \"BypassCondition\",\n" +
                "      \"pattern\": \"127.0.0.1\"\n" +
                "    }, {\n" +
                "      \"conditionType\": \"BypassCondition\",\n" +
                "      \"pattern\": \"[::1]\"\n" +
                "    }, {\n" +
                "      \"conditionType\": \"BypassCondition\",\n" +
                "      \"pattern\": \"localhost\"\n" +
                "    }],\n" +
                "    \"color\": \"%s\",\n" +
                "    \"fallbackProxy\": {\n" +
                "      \"host\": \"%s\",\n" +
                "      \"port\": %s,\n" +
                "      \"scheme\": \"https\"\n" +
                "    },\n" +
                "    \"name\": \"%s\",\n" +
                "    \"profileType\": \"FixedProfile\",\n" +
                "    \"revision\": \"%s\"\n" +
                "  },";
        String format1 = String.format(context, "台湾gzcm.maikrapps.xyz:12631", randomColor(), "gzcm.maikrapps.xyz", "9999", "台湾gzcm.maikrapps.xyz:12631",randomUUID());
        String format2 = String.format(context, "台湾gzcm.maikrapps.xyz:12632", randomColor(), "gzcm.maikrapps.xyz", "9992", "台湾gzcm.maikrapps.xyz:12632",randomUUID());

        System.out.println(format1+format2);


    }
    public static String randomColor() {
        Random random = new Random();
        String r = Integer.toHexString(random.nextInt(256));
        String g = Integer.toHexString(random.nextInt(256));
        String b = Integer.toHexString(random.nextInt(256));
        return "#"+r+g+b;
    }
    public static String randomUUID(){
        return "180f0f"+UUID.randomUUID().toString().substring(0,5);
    }
}
