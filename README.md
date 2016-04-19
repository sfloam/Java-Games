# Rock Paper Scissors Strategy Game
This directory contains a collection of source files for a variety of RPS Games. These files use protected modifiers and are part of the games.rps package. 

## Steps to Run
Run this file to test out each mode. Users are prompted with two
menu screens. The first menu screen will ask the user if they want to start a
new game, continue their existing game, or quit (continue is not an option
for the first run). The second menu screen asks the user which mode they
would like to play with: Frequency Mode, Previous Mode, Random Mode, or
Strategy Swap Mode. This program will account for inappropriate input. Starting
a new game will erase all scoring for each game type. The Continue option
will maintain the user's score for each game mode (separately).

## Types of Games
- FrequencyMode - The Computer will always play the Human's most frequently
used move.
- PreviousMode - The Computer will always play the Human's previous move.
The Human's first previous move is randomized and assigned within the
Player constructor because a previous move does not exist when no moves
have occurred.
- Random Mode- The Computer will generates a random move. There
is no strategy here.
- StrategySwapMode - The first move by the Computer is random. If the Human's
winning record surpasses his/her losing record, the Computer will attempt
play a move that beats the Human's most frequently used move. If the Human's
tying record surpasses his/her winning record, the Computer will start to
use random moves. Otherwise, the Computer will use the Human's previous move.
