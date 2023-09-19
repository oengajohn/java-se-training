package com.systechafrica.part2.interfaces;

//! access-modifier interface-keyword interface-name
public interface ThreePinPlug {
    //! contract - methods without implementation
    public abstract boolean plugIn();
    boolean plugOut(); //? implicitly public abstract
    
}
