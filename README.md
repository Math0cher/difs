# difs
диффуры находятся Visualiser.transform()

диффур для кота:
```
x' = x
y' = y
```
диффур для булочки:
```
x' = Const * x/(x^2 + y^2) - x
y' = Const * x/(x^2 + y^2) - y
```

Отрисовку выполняю при помощи JFrame по методу ломаной эйлера 
```
(x, y) -> (x + f(x, y) * COEF, y + g(x, y) * COEF)
````
