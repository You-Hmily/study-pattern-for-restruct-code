package org.hmily.pictureShowPattern.state;

public class ConcreteStateA implements State{


    @Override
    public void handle() {
        System.out.println("ConcreteStateA  ");
    }
}
