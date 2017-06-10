# jauth-cli

This is a two factor authentication program that runs on your computer.  It's 
a fork of https://github.com/harvardinformatics/JAuth replacing the GUI with
a simple command-line application.

## Usage

1. Create a .jauth file (format below)
2. Run `java -jar dist/jauth.jar`

## Format of ~/.jauth

label = key

The key may be in uppercase or lowercase and may or may not include spaces.  eg:

```
gmail = rt67 eyu8 kjba asjk ass8 skji
amazon = 809SA8D089DA890WDA890WD089W
starwars = JOISAIOJSA08SJL
```

## Building

```
cd path/jauth-cli
mvn package
```
