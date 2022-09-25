class Complejo:

    def __init__(self, parteReal, parteImaginaria):
        self.parteReal = parteReal
        self.parteImaginaria = parteImaginaria

    def __add__(self, other):
        nuevaParteImaginaria = self.parteImaginaria + other.parteImaginaria
        if (nuevaParteImaginaria == 0):
            return self.parteReal + other.parteReal
        else:
            return Complejo(
                    self.parteReal + other.parteReal,
                    self.parteImaginaria + other.parteImaginaria
            )

    def __sub__(self, other):
        nuevaParteImaginaria = self.parteImaginaria - other.parteImaginaria
        if (nuevaParteImaginaria == 0):
            return self.parteReal + other.parteReal
        else:
            return Complejo(
                    self.parteReal - other.parteReal,
                    self.parteImaginaria - other.parteImaginaria
            )

    def __repr__(self):
        return ( "(" +
                str(self.parteReal)
                + " + " +
                str(self.parteImaginaria) +  "i)"
        )


def main():
    primero = Complejo(3.1, 5)
    segundo = Complejo(2, 5)

    suma = primero + segundo
    resta = primero - segundo

    print(str(primero) + " + " + str(segundo) + " = " + str(suma))

    print(str(primero) + " - " + str(segundo) + " = " + str(resta))
    print(type(resta))

main()