import math
import matplotlib.pyplot as plt

# Clase Punto
class Punto:
    def __init__(self, x, y):
        self.x = x
        self.y = y

    def coord_cartesianas(self):
        return self.x, self.y

    def coord_polares(self):
        radio = math.sqrt(self.x * self.x + self.y * self.y)
        angulo = math.degrees(math.atan2(self.y, self.x))  # 
        return radio, angulo

    def __str__(self):
        return "({:.2f},{:.2f})".format(self.x, self.y)

# Clase Línea
class Linea:
    def __init__(self, p1: Punto, p2: Punto):
        self.p1 = p1
        self.p2 = p2

    def __str__(self):
        return f"Línea de {self.p1} a {self.p2}"

    def dibuja_linea(self, ax):
        ax.plot([self.p1.x, self.p2.x], [self.p1.y, self.p2.y], 'b-', label="Línea")  # Azul

# Clase Círculo
class Circulo:
    def __init__(self, centro: Punto, radio: float):
        self.centro = centro
        self.radio = radio

    def __str__(self):
        return f"Círculo con centro en {self.centro} y radio {self.radio}"

    def dibuja_circulo(self, ax):
        circulo = plt.Circle((self.centro.x, self.centro.y), self.radio, color='r', fill=False, label="Círculo")  # Rojo
        ax.add_patch(circulo)

# Configurar puntos, línea y círculo
p1 = Punto(0, 3)
p2 = Punto(4, 6)
l = Linea(p1, p2)
c = Circulo(p1, 3.0)

fig, ax = plt.subplots()
ax.set_aspect('equal')
ax.set_xlim(-5, 10)
ax.set_ylim(-5, 10)

l.dibuja_linea(ax)
c.dibuja_circulo(ax)

ax.plot(p1.x, p1.y, 'ko', label=f"P1 {p1}")  # Punto negro
ax.plot(p2.x, p2.y, 'ko', label=f"P2 {p2}")


ax.grid()
ax.axhline(0, color='black', linewidth=0.5)  # Eje X
ax.axvline(0, color='black', linewidth=0.5)  # Eje Y
ax.legend()
plt.title("Gráfica de Línea y Círculo")

plt.show()

