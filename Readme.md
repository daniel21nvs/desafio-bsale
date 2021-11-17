# Desafío Bsale
## 

 El ejercio propone desarrollar una página web para una tienda online, generando por separado backend (API REST) y frontend, los datos de los productos deben ser consumidos desde la base de datos dispuesta por Bsale en un servidor de amazon. A demás se debe agregar un buscador a la página a través del cual se deben obtener los datos filtrados ya por el servidor):

### Para el desarrollo del ejercicio se utilizó
- Spring boot para la creación de la API REST (Backend)
- Lenguaje de programación Java (Backend)
- JPA para la interacción con la base de datos
- HTML5, CSS y Javascript (Frontend)


### API REST

##### Se crearon dos API REST

- Clase ProductController
- Clase CategoriaController

#### Clase ProductController

##### Contiene 3 métodos:

- getProdcuts(): no recibe parámetros, obtiene todos los productos, retorna una lista de tipo Products.
- getProductsByCategory(): recibe como parametro el id de la categoría, obtiene todos los productos de una categoría, retorna lista de tipo Products.
- getProductsByName(): recibe como parametro el nombre del producto, obtiene todos los productos que contengan una palabra en su nombre, ejemplo "papas", retorna lista de tipo Products.

#### Clase CategoriaController

##### Contiene 1 método:

- getCategories(), obtiene todas las categorias, retorna una lista de tipo Gategory


### FrontEnd

##### Se crea una vista, la cual se compone de:

- Un buscador acompañando de un botón para ejecutar la búsqueda de productos por nombre.
- Un campo de selección para filtrar los productos por categoría

Link ejercicio: https://bsale-desafio.herokuapp.com/
Link GitHub: https://github.com/daniel21nvs/desafio-bsale
