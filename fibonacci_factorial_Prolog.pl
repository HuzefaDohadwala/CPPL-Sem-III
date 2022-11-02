fib(0, 1) :- !.
fib(1, 1) :- !.
fib(N, F) :-
        N > 1,
        N1 is N-1,
        N2 is N-2,
        fib(N1, F1),
        fib(N2, F2),
        F is F1+F2.



fact1(0,Result):-
    Result is 1.
fact1(N,Result):-
    N1 is N-1,
    fact1(N1,Result1),
    Result is Result1*N.