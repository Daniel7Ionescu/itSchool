## To do
- validations
- refactor the way the methods get the input in the while structure

Space mining operations

Mining an asteroid in space depicted with a robot on a track fixed to the asteroid:
###*#** Asteroid with various ores
^---    A robot on a track

###*#** Asteroid symbols: #: metal ore, *: diamonds
^---    Mining track symbols: ^: mining robot, -: track

Task 1:
The robot can move along the tracks, left input "a" and right input "d"

expected result:
###*#** to ###*#** to ###*#**
^---       -^--       --^-

Task 2:
The robot can mine the element in front of it and mark the spot, input "m" for
"#" to 0 and * to !

expected result:
###*#** to 0##*#**
^---       ^---

0##*#** to 0##!#**
---^       ---^

Task 3:
The robot can store the ores in a cargo bay and log its contents

Task 4:
Extend the track, the robot can build a track segment next to it, in an open spot