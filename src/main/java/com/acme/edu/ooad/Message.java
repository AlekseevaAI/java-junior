package com.acme.edu.ooad;

public class Message {
    public String getPrefix() {
        return prefix;
    }

    public String getText() {
        return text;
    }
}

class StringPrefixMessage extends Message {}
class IntPrefixMessage extends Message {}
