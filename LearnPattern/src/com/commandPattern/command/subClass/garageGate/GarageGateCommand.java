package com.commandPattern.command.subClass.garageGate;

import com.commandPattern.command.superClass.Command;
import com.commandPattern.recepteur.interfaces.garageGateInterface.GarageGateInterface;

public class GarageGateCommand implements Command {

    private GarageGateInterface garageGateInterface;

    //Constructor
    public GarageGateCommand(GarageGateInterface garageGateInterface) {
        this.garageGateInterface = garageGateInterface;
    }

    @Override
    public void execute() {
        garageGateInterface.open();
    }

}
