calulate_area_square:-
    write('Enter side length'),
    read(X),
    Z is X*X,
    print(Z).

calulate_area_circle:-
    write('Enter radius of circle'),
    read(R),
    Z is 3.14*R*R,
    print(Z).

calulate_sin_cos_theta:-
    write('Enter X for sin(x) and cos(x)'),
    write(' angle in radians'),
    read(X),
    Result is sin(X),
    Result2 is cos(X),
    print(Result),
    nl,
    print(Result2).