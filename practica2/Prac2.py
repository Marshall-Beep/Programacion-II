import math

class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return self.x, self.y

    def coord_polares(self):
        radio = math.sqrt(self.x * self.x + self.y * self.y)
        angulo = math.atan(self.y / self.y)  
        angulo = math.degrees(angulo)
        return radio, angulo

    def __str__(self):
        return "({:.2f},{:.2f})".format(self.x, self.y)

class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Línea de {self.p1} a {self.p2}"

    def dibuja_linea(self):
        print(f"Dibujando línea entre {self.p1} y {self.p2}")

class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo con centro en {self.centro} y radio {self.radio}"

    def dibuja_circulo(self):
        print(f"Dibujando círculo con centro {self.centro} y radio {self.radio}")

# Prueba de escritorio
p1 = Punto(0, 3)
p2 = Punto(4, 6)
l = Linea(p1, p2)
c = Circulo(p1, 3.0)

print(l)
l.dibuja_linea()

print(c)
c.dibuja_circulo()
