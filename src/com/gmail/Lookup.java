package com.gmail;

import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class Lookup {

  public String url;

  public Lookup(String url) {
    this.url = url;
  }

  public void lookupNS(String url) {
    try {
      InetAddress address = InetAddress.getByName(url);
      System.out.println(address);
    } catch (UnknownHostException e) {
//      e.printStackTrace();
      System.out.println("Unknown host or DNS");
    }
  }

  public void lookupNSIPV6(String url) {
    try {
      InetAddress address = Inet6Address.getByName(url);
      System.out.println(address);
    } catch (UnknownHostException e) {
//      e.printStackTrace();
      System.out.println("Unknown host or DNS");
    }

  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }
}
