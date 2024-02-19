package com.commandPattern.remoteControl;

import com.commandPattern.command.superClass.Command;

public class RemoteControl {

    private Command command;

    //Constructor
    public RemoteControl() {
    }

    public void pressButton() {
        command.execute();
    }

    //Setter
    public void setCommand(Command command) {
        this.command = command;
    }

}
