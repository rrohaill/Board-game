# Board game
Simple Board game

Description
You are given a board with dimensions 4x5 (width x height) containing multiple pieces. There
are 10 pieces of varying dimensions (width and height):
• 1x2 (4 pieces)
• 2x2 (1 piece)
• 2x1 (1 piece)
• 1x1 (4 pieces)

The following is a visualisation of the pieces with the board in the initial state :
XXXXXX
XabbcX
XabbcX
XdeefX
XdghfX
Xi jX
XXZZXX

The pieces described above in the visualisation:
• 1x2 (4 pieces: a, d, c, f)
• 2x2 (1 piece: b)
• 2x1 (1 piece: e)
• 1x1 (4 pieces: g, h, i, j)

X is a border, and Z is a gap through which the main piece b can move.
To solve the puzzle, you must move the pieces around the board and move b out of the exit Z.
The rules are:
• A piece may only move vertically or horizontally into empty space next to it. (example moves
are illustrated below)
• If there are 2 empty spaces in given direction, the given piece may move 1 or 2 spaces
(counting as 1 move)
• Pieces may not occupy the space Z.
• The piece b may move through Z solving the problem.
• A piece can not overlap with another piece.
• There are always 2 empty spaces on the board.

Objective:
Find the solution to the puzzle moving pieces around the board with b eventually moving
through Z in as few moves as possible (not just the first solution).
Once solved, show the moves from initial state to the final state in the optimal solution.
