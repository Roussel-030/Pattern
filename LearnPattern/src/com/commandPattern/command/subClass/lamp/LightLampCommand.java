package com.commandPattern.command.subClass.lamp;

import com.commandPattern.command.superClass.Command;
import com.commandPattern.recepteur.interfaces.lampInterface.LampInterface;

public class LightLampCommand implements Command {

    private LampInterface lampInterface;

    //Constructor
    public LightLampCommand(LampInterface lampInterface) {
        this.lampInterface = lampInterface;
    }

    @Override
    public void execute() {
        lampInterface.run();
    }
}
