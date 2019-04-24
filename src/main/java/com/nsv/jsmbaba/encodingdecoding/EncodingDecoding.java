package com.nsv.jsmbaba.encodingdecoding;

import java.util.Base64;

public class EncodingDecoding {
    public static void main(String[] args) {
        String msg = "Hi Baba... How are you???";
        System.out.println("Original Msg: "+msg);
        String encodedMsg = Base64.getEncoder().encodeToString(msg.getBytes());
        System.out.println("Base64 EncodedMsg: "+encodedMsg);

        String decodedMsg = new String(Base64.getDecoder().decode(encodedMsg));
        System.out.println("Base64 DecodedMsg: "+decodedMsg);

    }
}
