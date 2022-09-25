class Complejo:

    def __init__(self, parteReal, parteImaginaria):
        self.parteReal = parteReal
        self.parteImaginaria = parteImaginaria

    def __add__(self, other):
        if (type(other) == Complejo):
            return Complejo(
                    self.parteReal + other.parteReal,
                    self.parteImaginaria + other.parteImaginaria
            )
        else:
            return Complejo(
                    self.parteReal + other,
                    self.parteImaginaria
            )

    def __sub__(self, other):
        if (type(other) == Complejo):
            return Complejo(
                    self.parteReal - other.parteReal,
                    self.parteImaginaria - other.parteImaginaria
            )
        else:
            return Complejo(
                    self.parteReal - other,
                    self.parteImaginaria
            )

    def __repr__(self):
        return ( "(" +
                str(self.parteReal)
                + " + " +
                str(self.parteImaginaria) +  "i)"
        )


def main():
    primero = Complejo(3, 5)
    real = 3

    suma = primero + real
    resta = primero - real

    suma = real + primero

    print(str(primero) + " + " + str(real) + " = " + str(suma))

    print(str(primero) + " - " + str(real) + " = " + str(resta))

main()