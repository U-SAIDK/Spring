package com.example;

// Common contract for all computer types.

// Any class implementing this interface
// must provide its own compile() method.

// This allows Dev to work with any Computer
// implementation without knowing the actual class.
public interface Computer {

    void compile();
}