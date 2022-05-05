package org.acme;

import io.quarkus.runtime.annotations.Recorder;

@Recorder
public class HelloRecorder {

    private final HelloConfig config;

    public HelloRecorder(HelloConfig config) {
        this.config = config;
    }

    public void sayHello(String name) {
        System.out.println("==> Hello X " + name+" with config " + config);
    }
}
