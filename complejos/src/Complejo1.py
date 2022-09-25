class Complejo:

    def __init__(self, parteReal, parteImaginaria):
        self.parteReal = parteReal
        self.parteImaginaria = parteImaginaria

    def add(self, other):
        return Complejo(
                self.parteReal + other.parteReal,
                self.parteImaginaria + other.parteImaginaria
        )

    def sub(self, other):
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
    primero = Complejo(3, 5)
    segundo = Complejo(2, 1)

    suma = primero.add(segundo)
    resta = primero.sub(segundo)

    print(str(primero) + " + " + str(segundo) + " = " + str(suma))

    print(str(primero) + " - " + str(segundo) + " = " + str(resta))

main()