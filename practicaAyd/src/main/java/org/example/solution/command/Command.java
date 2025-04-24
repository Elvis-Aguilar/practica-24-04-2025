package org.example.solution.command;

public interface Command {
    void execute();
    void undo();
}