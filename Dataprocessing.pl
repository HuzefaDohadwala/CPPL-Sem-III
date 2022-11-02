statements:
Appu is an elephant
An elephant is a mammal 
A mammal is a vertebrate 
Elephnat are herbivore
All herbivore eat grass
vertebrate have spinal cord
some vertebrate stand

code:
elephant(appu).
mammal(X) :- elephant(X).
vertebrate(Y) :- mammal(Y).
herbivore(Z) :- elephant(Z).
eat(Q,grass) :-herbivore(Q).
have(R,spinal_cord) :- vertebrate(R).
stands(S) :- vertebrate(S).   