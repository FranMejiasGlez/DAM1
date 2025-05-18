<?xml version="1.0" encoding="UTF-8"?>


<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>

    <xsl:template match="/">
        <xsl:variable name="codigoModulo" select="'0930'"></xsl:variable>
        <xsl:variable name="codigoTitulo" select="3"></xsl:variable>
        <html>

            <head>
                <meta charset="utf-8"/>
                <meta name="viewport" content="width=device-width, initial-scale=1"/>
                <link rel="stylesheet" href="../stylesheet3.css"/>
                <link
                    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css"
                    rel="stylesheet"/>
                <script
                    src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js">
                </script>
                <title> 
                    <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/@Nombre"></xsl:value-of>
                </title>
            </head>

            <body>
                <div class="header">
                    <div class="logo-header">
                        <img src="../img/eusa2021.jpg" alt="Eusa Campus Camara Sevilla"
                             width="222px" height="79px"/>
                    </div>
                    <ul>
                        <li class="links-header">
                            <br></br>
                            <a>
                                <strong>Servicios socioculturales y a la
                                    comunidad</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Informática y videojuegos</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Administración, marketing y comercio</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Imagen y Sonido</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Hosteleria y turismo</strong>
                            </a>
                        </li>
                        <li class="links-header">
                            <a>
                                <strong>Actividades Físicas y Deportivas</strong>
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="header2">
                    <h5> CENTRO FP SUPERIOR DE LA CÁMARA DE COMERCIO DE SEVILLA</h5>

                </div>
                <div class="header3">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
                <div class="header4">
                    <h2>
                        <xsl:value-of select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/@Nombre"></xsl:value-of>
                    </h2> <!--XPATH-->
                </div>
                <ul style="margin-right:8%">
                    <div class="contenedor-curso ">
                        <div class="contenedor"
                             style="height:300px;width: 350px;background-color: rgb(0, 0, 114);display:flex;flex-direction:column;justify-self: center;border-radius: 10%; ">
                            <div class="contenedor-curso">
                                <div class="naranja"
                                     style="background-color: #ea9c00;flex:1;border-radius: 999px;margin-top:-5%;margin-left: 5%;margin-right: 5%;font-size: 23px;align-content: center;text-align: center;font-weight: bold;color: white;padding-top: 5%;height: 80px;width:315px">
                                    <p>Modulos requeridos</p>
                                </div>
                            </div>
                            <div class="contenedor-acordeon" style="flex:2;">
                                <div class="accordion rounded-pill" id="contenedor-acordeon"
                                     style="background-color: #0195db; width: 280px; margin-top: -5%; justify-self: center;">
                                    <div class="accordion-item rounded-5 mb-2"
                                         style="border:none; ">
                                        <h2 class="accordion-header"
                                            id="headingcontenedor-acordeon"
                                            style="border-radius: 40px;">
                                            <button class="accordion-button rounded-pill"
                                                    type="button" data-bs-toggle="collapse"
                                                    data-bs-target="#collapseZero"
                                                    style="background-color:#0195db;color:#ffffff ;font-size:15px;font-weight: bold;">
                                                Modulos requeridos
                                            </button>
                                        </h2>
                                        <div id="collapseZero"
                                             class="accordion-collapse collapse"
                                             data-bs-parent="#contenedor-acordeon">
                                            <div class="accordion-body">
                                               <i>No hay informacion</i>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="objetivosgenerales">
                            <div class="accordion rounded-5" id="competenciageneral"
                                 style="background-color: #0195db; max-width: 550px;">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingOne">
                                        <button class="accordion-button rounded-5  "
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseOne"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                            Contenidos Básicos
                                        </button>
                                    </h2>
                                    <div id="collapseOne"
                                         class="accordion-collapse collapse "
                                         data-bs-parent="#accordionExample">
                                        <div class="accordion-body" style="font-size:13px;">
                                            <br/>
                                            Evaluación de las oportunidades de mercado de una empresa:
                                            <br/>
                                            - Concepto y contenido del marketing.
                                            <br/>
                                            - Funciones del marketing en la economía.
                                            <br/>
                                            - El marketing en la gestión de la empresa.
                                            <br/>
                                            - Tipos de marketing.
                                            <br/>
                                            - Marketing estratégico. Análisis de las oportunidades de mercado.
                                            <br/>
                                            - Estrategias de segmentación del mercado.
                                            <br/>
                                            - Marketing operativo. Las variables de marketing-mix.
                                            <br/>
                                            - Definición y desarrollo de las políticas de marketing-mix.
                                            <br/>
                                            - Marketing de servicios.
                                            <br/>
                                            Definición de la política de producto o servicio:
                                            <br/>
                                            - El producto como instrumento de marketing. Características y atributos. Tipos de productos.
                                            <br/>
                                            - La dimensión del producto.
                                            <br/>
                                            - El ciclo de vida del producto.
                                            <br/>
                                            - La política del producto. Objetivos.
                                            <br/>
                                            - Análisis de la cartera de productos, servicios o marcas.
                                            <br/>
                                            - Estrategias en política de productos.
                                            <br/>
                                            - Creación y lanzamiento de nuevos productos.
                                            <br/>
                                            - Diversificación de productos.
                                            <br/>
                                            - La diferenciación del producto o servicio.
                                            <br/>
                                            - La marca. Finalidad y regulación legal. Tipos de marcas. Estrategias.
                                            <br/>
                                            - Imagen y posicionamiento de productos, servicios y marcas.
                                            <br/>
                                            - Elaboración de informes sobre productos, utilizando herramientas informáticas.
                                            <br/>
                                            Definición de la política de precios:
                                            <br/>
                                            - El precio del producto como instrumento de marketing.
                                            <br/>
                                            - Componentes del precio de un producto o servicio.
                                            <br/>
                                            - El proceso de fijación de precios. Factores que influyen en el mismo.
                                            <br/>
                                            - Política de precios. Objetivos.
                                            <br/>
                                            - Normativa legal en materia de precios.
                                            <br/>
                                            - Métodos de fijación de precios: basados en los costes, en la competencia y en la demanda de mercado.
                                            <br/>
                                            - Estrategias en política de precios.
                                            <br/>
                                            - Estrategias de precios psicológicos.
                                            <br/>
                                            - Cálculo de los costes y determinación del precio de venta de un producto, utilizando la hoja de cálculo.
                                            <br/>
                                            - Elaboración de informes sobre precios, utilizando herramientas informáticas adecuadas.
                                            <br/>
                                            Selección de la forma y canal de distribución:
                                            <br/>
                                            - La distribución comercial como instrumento de marketing.
                                            <br/>
                                            - Canales de distribución. Concepto, estructura y tipos.
                                            <br/>
                                            - Los intermediarios comerciales. Funciones y tipos de intermediarios.
                                            <br/>
                                            - Política de distribución. Objetivos.
                                            <br/>
                                            - Factores que condicionan la elección de la forma y el canal de distribución.
                                            <br/>
                                            - Métodos de venta: venta tradicional, autoservicio y venta sin tienda, entre otras.
                                            <br/>
                                            - Formas comerciales de distribución: comercio independiente, asociado e integrado.
                                            <br/>
                                            - Estrategias de distribución. Relación del fabricante con la red y los puntos de venta.
                                            <br/>
                                            - Formas y contratos de intermediación comercial.
                                            <br/>
                                            - Contrato de franquicia.
                                            <br/>
                                            - Los costes de distribución: estructura y cálculo.
                                            <br/>
                                            - Elaboración de informes sobre distribución utilizando aplicaciones informáticas.
                                            <br/>
                                            Selección de las acciones de comunicación:
                                            <br/>
                                            - El proceso de comunicación comercial. Elementos básicos.
                                            <br/>
                                            - El mix de comunicación: tipos y formas.
                                            <br/>
                                            - Políticas de comunicación.
                                            <br/>
                                            - La publicidad.
                                            <br/>
                                            - La promoción de ventas.
                                            <br/>
                                            - Relaciones públicas.
                                            <br/>
                                            - Marketing directo.
                                            <br/>
                                            - Marketing relacional.
                                            <br/>
                                            - El merchandising.
                                            <br/>
                                            - La venta personal.
                                            <br/>
                                            - Marketing online.
                                            <br/>
                                            - Elaboración de informes sobre política de comunicación, utilizando aplicaciones informáticas.
                                            <br/>
                                            Elaboración de briefings de productos, servicios o marcas:
                                            <br/>
                                            - El briefing de un producto o servicio: objetivos y finalidad.
                                            <br/>
                                            - Estructura del briefing.
                                            <br/>
                                            - Elementos e información que lo componen.
                                            <br/>
                                            - Elaboración de un briefing utilizando aplicaciones informáticas.
                                            <br/>
                                            Elaboración del plan de marketing:
                                            <br/>
                                            - La planificación de marketing: finalidad y objetivos.
                                            <br/>
                                            - El plan de marketing: características, utilidades y estructura.
                                            <br/>
                                            - Análisis de la situación: análisis interno y externo. Análisis DAFO.
                                            <br/>
                                            - Establecimiento de los objetivos generales y de marketing.
                                            <br/>
                                            - Elección de las estrategias de marketing.
                                            <br/>
                                            - Acciones y políticas del marketing-mix. Relación entre ellas.
                                            <br/>
                                            - Presupuesto.
                                            <br/>
                                            - Ejecución y control del plan de marketing.
                                            <br/>
                                            - Redacción y presentación del plan de marketing, utilizando las aplicaciones informáticas.
                                            <br/>
                                            - El plan de marketing para los servicios.
                                            <br/>
                                            Seguimiento y control de las políticas y acciones del plan de marketing:
                                            <br/>
                                            - Seguimiento y control de las acciones del plan de marketing.
                                            <br/>
                                            - Cálculo de los ratios de control más habituales, utilizando hojas de cálculo.
                                            <br/>
                                            - Cálculo de las desviaciones producidas y propuesta de medidas correctoras.
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="competenciaspps">
                            <div class="accordion rounded-5" id="competenciaspps"
                                 style="background-color: #0195db; max-width: 550px; margin-top: 10%;">
                                <div class="accordion-item rounded-5 mb-2">
                                    <h2 class="accordion-header" id="headingTwo">
                                        <button class="accordion-button rounded-5"
                                                type="button" data-bs-toggle="collapse"
                                                data-bs-target="#collapseTwo"
                                                style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                            Objetivos Generales
                                        </button>
                                    </h2>
                                    <div id="collapseTwo"
                                         class="accordion-collapse collapse"
                                         data-bs-parent="#accordionExample">
                                        <div class="accordion-body">
                                           
                                            <p style="font-size:13px;">
                                                La formación del módulo contribuye a alcanzar los objetivos generales b), o), p), q), r), s), t), u), v), w) y x) del ciclo formativo, y las competencias b), l), m), n), ñ), o), p), q) y r) del título.
                                            </p>
                                             
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </ul>
                <div class="contenedor-ResultadosAprendizaje">
                    <div class="resultado">
                        <p>Resultados</p>
                    </div>
                    <ul style="margin-left: 12%;">
                        <xsl:for-each select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/ResultadoDeAprendizaje">
                            <xsl:variable name="idAc" select="position()" />
                            <xsl:variable name="idResultado" select="@Codigo"/>
                            <br></br>
                            <div class="ra">
                                <div class="accordion rounded-5" id="accordion2{$idAc}"
                                     style="background-color: #0195db; max-width: 550px;">
                                    <div class="accordion-item rounded-5 mb-2">
                                        <h2 class="accordion-header" id="heading{$idAc}">
                                            <button class="accordion-button rounded-5  "
                                                    type="button" data-bs-toggle="collapse"
                                                    data-bs-target="#collapse{$idAc}"
                                                    style="background-color:#0195db;color:#ffffff ;font-size: 23px;font-weight: bold;align-items: center;justify-content: center;">
                                                  
                                                <xsl:value-of select="@Codigo"></xsl:value-of> - <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                
                                            </button>
                                        </h2>
                                        <div id="collapse{$idAc}"
                                             class="accordion-collapse collapse"
                                             data-bs-parent="#accordion2{$idAc}">
                                            <div class="accordion-body">
                                                <xsl:for-each select="//Titulos/Titulo[$codigoTitulo]/Modulos/Modulo[@Codigo=concat($codigoModulo,'')]/ResultadoDeAprendizaje[@Codigo=concat($idResultado,'')]/CriterioDeEvaluacion">
                                                    <li style="list-style:none;text-decoration:none;font-size:13px;">
                                                        <b>Codigo: </b> 
                                                        <xsl:value-of select="@Codigo"></xsl:value-of> 
                                                        <br></br>
                                                        <b>Descripcion: </b> 
                                                        <xsl:value-of select="@Descripcion"></xsl:value-of>
                                                    </li>
                                                </xsl:for-each>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                            <br></br>
                        </xsl:for-each>
                    </ul>
                </div>
                <div class="footer">
                    <div class="logoFooter">
                        <img src="../img/logoCampusCamara.png"
                             alt="logo Centro FP SUPERIOR" width="218px"
                             height="78px"
                             class="imagen"/>
                    </div>
                    <div class="redes">
                        <img src="../img/icons8-instagram-50.png"
                             alt="Instagram"/>
                        <img src="../img/icons8-youtube-50.png" alt="Youtube"/>
                        <img src="../img/logo-de-facebook.png" alt="Facebook"
                             width="50px" height="50px"/>
                    </div>
                    <div class="contacto">
                        <ul
                            style="align-content: center;list-style-type: none;">
                            <li>
                                <img src="../img/correo-electronico.png"
                                     alt="Correo Electrónico"/>
                                <p
                                    style="color:white;font-size:20px">info@fpcampuscamara.es</p>
                            </li>
                            <li>
                                <img src="../img/llamada.png" alt="Teléfono"/>
                                <p style="color:white;font-size:20px">954238797</p>
                            </li>
                        </ul>
                    </div>
                </div>
            </body>

        </html>
    </xsl:template>

</xsl:stylesheet>
