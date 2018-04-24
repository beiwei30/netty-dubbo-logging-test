package me.bw.lab;

public class GreetingServiceImpl implements GreetingService {
    @Override
    public String sayHi(String name) {
        return "Hello " + name;
    }
}
