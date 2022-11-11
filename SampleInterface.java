package org.example;

public interface SampleInterface{
    void move();
    double calculateArea();
    double calculateVolume();
    void didCancel();
    void didFailed(String reason);
    String didReceiveResult();
}