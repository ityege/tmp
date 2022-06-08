package com.generate;

public class bean {
    String location;
    String domain;
    String port;

    public bean(String location, String domain, String port) {
        this.location = location;
        this.domain = domain;
        this.port = port;
    }

    @Override
    public String toString() {
        return "bean{" +
                "location='" + location + '\'' +
                ", domain='" + domain + '\'' +
                ", port='" + port + '\'' +
                '}';
    }
}
