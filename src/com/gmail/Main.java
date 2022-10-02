package com.gmail;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    System.out.println("type domain: ");
    Scanner sc = new Scanner(System.in);
    String url = sc.next();
    Lookup nslookup = new Lookup(url);
    nslookup.lookupNS(nslookup.getUrl());
//    nslookup.lookupNSIPV6(nslookup.getUrl());
  }
}

