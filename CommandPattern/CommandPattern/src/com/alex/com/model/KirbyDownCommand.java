package com.alex.com.model;

import com.alex.com.interfaces.Command;

public class KirbyDownCommand implements Command {

    private KirbyCharacterReceiver kirbyCharacterReceiver;

    public KirbyDownCommand(KirbyCharacterReceiver kirbyCharacterReceiver) {
        this.kirbyCharacterReceiver = kirbyCharacterReceiver;
    }

    @Override
    public void execute() {
        kirbyCharacterReceiver.moveDown();

    }
}
