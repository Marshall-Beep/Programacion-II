import math

class Punto:
    def __init__(self, x, y):
        self.x = float(x)
        self.y = float(y)

    def coord_cartesianas(self):
        return (self.x, self.y)

    def coord_polares(self):
        r = math.sqrt(self.x**2 + self.y**2)
        theta = math.atan2(self.y, self.x)
        return (r, theta)

    def toString(self):
        return "Punto(" + str(self.x) + ", " + str(self.y) + ")"

# Prueba de escritorio
p = Punto(3, 4)
print(p.toString())  
print("Coordenadas Cartesianas:", p.coord_cartesianas())  
print("Coordenadas Polares:", p.coord_polares())  
