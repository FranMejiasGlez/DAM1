# Proyecto Web – Oferta Educativa del Centro [Grupo 6]

## Descripción

Este proyecto consiste en una página web destinada a mostrar la **oferta educativa** de un centro de formación profesional. Se presentan todas las **familias profesionales** y los **títulos** asociados a cada una (Grados Superiores y Másteres).

La web está desarrollada utilizando **tecnologías XML, XSLT y html**, con generación dinámica de páginas a partir de los datos estructurados en XML.

---

## Estructura del Proyecto

- **XML** (`XML_GRUPO6.xml`): contiene toda la información sobre familias profesionales, títulos, niveles (Grado Superior) y los módulos de cada uno.
  (El XML esta validado por el XSD.xsd)

## Estructura del XML (`XML_GRUPO6.xml`)

FamiliasProfesionales
└── FamiliaProfesional
    └── Titulos
        └── Titulo (atributos: Nombre, Duracion, Denominacion)
            ├── ObjetivoGeneral (varios)
            ├── CompetenciaProfesionalPersonalySocial (varios)
            └── Modulos
                └── Modulo (atributos: Codigo, Nombre, HorasAnuales, HorasSemanales, Curso)
                    └── ResultadoDeAprendizaje (varios)
                        └── CriterioDeEvaluacion (varios)

- **index.html**: página principal del sitio web, que ofrece una vista general.
- **"paginasTitulos".html**: página donde se muestran los títulos disponibles para la familia profesional "ADMINISTRACION Y MARKETING".
- **Páginas individuales de módulos**: generadas automáticamente, muestran los detalles de los módulos de cada título.

---

## Tecnologías Utilizadas

- **XML** para estructurar la información educativa.
- **XSLT** para transformar el XML en HTML.
- **XPath** para realizar consultas sobre el documento XML.
- **HTML/CSS** para la maquetación y el diseño de las páginas.

---

## Funcionamiento

1. Toda la información se almacena en un único archivo XML.
2. Se han creado hojas de estilo XSLT que:
   - Transforman y presentan los títulos por familia profesional.
   - Generan páginas específicas para cada módulo de los títulos.
3. Las transformaciones se realizan mediante consultas **XPath** cuidadosamente diseñadas y recogidas en el archivo `./Datos/Consultas.notebook`.

---

## Archivos Principales

- `XML_GRUPO6.xml`: base de datos del sitio.
- `*.xslt`: hojas de estilo XSLT para generar HTML.
- `*.html`: páginas resultantes de la transformación.
- `*.css`: stylesheet para maquetar y mejorar el diseño de los archivos html.


---

## Autoría

Proyecto realizado por **[Grupo 6]**, como parte del proyecto para la **formacion DUAL**.
```
