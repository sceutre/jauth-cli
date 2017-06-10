# jauth-cli

This is a two factor authentication program that runs on your computer.  It's 
a fork of https://github.com/harvardinformatics/JAuth replacing the GUI with
a simple command-line application

## Usage

Execute sceutre.JAuth with no arguments.  It reads the contents of user.home/.jauth
and prints of two factor codes for all secrets it find in the file.

## Format of ~/.jauth

label = key

The key may or may not include spaces.  eg:

```
gmail = rt67 eyu8 kjba asjk ass8 skji
amazon = 809SA8D089DA890WDA890WD089W
starwars = JOISAIOJSA08SJL
```