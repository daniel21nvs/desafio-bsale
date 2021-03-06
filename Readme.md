# Desafío Bsale
## 

 El ejercio propone desarrollar una página web para una tienda online, generando por separado backend (API REST) y frontend, los datos de los productos deben ser consumidos desde la base de datos dispuesta por Bsale en un servidor de amazon. A demás se debe agregar un buscador a la página a través del cual se deben obtener los datos filtrados ya por el servidor):

### Para el desarrollo del ejercicio se utilizó
- Spring boot para la creación de la API REST (Backend)
- Lenguaje de programación Java (Backend)
- JPA para la interacción con la base de datos

### API REST

##### Se crearon dos API REST

- Clase ProductController
- Clase CategoriaController

#### Clase ProductController

##### Contiene 3 métodos:

- getProducts(): no recibe parámetros, obtiene todos los productos, retorna una lista de tipo Products.
- getProductsByCategory(): recibe como parametro el id de la categoría, obtiene todos los productos de una categoría, retorna lista de tipo Products.
- getProductsByName(): recibe como parametro el nombre del producto, obtiene todos los productos que contengan una palabra en su nombre, ejemplo "papas", retorna lista de tipo Products.

#### Endpoints Product
- https://bsale-desafio.herokuapp.com/api/products
No recibe parámetros, retorna un listado de objetos de tipo Product de todos los productos existentes.

- https://bsale-desafio.herokuapp.com/api/products{id}
Recibe el id (int) de la categoría como parámetro, retorna un listado de objetos de tipo Product con todos los productos filtrados por el id de la categoría indicada.

- https://bsale-desafio.herokuapp.com/api/products{name}
Recibe un nombre (String) como parámetro, retorna un listado de objetos de tipo Product con todos los productos cuyo nombre contenga el texto indicado en el parámetro 

#### Clase CategoriaController

##### Contiene 1 método:

- getCategories(), obtiene todas las categorias, retorna una lista de tipo Gategory

#### Endpoints Category
- https://bsale-desafio.herokuapp.com/api/categories
No recibe parámetros, retorna un listado de objetos de tipo Category de todas las categorías existentes.

Link ejercicio (Frontend): https://desafiobsale.web.app/
Backend (API): https://bsale-desafio.herokuapp.com/
##### Link GitHub:
- (Backend): https://github.com/daniel21nvs/desafio-bsale
- (Frontend): https://github.com/daniel21nvs/desafiobsale_front

