Diagrama Naves&Figuras

A continuacion presento mi diagrama relacionado con el desarrollo de mi juego Naves&Figuras, con sus respectivas clases, atributos y métodos.
DIAGRAMA:
![Naves Figuras](https://github.com/user-attachments/assets/e0bd7bfd-b6aa-4be0-a280-854cb2b5afba)

DESCRIPCIÓN:
El juego que he realizado trata de una nave cuyo proposito es llegar a la mayor cantidad de puntos posibles sin perder sus vidas,destruyendo meteoritos y evitando que choquen
en el, mientras mas metoritos eliminen mas puntos tendras y por cada meteorito que choque con la nave es una vida menos.
![image](https://github.com/user-attachments/assets/0dcfea63-213d-495d-bcaa-0f5759019eff)


CLASES:


Coordenada
- Atributos:
  
  x: float

  y: float
  
- Métodos:
  
  getX()

  getY()

  setY(int y)

  setX(int x)

  suma(Coordenada)


Circulo

-Atributos:
  
  radio: float
-Métodos:
  
  getRadio()
  
  setRadio(float radio)
  
  getCentro()


Rectangulo

-Atributos:

  lado1: float
  
  lado2: float

-Métodos:

  getLado(int lado)


Triangulo

-Atributos:

  cor1: Coordenada
  
  cor2: Coordenada
  
  bala: ArrayList

-Métodos:

  setVrice(Coordenada nva, int Lado)
  
  Mover(Coordenada)


CirculoGrafico

-Atributos:

  color: Color

-Métodos:

  setColor()
  
  dibujar()


RectanguloGrafico

-Atributos:

  color: Color

-Métodos:

  setColor()
  
  dibujar()
  
  Ciclo()


TrianguloGrafico

-Atributos:

  color: Color

-Métodos:

  dibujar()
  
  Bala(CirculoGrafico)
  
  Ciclo()


TextoGrafico

-Atributos:

  s: String
  
  color: Color
  
  tamaño: int

-Métodos:

  setTexto(String)
  
  borrarTexto()
  
  PintarTexto()
  
  setTamaño(int)
  
  getTamaño()


PanelFG

-Atributos:

  v: ArrayList<Dibujable>
  
  ast: ArrayList<RectanguloGrafico>
  
  movimientoIzq: Coordenada
  
  movimientoDer: Coordenada
  
  ContadorAsteroides: int
  
  puntos: TextoGrafico
  
  vidas: TextoGrafico

-Métodos:

  paintComponent()
  
  teclaPresionada()
  
  teclaEscrita()
  
  refPuntos(TextoGrafico)
  
  refVidas(TextoGrafico)
  
  Colision()
  
  +refNave(TrianguloGrafico)
  
  +refAst(RectanguloGrafico)


Ventana

  Una clase aparentemente sin atributos o métodos detallados.


<Interface> Dibujable

-Método:

  dibujar()

RELACIONES:
-Las clases Circulo, Rectangulo y Triangulo parecen heredar de la clase Coordenada.

-CirculoGrafico, RectanguloGrafico, y TrianguloGrafico están asociadas con Circulo, Rectangulo, y Triangulo, respectivamente, y tienen una relación de 1 a muchos con PanelFG.

-TextoGrafico está relacionado con PanelFG, probablemente para mostrar puntos y vidas.

-La clase PanelFG se relaciona con Ventana, que parece ser el contenedor principal del proyecto.

FUNCIONALIDAD:
-Para la funcionalidad del juego en casode que quiera obtenerlo es necesario clonar el repostorio presente, luego dirigirse a la carpeta 'src', dentro existen dos paquete o carpetas
Ejecuciones y Modelo, el cual dentro de modelo esta la clase main, preferiblemente en el IDE netbeans ejecute dicha clase y se ejecutara el juego.

TECLAS DE FUNCIONALIDAD:
-Q: diparo de la nave

-Derecha'→' e Izquierda'←': movimiento nave derecha e izquierda.


JUEGO
![image](https://github.com/user-attachments/assets/c2bc5016-2876-4d96-868a-bb201fd5d79d)

![image](https://github.com/user-attachments/assets/3bb473fc-534b-4f4c-8f47-1b93a6eb3bd6)

![image](https://github.com/user-attachments/assets/a38dbfdc-ae3b-471a-b84c-ae13e7bcb4fc)


