# SysInGradle

Just discovered what caused all troubles reading input from command line while executing java applications:

`apply plugin: 'application'`

This was absolutely necessary so this:

`standardInput = System.in`

Can work correctly and Scanners, Readers or any other reads user input.